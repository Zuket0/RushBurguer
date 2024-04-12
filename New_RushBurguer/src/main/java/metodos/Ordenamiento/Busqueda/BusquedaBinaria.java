/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos.Ordenamiento.Busqueda;

public class BusquedaBinaria {

    // Método de búsqueda binaria para encontrar un nombre en un arreglo ordenado
    public static boolean buscarNombre(String[] nombres, String nombreBuscado) {
        int inicio = 0;
        int fin = nombres.length - 1;

        while (inicio <= fin) {
            int medio = inicio + (fin - inicio) / 2;

            int comparacion = nombreBuscado.compareTo(nombres[medio]);

            if (comparacion == 0) {
                // El nombre fue encontrado
                return true;
            } else if (comparacion < 0) {
                fin = medio - 1;
            } else {
                inicio = medio + 1;
            }
        }

        // El nombre no fue encontrado
        return false;
    }
}