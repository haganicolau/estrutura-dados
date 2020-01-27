package com.estruturadados.ordenacao;

import java.util.Arrays;

/**
 *
 * @author Hagamenon.Oliveira<haganicolau@gmail.com>
 */
public class MergeSort {
 
    private int contador = 0;
    
    /**
     * @description Método recursivo, que faz a quebra do array criando
     * uma complexidade O(logn)
     * @author Hagamenon Oliveira <haganicolau@gmail.com>
     * @return void 
     */
    public static void sort(int v[], int w[], int inicio, int fim) {
        if (inicio < fim) {
            int meio = (inicio + fim) / 2;
            mergeSort(v, w, inicio, meio);
            mergeSort(v, w, meio + 1, fim);
            intercalar(v, w, inicio, meio, fim);
        }
    }
 
    /**
     * @description Método responsável por intercalar e rearranjar os elementos
     * conforme for voltando no método recursivo
     * @author Hagamenon Oliveira <haganicolau@gmail.com>
     * @return void 
     */
    public static void intercalar(int v[], int w[], int inicio, int meio, int fim) {
        contador++;
        /*cópia do vetor*/
        for (int k = inicio; k <= fim; k++){
            w[k] = v[k];
        }
        
        int i = inicio;
        int j = meio+1;
        
        for (int k = inicio; k <= fim; k++) {
            if(i > meio) v[k] = w[j++];
            else if(j > fim) v[k] = w[i++];
            else if(w[i]<w[j]) v[k] = w[i++];
            else v[k] = w[j++];
        }
        
    }
}
