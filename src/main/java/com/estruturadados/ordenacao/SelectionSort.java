package com.estruturadados.ordenacao;

public class SelectionSort {
    /**
     * @description Método selection sort O(n^2)
     * @author Hagamenon Oliveira <haganicolau@gmail.com>
     * @return void 
     */
    public static void main(String args[]) {

        int vetor[] ={1,5,2,0,7,8,9,4};
        int i,j,min,aux;

        for(i = 0; i < vetor.length; i++) {
            min = i;
            
            for(j = i + 1; j < vetor.length; j++) {        
                if(vetor[j] < vetor[min]) {
                    min = j;
                }

            }
            aux = vetor[i];
            vetor[i] = vetor[min];
            vetor[min] = aux;
        }

        printarVetor(vetor);
    }

    public static void printarVetor(int vetor[]) {
        System.out.print("vetor [ ");
        for(int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i]+" ");
        }
        System.out.print("];");
    }
}