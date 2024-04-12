
package DAO;

import Interfaces.FacturaInterface;
import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Categoria;
import modelo.Factura;
import modelo.Producto;

public class FacturaDAO implements FacturaInterface {

    Connection conn;
    PreparedStatement ps;
    ResultSet rs;
    ArrayList<Factura> pc = new ArrayList<>();
    Factura fp;   

    
//Metodo para insertar una nueva factura en la base de datos
    public boolean insertar(Factura r) {
         try {
             //consulta SQL para insentar una nueva factura con el precio especificado
            String sql = "insert into factura (Precio) values (?)";
            conn = Conexion.getConexion(); //obtiene la conexion a la base de datos
            ps = conn.prepareStatement(sql); //prepara la consulta SQL
            ps.setDouble(1, r.getPrecio()); //Establece el valor del precio en la consulta
            ps.executeUpdate(); //ejecuta la consulta SQL para realizar la insercion
        } catch (SQLException ex) {
            Logger.getLogger(ProductoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean actualizar(Object r) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean eliminar(String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object listarUno(String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Object> listarTodo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean insertar(Object r) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
