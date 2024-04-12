/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos.Ordenamiento.Busqueda;

import java.util.ArrayList;

public class SelectionSort {

    public static void selectionSort(ArrayList<Integer> array) {
        int n = array.size();

        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;

            // Encuentra el índice del elemento máximo en la sublista no ordenada
            for (int j = i + 1; j < n; j++) {
                if (array.get(j) > array.get(maxIndex)) {
                    maxIndex = j;
                }
            }

            // Intercambia el elemento máximo con el primer elemento no ordenado
            int temp = array.get(maxIndex);
            array.set(maxIndex, array.get(i));
            array.set(i, temp);
        }
    }
}
