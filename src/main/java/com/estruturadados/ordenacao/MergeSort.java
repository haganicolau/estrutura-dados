package com.estruturadados.ordenacao;

public class MergeSort {
    
    public static void main(String [] args) {
        int vetor[] = {7,2,9,4,3,0,8,6,1,5};
        
        sort(vetor, 0, vetor.length - 1);
        printarVetor(vetor);
    }

    public static void sort(int vetor[], int inicio, int fim) {
        if(inicio < fim) {
            int meio = (inicio + fim) / 2;
            sort(vetor, inicio, meio);
            sort(vetor, meio + 1, fim);
            merge(vetor, inicio, meio, fim);
        }
    }

    public static void merge(int vetor[], int inicio, int meio, int fim) {

        int secundario[] = new int[vetor.length];

        for(int k = inicio; k <= fim; k++) {
            secundario[k] = vetor[k];
        }

        int indiceEsquerdo = inicio;
        int indiceDireito = meio+1;


        for(int k = inicio; k <= fim; k++) {
            if(indiceEsquerdo > meio) vetor[k] = secundario[indiceDireito++];
            else if(indiceDireito > fim) vetor[k] = secundario[indiceEsquerdo++];
            else if(secundario[indiceEsquerdo] < secundario[indiceDireito]) vetor[k] = secundario[indiceEsquerdo++];
            else vetor[k] = secundario[indiceDireito++];
        }
    }

    public static void printarVetor(int vetor[]) {
        System.out.print("vetor [ ");
        for(int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.print("]; ");
        System.out.println(" ");
    }
}