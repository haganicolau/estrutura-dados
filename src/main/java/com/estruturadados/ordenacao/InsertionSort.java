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
    public static void main(String args[]) {

        int vetor[] = {5,3,2,4,7,1,0,6};
        int i,j, key;

        for(j = 1; j < vetor.length; j++) {
            key = vetor[j];
            i = j - 1;

            while(i >= 0 && vetor[i] > key) {
                vetor[i + 1] = vetor[i];
                i--;
            }
            vetor[i + 1] = key;
        }
        
        printarVetor(vetor);
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
