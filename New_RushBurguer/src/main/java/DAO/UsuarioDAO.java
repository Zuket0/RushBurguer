/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Interfaces.UsuarioInterface;
import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Usuario;

/**
 *
 * @author 
 */


public class UsuarioDAO implements UsuarioInterface{
    Connection conn;
    PreparedStatement ps;
    ResultSet rs;
    ArrayList<Usuario> vu = new ArrayList<>();
    Usuario usu;    

    //metodo para insertar un nuevo usuario en la base de datos
    @Override
    public boolean insertar(Usuario u) {        
        try {
            String sql = "insert into usuario (Nombre, Login, Password, Correo) values (?, ?, ?, ?)";
            conn = Conexion.getConexion();
            ps = conn.prepareStatement(sql);
            //Establece los valores del usuario en la consulta
            ps.setString(1, u.getNombreCompleto());
            ps.setString(2, u.getLogin());
            ps.setString(3, u.getPassword());
            ps.setString(4, u.getCorreo());
            ps.executeUpdate(); //Ejecuta la consulta SQL para realizar la insercion
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    
    //metodo para actualizar un usuario en la base de datos
    @Override
    public boolean actualizar(Usuario c) {
    try {
        String sql = "update usuario set Nombre=?, Login=?, Password=?, Correo=? where Id = ?";
        conn = Conexion.getConexion();
        ps = conn.prepareStatement(sql);
        //Establece los nuevos valores del usuario en la consulta
        ps.setString(1, c.getNombreCompleto());
        ps.setString(2, c.getLogin());
        ps.setString(3, c.getPassword());
        ps.setString(4, c.getCorreo());
        ps.setInt(5, c.getIdUsuario());
        ps.executeUpdate();

    } catch (SQLException ex) {
        Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
    } 
    return false; 
}
    
    //metodo para obtener todos los usuarios
    @Override
    public ArrayList<Usuario> listarTodo() {
        try {
            String sql = "select * from usuario";
            conn = Conexion.getConexion();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                usu = new Usuario();
                usu.setIdUsuario(rs.getInt("Id"));
                usu.setNombreCompleto(rs.getString("Nombre"));
                usu.setLogin(rs.getString("Login"));
                usu.setCorreo(rs.getString("Correo"));
                vu.add(usu);
            }            
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return vu;
    }


//metodo para realizar el login, comprobando si existe un usuario con las credenciales
    @Override
    public Usuario logeo(String login, String pass) {
        try {
            String sql = "select * from usuario WHERE Login = ? AND Password = ? ";
            conn = Conexion.getConexion();
            ps = conn.prepareStatement(sql);
            ps.setString(1, login);
            ps.setString(2, pass);
            rs= ps.executeQuery();
            while(rs.next()){
                usu = new Usuario();
                usu.setIdUsuario(rs.getInt("Id"));
                usu.setNombreCompleto(rs.getString("Nombre"));
                usu.setLogin(rs.getString("Login"));
                usu.setPassword(rs.getString("Password"));
                usu.setCorreo(rs.getString("Correo"));
            }            
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return usu;
    }
    
//Metodo para eliminar un usuario de la base de datos por su nombre de usuario
    @Override
    public boolean eliminar(String login) {
        try {
            String sql = "delete from usuario where Login = ?";
            conn = Conexion.getConexion();
            ps = conn.prepareStatement(sql);
            ps.setString(1, login);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    //metodo para obtener un usuario especifico por su nombre de usuario
    @Override
    public Usuario listarUno(String login) {
        try {
            //Consulta SQL para obtener un usuario por su nombre de usuario
            String sql = "SELECT * FROM usuario WHERE Login = ?";
            conn = Conexion.getConexion();
            ps = conn.prepareStatement(sql);//prepara la consulta SQL
            ps.setString(1, login);//Establece el valor del nombre de usuario en la consulta 
            rs = ps.executeQuery();
            while(rs.next()){
                usu = new Usuario(); //Crea un objeto de tipo usuario
                //Establece los valores del usuario a partir de los resultados de la consulta
                usu.setIdUsuario(rs.getInt("Id"));
                usu.setNombreCompleto(rs.getString("Nombre"));
                usu.setLogin(rs.getString("Login"));
                usu.setPassword(rs.getString("Password"));
                usu.setCorreo(rs.getString("Correo"));
               
            }            
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return usu;
    }

    public boolean existeNombre(String nombre) {
    boolean existe = false;
    Connection conn = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;

    try {
        // Establecer la conexión a la base de datos
        conn = Conexion.getConexion();

        // Consulta SQL para verificar si el nombre existe en la tabla de usuarios
        String sql = "SELECT COUNT(*) FROM usuario WHERE nombre = ?";
        stmt = conn.prepareStatement(sql);
        stmt.setString(1, nombre);
        rs = stmt.executeQuery();

        // Si hay algún resultado, significa que el nombre existe
        if (rs.next()) {
            int count = rs.getInt(1);
            existe = (count > 0);
        }
    } catch (SQLException e) {
        e.printStackTrace();
        // Manejo de la excepción, si es necesario
    } finally {
        // Cerrar ResultSet, PreparedStatement y Connection
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (stmt != null) {
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    return existe;
}

    
}