/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda_virtual;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.*;

/**
 *
 * @author Trabajo
 */
public class Conexion {

    private Statement sent = null;
    private BBDDLIVE con = null;
    private ResultSet rs = null;
    private PreparedStatement pst;
    private int resultado = 0;
    
    
     
//CONSULTA PRODUCTOS.
    
    
    public ResultSet getConsulta(String where) throws SQLException {

        con = new BBDDLIVE("localhost", "root", "", "db_tienda");
        Connection conexion = con.getConexion();

        if (conexion != null) {
            try {
                sent = conexion.createStatement();
                String consulta
                        = "SELECT idProducto, nomProducto,"
                        + "tallasProducto, precioVenta FROM Productos" + where;
                
                System.out.println(consulta);
                rs = sent.executeQuery(consulta);
    
            } catch (SQLException ex) {
                System.out.println(ex.getMessage()
                        + ". >>> Error de Obtencion de filas productos!!");
            } 
        }
        System.out.println(rs);
        return  rs;

    }
    //CONSULTA CLIENTES
    
    
    public ResultSet getConsultaDatosCliente(String where) throws SQLException {

        con = new BBDDLIVE("localhost", "root", "", "db_tienda");
        Connection conexion = con.getConexion();

        if (conexion != null) {
            try {
                sent = conexion.createStatement();
                String consulta
                        = "SELECT idCliente,nomCliente,priApellido,"
                        + "segApellido,domicilio,municipio,privincia"
                        + "distiPostal,telefono,correoElectronico,"
                        + "fchaNaci,sexo  FROM clientes" + where;
                
                System.out.println(consulta);
                rs = sent.executeQuery(consulta);
    
            } catch (SQLException ex) {
                System.out.println(ex.getMessage()
                        + ". >>> Error de Obtencion de filas de tabla cliente!!");
            } 
        }
        System.out.println(rs);
        return  rs;

    }
    
    //CONSULTA DATOS BANCO.
     
    public ResultSet getConsultaDatosBanco(String where) throws SQLException {

        con = new BBDDLIVE("localhost", "root", "", "db_tienda");
        Connection conexion = con.getConexion();

        if (conexion != null) {
            try {
                sent = conexion.createStatement();
                String consulta
                        = "SELECT idDBanco,Bic_cliente,NombreBanco,Iban_cliente,"
                        + "Fecha_caducidad  FROM datos_banco" + where;
                        
                        
                       
                
                System.out.println(consulta);
                rs = sent.executeQuery(consulta);
    
            } catch (SQLException ex) {
                System.out.println(ex.getMessage()
                        + ". >>> Error de Obtencion de filas de tabla cliente!!");
            } 
        }
        System.out.println(rs);
        return  rs;

    }
    
    
    //REGISTRO PRODUCTOS
    
    public int AltaProductos(String nom, String prod, int talla, 
            int stock, Date  fecha, float pvp, int tipo, String imagen) 
            throws SQLException {

        con = new BBDDLIVE("localhost", "root", "", "db_tienda");
        Connection conexion = con.getConexion();

        if (conexion != null) {
            try {
                sent = conexion.createStatement();
               
                /*
                String alta
                        = "INSERT INTO PRODUCTOS" 
                        + "(nomProducto,desProducto,tallasProducto,"
                        + "stockExistente, fechaStock, precioVenta,tipoProducto,"
                        + "Imagen) VALUE (?,?, ?, ?, ?, ?, ?, ?)";
                */
                
                pst = conexion.prepareStatement("INSERT INTO PRODUCTOS" 
                        + "(nomProducto,desProducto,tallasProducto,"
                        + "stockExistente, fechaStock, precioVenta,tipoProducto,"
                        + "Imagen) VALUE (?,?, ?, ?, ?, ?, ?, ?)");
                
                pst.setString(1, nom);
                pst.setString(2, prod);
                pst.setInt(3, talla);
                pst.setInt(4, stock);
                pst.setDate(5, fecha);
                pst.setFloat(6, pvp);
                pst.setInt(7, tipo);
                pst.setString(8, imagen);
                   
                System.out.println(pst);
                resultado = pst.executeUpdate();
    
            } catch (SQLException ex) {
                System.out.println(ex.getMessage()
                        + ". >>> Error de INSERCIÓN de filas productos!!");
            } 
        }
        System.out.println(rs);
        return  resultado;

    }
    
    
    // INCERTAR DATOS DEL CLIENTE A LA TABLA CLIENTE.
    
      public int AltaDatosClientes(String nom, String pap,String sap,
              String dom,String mun,String priv,int postal, 
            int telef,String correoe, Date  fnac, String sexo ) 
            throws SQLException {

        con = new BBDDLIVE("localhost", "root", "", "db_tienda");
        Connection conexion = con.getConexion();
         
        if (conexion != null) {
            try {
                sent = conexion.createStatement();
            
                
                pst = conexion.prepareStatement("INSERT INTO clientes" 
                        + "(nomCliente,priApellido,segApellido,"
                        + "domicilio,municipio,privincia,distiPostal,"
                        + "telefono,correoElectronico,fchaNaci,"
                        + "sexo) VALUE (?,?, ?, ?, ?, ?, ?, ?,?,?,?,?)");
                
               
                pst.setString(1, nom);
                pst.setString(2, pap);
                pst.setString(3, sap);
                pst.setString(4, dom);
                pst.setString(5, mun);
                pst.setString(6,priv);
                pst.setInt(7,postal );
                pst.setInt(8,telef);
                pst.setString(9,correoe);
                pst.setDate(10,fnac);
                pst.setString(11, sexo);
               
                   
                System.out.println(pst);
                resultado = pst.executeUpdate();
    
            } catch (SQLException ex) {
                System.out.println(ex.getMessage()
                        + ". >>> Error de INSERCIÓN de filas productos!!");
            } 
        }
        System.out.println(rs);
        return  resultado;

    
      } 
      
