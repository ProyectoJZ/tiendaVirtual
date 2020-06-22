package tienda_virtual;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

public class BBDDLIVE{
    Connection conexion;
	
    String error;
	
    /** Creamos un constructor que recibe cuatro par�metros:
        El nombre del servidor MYSQL, el del usuario, la contrase�a, 
        y las base de datos;
    */
	
    public BBDDLIVE(String host, String usuario, String pw, String base){
         try {

            /**
               * Esta l�nea crea una asociaci�n entre nuestra aplicaci�n y la
               * clase Driver que esta empaquetada en el jar de conexion;
            */
            Class.forName("com.mysql.jdbc.Driver");

            /* La conexion se obtiene con una cadena que usa
		los par�mentros que recibe el constructor
            */
                conexion = DriverManager.getConnection("jdbc:mysql://" + host + "/" + base, usuario, pw);
         } catch (ClassNotFoundException e) { //Sucede si n� se encuentra el Driver
                error = e.getMessage();
                System.out.println(e.getMessage() + 
                    ". >>> Error de Conexion 1!!");
            } catch (SQLException e) { //Sucede si la conexi�n falla;
                error = e.getMessage();
                System.out.println(e.getMessage() + 
                    ". >>> Error de Conexion 2!!");

            }
	}
		
    /* Este m�todo 	devuelve la conexion. */
    public Connection getConexion(){
        return conexion;
    }
	
    public void cierraConexion(){
	try{
            conexion.close();
            conexion=null;
	}
        catch (SQLException ex) {
            System.out.println(ex.getMessage() + 
                    ". >>> Error de Desconexion!!");
        }
    }
	
    //Este m�todo devuelve el error que impide la conexi�n
    public String getMessageError(){
 	return error;
    }
}	
