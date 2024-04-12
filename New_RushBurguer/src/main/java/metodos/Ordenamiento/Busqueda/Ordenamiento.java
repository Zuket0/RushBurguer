/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos.Ordenamiento.Busqueda;


public class Ordenamiento {

    // Método de la burbuja para ordenar alfabéticamente una lista de Strings
    public static void ordenarBurbuja(String[] arr) {
        int n = arr.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < n - 1; i++) {
                if (arr[i].compareTo(arr[i + 1]) > 0) {
                    // Swap arr[i] and arr[i+1]
                    String temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }
}
