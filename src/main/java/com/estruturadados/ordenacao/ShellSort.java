package com.estruturadados.ordenacao;

import java.util.Arrays;

/**
 *
 * @author Hagamenon.Oliveira<haganicolau@gmail.com>
 */
public class ShellSort {

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
}