      // INSERTAR DATOS DEL BANCO A LA TABLA DATOS_BANCO
      
      
      public int AltaDatosBanco(int id,int bic,String nomB,float iban,Date fcad) 
            throws SQLException {

        con = new BBDDLIVE("localhost", "root", "", "db_tienda");
        Connection conexion = con.getConexion();

        if (conexion != null) {
            try {
                sent = conexion.createStatement();
                
                pst = conexion.prepareStatement("INSERT INTO datos_banco" 
                        + "(idDBanco,Bic_cliente,NombreBanco,Iban_cliente,"
                        + "Fecha_caducidad) VALUE (?,?, ?, ?, ?, )");
                
                pst.setInt(1, id);
                pst.setInt(2,bic );
                pst.setString(3,nomB);
                pst.setFloat(4, iban);
                pst.setDate(5, fcad);
                   
                System.out.println(pst);
                resultado = pst.executeUpdate();
    
            } catch (SQLException ex) {
                System.out.println(ex.getMessage()
                        + ". >>> Error de INSERCIÓN de filas productos!!");
            } 
        }
        System.out.println(rs);
        return  resultado;

    }
      
    //ACTUALIZAR PRODUCTOS.
    
        public int ActualizaProductos(int codPro, String nom, String prod, 
                int talla, int stock, Date  fecha, float pvp, int tipo,
                String imagen) throws SQLException {

        con = new BBDDLIVE("localhost", "root", "", "db_tienda");
        Connection conexion = con.getConexion();

        if (conexion != null) {
            try {
                sent = conexion.createStatement();
                pst = conexion.prepareStatement("UPDATE PRODUCTOS SET" 
                        + "nomProducto    = " + nom + 
                        ", desProducto    = " + prod +
                        ", tallasProducto = " + talla +
                        ", stockExistente = " + stock +
                        ", fechaStock     = " + fecha + 
                        ", precioVenta    = " + pvp +
                        ", tipoProducto   = " + tipo +
                        ", Imagen         = " + imagen+ 
                        "WHERE idProducto = " + codPro + ")");
                
                System.out.println(pst);
                resultado = pst.executeUpdate();
    
            } catch (SQLException ex) {
                System.out.println(ex.getMessage()
                        + ". >>> Error de UPDATE de filas productos!!");
            } 
        }
        System.out.println(rs);
        return  resultado;

    }
    
   
    
        
    //ACTUALIZAR CLIENTES
        
        
        public int ActualizaClientes (int codCl,String nom, String pap,String sap,
              String dom,String mun,String priv,int postal, 
            int telef,String correoe, Date  fnac, String sexo) throws SQLException {

        con = new BBDDLIVE("localhost", "root", "", "db_tienda");
        Connection conexion = con.getConexion();

        if (conexion != null) {
            try {
                sent = conexion.createStatement();
                pst = conexion.prepareStatement("UPDATE CLIENTES SET" 
                        + "nomCliente    = " + nom + 
                        ", priApellido    = " + pap +
                        ", segApellido = " + sap +
                        ", domicilio= " + dom +
                        ", municipio     = " + mun + 
                        ", privincia    = " + priv +
                        ", distiPostal   = " + postal +
                        ", telefono  = " + telef +
                        ", correoElectronico = " + correoe +
                        ", fchaNaci   = " + fnac +
                        ", sexo   = " + sexo+ 
                        "WHERE idCliente = " + codCl + ")");
              
    
            } catch (SQLException ex) {
                System.out.println(ex.getMessage()
                        + ". >>> Error de UPDATE de filas productos!!");
            } 
        }
        System.out.println(rs);
        return  resultado;

    }
      
        
    // ACTUALIZAR DATOS DEL BANCO    
     
        public int ActualizaDatosBanco(int id,int bic,String nomB,float iban,Date fcad) throws SQLException {

        con = new BBDDLIVE("localhost", "root", "", "db_tienda");
        Connection conexion = con.getConexion();

        if (conexion != null) {
            try {
                sent = conexion.createStatement();
                pst = conexion.prepareStatement("UPDATE DATOS_BANCO SET" 
                        + "Bic_cliente    = " + bic + 
                        ", NombreBanco    = " + nomB +
                        ", Iban_cliente = " + iban +
                        ", Fecha_caducidad = " + fcad + 
                        "WHERE  = idDBanco" + id + ")");
                
                System.out.println(pst);
                resultado = pst.executeUpdate();
    
            } catch (SQLException ex) {
                System.out.println(ex.getMessage()
                        + ". >>> Error de UPDATE de filas productos!!");
            } 
        }
        System.out.println(rs);
        return  resultado;

    } 
        
        
        
        
        
      //FINALIZAR  
        
         public void finalizar() throws SQLException{
        try {
          sent.close();
          con.cierraConexion();  
        } catch (Exception e) {
            System.out.println(e.getMessage()
                        + ". >>> Error de finalizar conexión!!");
        }
         
    }

    Conexion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

}
