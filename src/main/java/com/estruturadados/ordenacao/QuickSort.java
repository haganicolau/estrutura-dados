package com.estruturadados.ordenacao;

import java.util.Arrays;

/**
 *
 * @author Hagamenon.Oliveira<haganicolau@gmail.com>
 */
public class QuickSort {
    
    /**
     * @description Método recursivo, que a partir de um pivô vai quebrando o array
     * criando uma complexidade O(logn)
     * @author Hagamenon Oliveira <haganicolau@gmail.com>
     * @return int [] - vetor ordenado
     */
    private static int[] sort(int[] v, int inicio, int fim) {
        
        int i = inicio;
        int j = fim;
        int pivo = v[(inicio + fim)/2];
        
        while(i <= j) {
            if(v[i] < pivo) i++;
            else if(v[j] > pivo) j--;
            else if(i <= j) {
                trocar(v,i,j);
                i++;
                j--;
            }
        }
        
        if(inicio < j)    
            quickSort(v, inicio, j);
        
        if(i < fim)
            quickSort(v, i, fim);
    }

    private static void trocar(int[] v, int i, int j) {
        int aux = v[i];
        v[i] = v[j];
        v[j] =  aux;
    }
}
