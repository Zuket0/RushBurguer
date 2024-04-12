package config;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class Conexion {
    private static Connection conn; //Objeto para almacenar la conexion a la base de datos
    
    //Metodo estatico para obtener una conexion a la base de datos
    public static Connection getConexion(){
        try {
            //Carga el controlador JDBC de MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //Establece la conexion con la base de datos en localhost
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rushiburguer", "root", "");
            //JOptionPane.showMessageDialog(null, "Conexion existosa");
        } catch (ClassNotFoundException | SQLException ex) {
            //manejo de excepciones
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn; //Devuelve la conexion establecida
    }
}
