package DAO;

import Interfaces.CategoriaInterface;
import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Categoria;

public class CategoriaDAO implements CategoriaInterface{
    Connection conn; //objeto para la conexion a la base de datos
    PreparedStatement ps; //Objeto para la ejecucion de consutas sql precompiladas
    ResultSet rs; //Objeto para almacenar los resultados de las consultas
    ArrayList<Categoria> ct = new ArrayList<>(); //lista para almacenar objetos de tipo categoria
    Categoria c; //objeto de tipo categoria
    
    //metodo para obtener una categoria especifica por su codigo
    public Categoria listarUno(String codigo) {
        try {
            //Consulta SQL para obtener una categoria por su codigo
            String sql = "select * from categoria where id_categoria = "+codigo;
            conn = Conexion.getConexion(); //obtiene la conexion a la base de datos 
            ps = conn.prepareStatement(sql); //prepara la consulta sql
           
            rs = ps.executeQuery();//Ejecuta la consulta SQL y almacena los resultados en rs
            while(rs.next()){
                c = new Categoria(); //crea un objeto de tipo categoria
                //Establece los valores de la categoria a partir de los resultados de la consulta
                c.setId_categoria(rs.getInt("id_categoria"));
                c.setDescripcion(rs.getString("descripcion"));
            }            
            conn.close();//cierra la conexion a la base de datos
        } catch (SQLException ex) {
            //Manejo de excepciones en caso de errores durante la ejecucion de la consulta
            Logger.getLogger(Categoria.class.getName()).log(Level.SEVERE, null, ex);
        }
        return c; //devuelve el objeto de tipo categoria
    }

    @Override
    public boolean insertar(Categoria r) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean actualizar(Categoria r) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean eliminar(String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Categoria> listarTodo() { //metodo para obtener todas las categorias
        try {
            //consulta SQL para obtener todas las categorias
            String sql = "select * from categoria";
            conn = Conexion.getConexion();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                c = new Categoria(); //crea un objeto de tipo categoria
                c.setId_categoria(rs.getInt("id_categoria"));
                c.setDescripcion(rs.getString("descripcion"));
                ct.add(c); //Agrega la categoria a la lista
            }            
        } catch (SQLException ex) {
            Logger.getLogger(Categoria.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ct;
    }
 }

