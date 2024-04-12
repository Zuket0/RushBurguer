/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos.Ordenamiento.Busqueda;

import java.util.ArrayList;

import java.util.ArrayList;

public class ShellSort {
    public static void ordenarAlfabeticamente(ArrayList<String> array) {
        int n = array.size();

        // Comienza con un espacio grande y luego reduce el espacio
        for (int gap = n / 2; gap > 0; gap /= 2) {
            // Realiza la clasificación de inserción para el espacio actual
            for (int i = gap; i < n; i++) {
                String temp = array.get(i);
                int j;

                for (j = i; j >= gap && array.get(j - gap).compareTo(temp) > 0; j -= gap) {
                    array.set(j, array.get(j - gap));
                }

                array.set(j, temp);
            }
        }
    }
}
