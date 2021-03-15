package com.estruturadados.ordenacao;

import javax.tools.Diagnostic;

/**
 *
 * @author Hagamenon.Oliveira<haganicolau@gmail.com>
 */
public class QuickSort {
    public static void main(String[] args) {
        int vetor[] = {7,2,9,4,3,0,8,6,1,5};

        sort(vetor, 0, vetor.length - 1);
        printarVetor(vetor);
    }

    public static void sort(int vetor[], int inicio, int fim) {
        if(inicio < fim) {
            int posicaoPivo = separar(vetor, inicio, fim);
            sort(vetor, inicio, posicaoPivo - 1);
            sort(vetor, posicaoPivo + 1, fim);
        }
    }

    public static int separar(int vetor[], int inicio, int fim) {
        int pivo = vetor[inicio];
        int pontaEsq = inicio + 1;
        int pontaDir = fim;

        while(pontaEsq <= pontaDir) {
            
            if(vetor[pontaEsq] <= pivo) {
                pontaEsq++;
            }

            else if(vetor[pontaDir] > pivo) {
                pontaDir--;
            }

            else {
                troca(vetor, pontaEsq, pontaDir);
            }
        }

        vetor[inicio] = vetor[pontaDir];
        vetor[pontaDir] = pivo;
        return pontaDir;
    }

    public static void troca(int vetor[], int pontaEsq, int pontaDir) {
        int troca = vetor[pontaEsq];
        vetor[pontaEsq] = vetor[pontaDir];
        vetor[pontaDir] = troca;
        pontaEsq++;
        pontaDir--;
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