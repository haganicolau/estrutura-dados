package com.estruturadados.ordenacao;

import java.util.Arrays;

/**
 *
 * @author Hagamenon.Oliveira<haganicolau@gmail.com>
 */
public class ShellSort {

    public static void main(String [] args) {
        int vetor[] = {7,2,9,4,3,8,6,1,5};
        int vetorOrdenado[] = sort(vetor);

        printarVetor(vetor);
    }

    /**
     * @description Método shell sort O(n^2)
     * @author Hagamenon Oliveira <haganicolau@gmail.com>
     * @return int [] - vetor ordenado 
     */
    public static int[] sort(int[] v) {
        
        int h = v.length / 2;
        int valor, j, i;
        
        while(h > 0) {
            for(i = h; i < v.length; i++) {
                valor = v[i];
                j = i;
                
                while(j >= h && v[j-h] > valor) {
                    v[j] = v[j-h];
                    j = j-h; 
                }
                v[j] = valor;
            }
          h = h / 2;  
        }
        
       return v;
    }

    public static void printarVetor(int vetor[]) {
        System.out.print("vetor [ ");
        for(int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i]+" ");
        }
        System.out.print("];");
        System.out.println("");
    }
}
