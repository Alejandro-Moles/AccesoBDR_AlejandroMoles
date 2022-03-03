
package Controlador;

import static Controlador.Conexion.conexion;
import java.sql.CallableStatement;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.logging.Level;
import java.util.logging.Logger;



public class OperacionesBD {
    
    //me creo el format para la fecha
    private SimpleDateFormat format = new SimpleDateFormat("dd-MM-YYYY");
    
    public static  Double TotalNominas;
    
    public OperacionesBD(){
        
    }
    
    //metodo que ejecuta una sentencia en la base de datos, la cual es pasada como parametro
    //me devuelve 0 si se ha realizado o 1 si ha habido un error
   public int realizarOperacion(String orden){
       try {
           PreparedStatement ps = conexion.prepareStatement(orden);
           int numReg = ps.executeUpdate();
           ps.close();
           return 0;
       } catch (SQLException ex) {
           return 1;
       }
   }
   
   //Metodo que ejecuta el procedimiento almacenado que esta en la base de dtaos
   public int ejecutarprocedimiento(int anio, int mes) throws ParseException{
        try { 
            //crea un CallableStatement, al cual se le asigna la conexion y le indicas el procedimiento que le quieres pasar
            CallableStatement cst = conexion.prepareCall("{call CREAR_NOMINAS(?,?)}");
            //le pasas los dos parametros que necesita el procedimiento
            cst.setInt(1,  anio);
            cst.setInt(2, mes);
            //lo ejecutas
            cst.execute();
            return 0;
            //devuelve 0 si se ha realizado correctamente
        } catch (SQLException ex) {
            //devuelve 1 si no se ha podido realizar el procedure
            return 1;  
        }
   }
}
