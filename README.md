# AccesoBDR_AlejandroMoles
Programa realizado por Alejandro Moles Hurtado:

El programa que he realizado funciona de la siguiente manera:

	Programa 1 : Es una ventana que controla la entrada y salida de los empleados de una empresa, en la ventana se muestra una caja de texto en la que cada empleado indica su dni, una
		     vez inscito el Dni, se rellenara una tabla de la base de datos llamada Fichajes, con el Dni, el nombre asociado a ese Dni, la fecha de entrada y la fecha de salida
		     estas ultimas se calculan dentro del programa mediante diferentes metodos. Tanto la fecha de entrada como la de salida son tanto el dia, mes,año como la hora actual
		     Cuando se inserta el mismo dni por segunda vez, se actualizara el campo FECHORAFIN con la nueva fecha en la que se ha insertado de nuevo el Dni
		     despues de eso,saltara un disparador de la base de dtaos que rellenará la tabla horas con datos obtenidos. Al inicio de la aplicacion, se 
		     intentará conectar a la base de datos, en caso de que no se pueda , saltara un mensaje de error y no se iniciará la actividad.
		     El programa contara con un reloj digital, el cual se mostrara en un label y el cual se podrá cambiar de formato 24h a formato 12h mediante un boton.
		     Despues de que se actualice la tabla
	
	
	Programa 2 : EL segundo programa es una ventana en la que apareceran varios paneles en los que se ejcutaran diferentes operaciones. El primer panel es el panel en el que se
		     insertaran datos. Este panel contiene un choice con una lista de las tablas de las que se pueden insertar datos, en mi caso serian (Empleados, Nominas, Festivos)
		     cuando elecciones una tabla para insertar los datos, se te abrira un JDialog con los campos necesarios parainsertar en dicha tabla. Cuando se le de al boton insertar 
		     de ese JDialog, se rellenara en un textField del panel principal con la sentencia insert completa.
		     
		     El siguiente panel es el de borrar, este panel tiene un choice que mostrara una lista de las tablas de las que se puede borrar datos, una vez seleccionada una tabla
		     en un combobox apareceran un listado de las columnas de dicha tabla, una vez seleccionada la columna, en otro combobox apareceran los operadoers dependiendo del tipo
		     de la columna de la tabla. Tambien habra un textfield en el que se insertara un valor para hacer la consulta delete. Cuando se pierde al foco del campo Valor, se
		     rellenará en otro textfield la sentencia, si no se ha seleccionado ningun valor por defecto se pondra (DELETE FROM "NOMBRE TABLA"). Al presionar el boton borrar se
		     ejecutara la sentencia que esta en el textfield de la consulta

		     El siguiene panel es el de modificar, cuyo funcionamiento es similar al de insertar, tendra el choice con el nombre de las tablas(Empleados, Nominas, Fichajes), y al
		     seleccionar una se abrira la ventana, en la que aparecera otro chooser con el nombre de las columnas y un campo para que pongas el Dni del que quieres modificar los
		     datos(en caso de Fichajes pedira el IDFICHAJE). Luego pondras el valor de la columna que quieres modificar, que es la que has seleccionado en el chooser.
		     Finalmente al darle en modificar se rellenara el textfield con la sentencia update. Y al darle a ejecutar se ejecutara la sentencia que se encuentra en el textfield

		     El proximo panel es el panel de consultar datos, en este, se podran consultar datos de todas las tablas, insertando primero en un chooser el nombre de las tablas, 
		     luego en otro el nombre de las columnas, el otro el operador que quieras, y en un textfield pondras los datos que quieres para hacer la consulta select. Se rellenara 
		     un textfield con la consulta select cuando se pierda el focus del textfield del valor. Si no se selcciona ningun valor se pondra una conculta select por defecto en la 
		     que se mostrara todos los datos de esa tabla

		     El ultimo panel consite en un panel para la creacion de nominas. Al ingresar en dicho panel, se mostrara en una tabla todas las nominas que ya han sido creadas.
		     Se mostraran dos textfield en los que se tendran que insertar el año y el mes de los que se quieren crear nominas, y una vez insertados y pulsado el boton generar
		     se generararn las nominas y se mostraran en la tabla.

	             Cuando se generan las columnas en el combobox, de las tablas. A veces se muesran los nombres de todas las columnas y luego se vuelven a repetir.

		     En el codigo del programa estan explicados todos los metodos y el funcionamiento interno en comentarios


		     El codigo del trigger que se lanza esta en un archivo con extension .sql


 
