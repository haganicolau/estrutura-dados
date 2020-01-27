package com.estruturadados.ordenacao;

/**
 *
 * @author Hagamenon.Oliveira<haganicolau@gmail.com>
 */
public class InsertionSort {

    /**
     * @description Método insertion sort O(n^2)
     * @author Hagamenon Oliveira <haganicolau@gmail.com>
     * @return void 
     */
    public static int[] sort(int[] vetor) {
        int j;
        int key;
        int i;

        for (j = 1; j < vetor.length; j++) {
          key = vetor[j];
          for (i = j - 1; (i >= 0) && (vetor[i] > key); i--) {
             vetor[i + 1] = vetor[i];
           }
            vetor[i + 1] = key;
        }

        return vetor;
    }
}
