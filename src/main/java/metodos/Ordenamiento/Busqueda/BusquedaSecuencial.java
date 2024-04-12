/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos.Ordenamiento.Busqueda;

import modelo.Usuario;

public class BusquedaSecuencial {

    
// Método de búsqueda secuencial para encontrar un nombre en un arreglo de usuarios
    public static int buscarNombre(Usuario[] usuarios, String nombreBuscado) {
        for (int i = 0; i < usuarios.length; i++) {
            if (usuarios[i].getNombreCompleto().equalsIgnoreCase(nombreBuscado)) {
                return i;
            }
        }
        return -1;
    }
}