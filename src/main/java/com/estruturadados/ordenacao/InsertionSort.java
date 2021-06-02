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

        int vetor[] = {20,300,70,5,43,8};
        int i,j, key, contador = 0;

        for(j = 1; j < vetor.length; j++) {
            key = vetor[j];
            i = j - 1;

            while(i >= 0 && vetor[i] > key) {
                vetor[i + 1] = vetor[i];
                contador++;
                i--;
            }
            vetor[i + 1] = key;
        }
        System.out.println(contador);
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
