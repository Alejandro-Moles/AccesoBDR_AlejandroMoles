
--Trigger que se usa al actualizar el campo fechafin en la tabla fichajes
CREATE OR REPLACE TRIGGER TR_FICHAJES
AFTER UPDATE OF FECHORAFIN ON FICHAJES
FOR EACH ROW
DECLARE 
  XEMPLEADO EMPLEADOS%ROWTYPE;
  XFESTIVOS FESTIVOS%ROWTYPE;
  XFECHA NUMBER;
  Htrabajadas NUMBER;
  HtrabajadasEx NUMBER;
  COMPROBACION NUMBER;
BEGIN
  SELECT * INTO XEMPLEADO FROM EMPLEADOS WHERE DNI = :NEW.DNI;
  
  --Compruebo si ya hay un registro con la fecha de salida en la tabla horas
  SELECT COUNT(*) INTO COMPROBACION FROM HORAS WHERE FECHA = :NEW.FECHORAFIN;
  --Saco las horas trabajadas
  Htrabajadas := (:new.FECHORAFIN - :NEW.FECHORAINI) * 24;
  --Si las horas trabajadas superan a las horas minimas, las demas horas a partir de las minimas son extras
  IF(Htrabajadas > XEMPLEADO.HORASMIN) THEN
    HtrabajadasEx := Htrabajadas - XEMPLEADO.HORASMIN;
  END IF;
  --si no superan a las horas minimas quiere decir que tiene 0 horas extras
  IF(Htrabajadas < XEMPLEADO.HORASMIN) THEN
    HtrabajadasEx := 0;
  END IF;
  
  --si comprobacion es 0, entonces quiere decir que no hay registros en la tabla horas donde la fecha sea igual a la fechafin
  IF(COMPROBACION = 0) THEN
    --compruebo si el dia que he pasado en un día festivo
    SELECT COUNT(*) INTO XFECHA FROM FESTIVOS WHERE FECHA = TO_CHAR(:NEW.FECHORAINI, 'dd/MM/YYYY');
    
    --si el dia en el que hago el fichaje es festivo, todas las horas que se trabajan son horas extras
    IF(XFECHA <> 0) THEN
    HtrabajadasEx := (:new.FECHORAFIN - :NEW.FECHORAINI) * 24;
      INSERT INTO HORAS VALUES (:NEW.FECHORAINI, :NEW.DNI, 0, HtrabajadasEx); 
    END IF;
    
    --si no  se calculan las horas de forma normal
    IF( XFECHA = 0) THEN
    --realizo un insert con los datos obtenidos
      INSERT INTO HORAS VALUES (:NEW.FECHORAINI, :NEW.DNI, Htrabajadas, HtrabajadasEx);
    END IF;
  END IF;
  
  --si ya habia un registro, entonces la comprobacion tendra que ser distinta de 0
  IF (COMPROBACION <> 0) THEN
    --si hay un registro, hago un update
    UPDATE HORAS SET HORAS =Htrabajadas, HORASE = HtrabajadasEx WHERE DNI = :NEW.DNI;
  END IF;
END;




--Procedimiento que nos crea las nominas de un mes pasandole como parametro una fecha
CREATE OR REPLACE PROCEDURE CREAR_NOMINAS(XANIO NUMBER, XMES NUMBER)
AS
   DATOS_NOMINA NOMINAS%ROWTYPE;--variable del mismo tipo de la tabla nominas
   DATOS_EMPLEADOS EMPLEADOS%ROWTYPE;--variable del mismo tipo de la tabla empleados
   DATOS_HORAS HORAS%ROWTYPE;--variable del mismo tipo de la tabla horas

   COMPROBACION NUMBER;
   
   --cursor que recorre la tabla horas, y saca por cada vez que recorre el Dni, la sumatoria de las Horas, y la sumatoria de las horas extras
   --donde el año es el mismo que el que se pasa por parametro, y el mes es el mismo que se pasa por parametro
   --Esta agrupado por Dni, año y mes.
   CURSOR SUMHORAS IS SELECT DNI, SUM(HORAS) AS HORAS_TOTAL, SUM(HORASE) AS HORASE_TOTAL 
   FROM HORAS WHERE TO_NUMBER(TO_CHAR(FECHA, 'YYYY')) = XANIO AND TO_NUMBER(TO_CHAR(FECHA, 'MM')) = XMES 
   GROUP BY DNI,TO_NUMBER(TO_CHAR(FECHA, 'YYYY')),TO_NUMBER(TO_CHAR(FECHA, 'MM'));
   
   DATOS SUMHORAS%ROWTYPE;
   SUELDOHORA NUMBER;
   SUELDOHORAE NUMBER;
BEGIN
  --abro el cursor
  OPEN SUMHORAS;
    LOOP--inicio el bucle
      FETCH SUMHORAS INTO DATOS;--recorro el cursor y lo voy metiendo en la variable DATOS
      EXIT WHEN SUMHORAS%NOTFOUND;--hago que se salga del bucle cuando el cursor no encuentre mas datos
      
        SELECT * INTO DATOS_EMPLEADOS FROM EMPLEADOS WHERE DNI = DATOS.DNI;--cojo los datos de la tabla empleados donde el dni es el dni que he sacado del cursor
        --Compruebo si ya hay en nominas una fila con ese año, mes y dni
        SELECT COUNT(*) INTO COMPROBACION FROM NOMINAS WHERE MES = XMES AND ANIO = XANIO AND DNI = DATOS.DNI;
        SUELDOHORA := DATOS_EMPLEADOS.PRECIOHORA * DATOS.HORAS_TOTAL;--saco el sueldo total de ese empleado
        SUELDOHORAE := DATOS_EMPLEADOS.PRECIOHORAE * DATOS.HORASE_TOTAL;--saco el sueldo por las horas extra de ese empleado
        
        --si no hay una fila de la tabla nominas ya creada entonces hago un insert
        IF(COMPROBACION = 0) THEN
          INSERT INTO NOMINAS VALUES(XANIO, XMES, DATOS.DNI, SUELDOHORA,SUELDOHORAE );
        END IF;
        --si ya hay una fila de la tabla nominas creada, entonces hago un update
        IF(COMPROBACION <> 0) THEN
          UPDATE NOMINAS SET SUELDOH = SUELDOHORA , SUELDOHE = SUELDOHORAE WHERE MES = XMES AND ANIO = XANIO AND DNI = DATOS.DNI;
        END IF;
  
    END LOOP;
  CLOSE SUMHORAS;
END;

