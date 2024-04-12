/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos.Ordenamiento.Busqueda;

import java.util.ArrayList;

public class MergeSort {
    // Método para ordenar una lista de precios de mayor a menor utilizando mergesort
    public static void ordenarPreciosDescendente(ArrayList<Double> precios) {
        mergeSort(precios, 0, precios.size() - 1);
    }

    private static void mergeSort(ArrayList<Double> array, int left, int right) {
        if (left < right) {
            int middle = left + (right - left) / 2;

            // Ordenar la mitad izquierda
            mergeSort(array, left, middle);

            // Ordenar la mitad derecha
            mergeSort(array, middle + 1, right);

            // Combinar las mitades ordenadas
            merge(array, left, middle, right);
        }
    }

    private static void merge(ArrayList<Double> array, int left, int middle, int right) {
        int n1 = middle - left + 1;
        int n2 = right - middle;

        // Crear arreglos temporales
        ArrayList<Double> leftArray = new ArrayList<>(array.subList(left, left + n1));
        ArrayList<Double> rightArray = new ArrayList<>(array.subList(middle + 1, middle + 1 + n2));

        // Índices iniciales de las sub-listas izquierda y derecha
        int i = 0, j = 0;

        // Índice inicial de la lista combinada
        int k = left;

        while (i < n1 && j < n2) {
            if (leftArray.get(i) >= rightArray.get(j)) {
                array.set(k, leftArray.get(i));
                i++;
            } else {
                array.set(k, rightArray.get(j));
                j++;
            }
            k++;
        }

        // Copiar los elementos restantes de leftArray, si los hay
        while (i < n1) {
            array.set(k, leftArray.get(i));
            i++;
            k++;
        }

        // Copiar los elementos restantes de rightArray, si los hay
        while (j < n2) {
            array.set(k, rightArray.get(j));
            j++;
            k++;
        }
    }
}
