package app;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author kevinLeandro
 */
public class Conexion {

    static Connection getConexion() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    Connection conexion = null;
    
    String usuario = "ESCRIBE TU USUARIO";
    String contrasena = "ESCRIBE TU CONTRASEÑA";
    String db = "ESCRITBE TU BASE DE DATOS";
    String ip = "localhost";
    String puerto = "1433";
    
    public Connection obtenerConexion() {
        try{
            String cadena = "jdbc:sqlserver://localhost:"+puerto+";"+"databaseName="+db;
            conexion = DriverManager.getConnection(cadena, usuario, contrasena);
            JOptionPane.showMessageDialog(null, "Lo lograste KEVIN, CONEXION EXITOSA");
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: "+e.toString());
        }
        return conexion;
    }
    
}
