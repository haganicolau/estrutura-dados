package com.estruturadados.ordenacao;

public class BubleSort {
     /**
     * @description Buble selection sort O(n^2)
     * @author Hagamenon Oliveira <haganicolau@gmail.com>
     * @return void 
     */
    public static void main(String args[]) {
        int vetor[] = {5,3,2,4,7,1,0,6};
        int i,j,aux;

        for(j = 0; j < vetor.length; j++) {
            for(i = 0; i < vetor.length - 1; i++) {
                
                if(vetor[i] > vetor[i + 1]) {
                    aux = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = aux;
                }
            }
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
