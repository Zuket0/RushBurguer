/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.util.ArrayList;
import modelo.Usuario;

/**
 *
 * @author USER
 */
public interface UsuarioInterface extends GuiaInterface<Usuario>{
    public Usuario logeo(String login, String pass);
}
