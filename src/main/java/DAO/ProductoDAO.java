/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Interfaces.ProductoInterface;
import Interfaces.UsuarioInterface;
import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Popup;
import metodos.Ordenamiento.Busqueda.BusquedaBinaria;
import modelo.Categoria;
import modelo.Producto;
import modelo.Producto;

public class ProductoDAO implements ProductoInterface {

    Connection conn; //objeto para la conexion a la base de datos
    PreparedStatement ps; //objeto para la ejecucion de consultas sql precompiladas
    ResultSet rs; //objeto para almacenar los resultados de las consultas SQL
    ArrayList<Producto> pc = new ArrayList<>(); //Lista para almacenar objetos de tipo Producto
    Producto pu; //Objeto de tipo Producto
    ArrayList<Categoria> cp = new ArrayList<>(); //Lista para almacenar objetos de tipo Categoria
    Categoria c; //Objeto de tipo Categoria

    //Metodo para obtener todos los productos que pertenecen a una categoria especifica
    @Override
    public ArrayList<Producto> listarTodoFiltro(int i) {
        try {
            //consulta SQL para obtener todos los productos de una categoria especifica
            String sql = "select * from producto where id_categoria = " + i;
            conn = Conexion.getConexion();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                pu = new Producto(); //Crea un objeto de tipo producto
                //Establece los valores del producto a partir de los resultados de la consulta
                pu.setId_producto(rs.getInt("id_producto"));
                pu.setDescripcion(rs.getString("descripcion"));
                pu.setPrecio(rs.getDouble("precio"));
                pc.add(pu);//Agrega el producto a la lista
            }
        } catch (SQLException ex) {
            Logger.getLogger(Producto.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pc; //devuelve la lista de objetos de tipo producto
    }

    //Metodo para insetar un nuevo producto en la base de datos
    @Override
    public boolean insertar(Producto r) {
        try {
            //COnsulta SQL para insertar un nuevo producto con los valores especficados
            String sql = "insert into producto (id_producto, id_categoria, descripcion, precio) values (?, ?, ?, ?)";
            conn = Conexion.getConexion();
            ps = conn.prepareStatement(sql);
            //Establece los valores del producto en la consulta
            ps.setInt(1, r.getId_producto());
            ps.setInt(2, r.getId_Categoria().getId_categoria());
            ps.setString(3, r.getDescripcion());
            ps.setDouble(4, r.getPrecio());
            ps.executeUpdate(); //Ejecuta la consulta SQL para realizar la insercion
        } catch (SQLException ex) {
            Logger.getLogger(ProductoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    //metodo para actualizar un producto en la base de datos
    @Override
    public boolean actualizar(Producto r) {
        try {
            //Consulta SQL para actualizar un producto con los nuevos valores especificados
            String sql = "update producto set  id_categoria=?, descripcion=?, precio=? where id_producto = ?";
            conn = Conexion.getConexion(); //Obtiene la conexion a la base de datos
            ps = conn.prepareStatement(sql); //Prepara la consulta SQL
            //Establece los nuevos valores del producto en la consulta
            ps.setInt(1, r.getId_Categoria().getId_categoria());
            ps.setString(2, r.getDescripcion());
            ps.setDouble(3, r.getPrecio());
            ps.setInt(4, r.getId_producto());
            ps.executeUpdate();//Ejecuta la consulta SQL para realizar la actualizacion

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    //metodo para eliminar un producto de la base de datos
    @Override
    public boolean eliminar(String descripcion) {
        try {
            String sql = "delete from producto where descripcion = ?";
            conn = Conexion.getConexion();
            ps = conn.prepareStatement(sql);
            ps.setString(1, descripcion);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    //Metodo para obtener un producto especifico por su codigo
    @Override
    public Producto listarUno(String descripcion) {
        try {
        String sql = "SELECT * FROM producto WHERE descripcion = ?";
        conn = Conexion.getConexion();
        ps = conn.prepareStatement(sql);
        ps.setString(1, descripcion);

        rs = ps.executeQuery();

        while (rs.next()) {
            pu = new Producto();
            pu.setId_producto(rs.getInt("id_producto"));
            pu.setDescripcion(rs.getString("descripcion"));
            pu.setPrecio(rs.getDouble("precio"));
        }
    } catch (SQLException ex) {
        Logger.getLogger(Producto.class.getName()).log(Level.SEVERE, null, ex);
    }
    return pu;
    }

    //metodo para obtener todos los productos
    @Override
    public ArrayList<Producto> listarTodo() {
        try {
            String sql = "select * from producto";
            conn = Conexion.getConexion();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                pu = new Producto();
                pu.setDescripcion(rs.getString("descripcion"));
                pu.setPrecio(rs.getDouble("precio"));
                pc.add(pu);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Producto.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pc;
    }

    public boolean buscarProductoPorNombre(String nombreBuscado) {
        try {
        // Obtener todos los productos y ordenarlos por nombre
        ArrayList<Producto> productos = listarTodo();
        productos.sort(Comparator.comparing(Producto::getDescripcion));

        // Obtener los nombres de los productos ordenados en un arreglo
        String[] nombresProductos = productos.stream().map(Producto::getDescripcion).toArray(String[]::new);

        // Utilizar búsqueda binaria para buscar el nombre
        boolean encontrado = BusquedaBinaria.buscarNombre(nombresProductos, nombreBuscado);

        return encontrado;
    } catch (Exception e) {
        // Manejar excepciones según tu lógica específica
        e.printStackTrace();
        return false;
    }

    }
    

public ArrayList<Producto> listarTodosProductos() {
    ArrayList<Producto> productos = new ArrayList<>();
    try {
        String sql = "SELECT * FROM producto";
        conn = Conexion.getConexion();
        ps = conn.prepareStatement(sql);
        rs = ps.executeQuery();
        while (rs.next()) {
            Producto producto = new Producto();
            producto.setId_producto(rs.getInt("id_producto"));
            producto.setDescripcion(rs.getString("descripcion"));
            producto.setPrecio(rs.getDouble("precio"));
            
            productos.add(producto);
        }
    } catch (SQLException ex) {
        Logger.getLogger(ProductoDAO.class.getName()).log(Level.SEVERE, null, ex);
    }
    return productos;
}


// Método para obtener una categoría por su ID
public Categoria obtenerCategoriaPorId(int idCategoria) {
    Categoria categoria = null;
    try {
        String sql = "SELECT * FROM categoria WHERE id_categoria = ?";
        conn = Conexion.getConexion();
        ps = conn.prepareStatement(sql);
        ps.setInt(1, idCategoria);
        rs = ps.executeQuery();
        if (rs.next()) {
            categoria = new Categoria();
            categoria.setId_categoria(rs.getInt("id_categoria"));
            
        }
    } catch (SQLException ex) {
        Logger.getLogger(ProductoDAO.class.getName()).log(Level.SEVERE, null, ex);
    }
    return categoria;
}



    
}
