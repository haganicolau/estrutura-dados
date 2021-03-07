package com.estruturadados.ordenacao;

import java.util.Arrays;

/**
 *
 * @author Hagamenon.Oliveira<haganicolau@gmail.com>
 */
public class MergeSort {

    private static int metade1;

    public static void main(String[] args) {
        int vetor[] = {7,2,9,4,3,8,6,1,5};

        sort(vetor, 0, vetor.length-1);
        printarVetor(vetor);
    }
    
    /**
     * @description Método recursivo, que faz a quebra do array criando
     * uma complexidade O(logn)
     * @author Hagamenon Oliveira <haganicolau@gmail.com>
     * @return void 
     */
    public static void sort(int vetor[], int inicio, int fim) {
        if (inicio < fim) {
            int meio = (inicio + fim) / 2;
            sort(vetor, inicio, meio);
            sort(vetor, meio + 1, fim);
            intercalar(vetor, inicio, meio, fim);
        }
    }
 
    /**
     * @description Método responsável por intercalar e rearranjar os elementos
     * conforme for voltando no método recursivo
     * @author Hagamenon Oliveira <haganicolau@gmail.com>
     * @return void 
     */
    public static void intercalar(int vetor[], int inicio, int meio, int fim) {

        int secundario[] = new int[vetor.length];

        /*cópia do vetor*/
        for (int k = inicio; k <= fim; k++){
            secundario[k] = vetor[k];
        }
        
        int indiceMetade1 = inicio;
        int indiceMetade2 = meio+1;
        
        for (int k = inicio; k <= fim; k++) {

            if(indiceMetade1 > meio) vetor[k] = secundario[indiceMetade2++];
            else if(indiceMetade2 > fim) vetor[k] = secundario[indiceMetade1++];
            else if(secundario[indiceMetade1] < secundario[indiceMetade2]) vetor[k] = secundario[indiceMetade1++];
            else vetor[k] = secundario[indiceMetade2++];

        }
        
    }

    public static void printarVetor(int vetor[]) {
        System.out.print("vetor [ ");
        for(int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i]+" ");
        }
        System.out.print("];");
    }
}
