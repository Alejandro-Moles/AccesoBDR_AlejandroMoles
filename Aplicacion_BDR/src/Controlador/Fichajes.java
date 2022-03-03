
package Controlador;

import static Controlador.Conexion.conexion;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Fichajes {
   //me creo un formato para la fecha
   private SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
   //me creo un Statement
   private Statement st;
   
   //metodo que realiza la insertacion de fichajes o la actualizacion
   public int insertarFichajes(String Dni, String fecha) throws ParseException{
       try {
           //llamo al metodo InsertUpdate pasandolo como parametro el DNI
           int comprobacion= IsertUpdate(Dni);
           //calculo el idfichaje que se tiene que poner al insertar           
           int contador = comprobarFichajes(Dni) + 1;
           
           //si InsertUpdate me ha devuelto - 1 ejecuta esto
           if(comprobacion == -1){
                //creo una sentencia, que será la que ejecutare para insertar los datos en la tabla fichajes
                String sentencia = "INSERT INTO fichajes VALUES("+contador+",'"+Dni +"' ,TO_DATE('"+fecha+"','dd/MM/yyyy hh24:mi'),null)";
                //creo un prepareStatement y le asigno la conexion y la sentencia
                PreparedStatement ps = conexion.prepareStatement(sentencia);
                //ejecuto la sentencia
                int numReg = ps.executeUpdate();
                //cierro el preparedstatement
                ps.close();
                return 0;
           }else{
               //me creo una sentencia que sera la que actualice los datos de la tabla fichajes
               String sentencia = "UPDATE FICHAJES SET FECHORAFIN = TO_DATE('"+fecha+"','dd/MM/yyyy hh24:mi') WHERE IDFICHAJE = " +comprobacion;
               //creo un prepareStatement y le asigno la conexion y la sentencia
               PreparedStatement ps = conexion.prepareStatement(sentencia);
               int numReg = ps.executeUpdate();
               return 1;
           }
       } catch (SQLException ex) {
           return 2;
       }
   }

   //metdodo que saca el idfichaje cada vez que se crea un nuevo fichaje
   public int comprobarFichajes(String Dni){
       try {
           //sentencia que se ejecutara con el ResultSet
           String select = "SELECT MAX(IDFICHAJE) FROM FICHAJES";
           //instancio el statement y creo el resulset
           st = conexion.createStatement();
           ResultSet rs = st.executeQuery(select);
           rs.next();
           //recojo el id
           int id = rs.getInt(1);
           st.close();
           return id;
       } catch (SQLException ex) {
           return 0;
       } 
   }
   
   //metodo que compruebe mediante una sentencia el idfichaje de la tabla fichajes donde la fecha de salida es null
   public int IsertUpdate(String Dni){
       try {
           String sentencia = "SELECT IDFICHAJE FROM FICHAJES WHERE DNI = '" +Dni+"' AND FECHORAFIN IS NULL";
           st = conexion.createStatement();
           ResultSet rs = st.executeQuery(sentencia);
           rs.next();
           //me devuelve el id fichaje donde es null
           return rs.getInt(1);
           //si me devuelve un numero, quiere decir que el id fichaje con el dni que le he pasado se le puede insertar una fecha de salida, por lo que 
           //se tendra que hacer un update
       } catch (SQLException ex) {
           //si no se puede ralizar la sentencia me devuelve -1
           //si devuelve -1 quiere decir que no hay un fichaje con el dni y con fecha de salida igual a null, por lo que en este caso se tendrá que hacer un insert
           return -1;
       }
       
   }
   

}
