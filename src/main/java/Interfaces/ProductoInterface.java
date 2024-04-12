/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import java.util.ArrayList;
import modelo.Producto;

/**
 *
 * @author Willians
 */
public interface ProductoInterface extends GuiaInterface<Producto>{
    public ArrayList<Producto> listarTodoFiltro(int i);
}
