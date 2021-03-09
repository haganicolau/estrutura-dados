package com.estruturadados.ordenacao;

public class ShellSort{
    public static void main(String[] args) {
        int vetor[] = {7,2,9,4,3,0,8,6,1,5};
        int vetorOrdenado[] = sort(vetor);
        printarVetor(vetor);
    }

    public static int[] sort(int vetor[]) {
         int h = vetor.length / 2;
         int key, j, i;

         while(h > 0) {
             for(i = h; i < vetor.length; i++) {
                 key = vetor[i];
                 j = i;

                 while(j >= h && vetor[j - h] > key) {
                    vetor[j] = vetor[j - h];
                    j = j - h;
                 }
                 vetor[j] = key;
             }
             h = h / 2;
         }
         return vetor;
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