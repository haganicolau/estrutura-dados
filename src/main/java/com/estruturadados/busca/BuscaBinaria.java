package com.estruturadados.busca;

public class BuscaBinaria {
    public static void main(String[] args) {
        int vetor[] = {4,7,8,10,14,21,22,36,62,77,81,91};
        int position = searchBinarioRecursive(vetor, 7, 0, vetor.length - 1);
        System.out.println("Posicao: " + position);

    }

    public static int searchBinario(int vetor[], int valor) {
        int meio = 0;
        int esq = 0;
        int dir = vetor.length - 1;
        boolean find = false;

        while((esq<=dir) && (find == false)) {
            meio = (esq + dir) / 2;

            if(vetor[meio] == valor) {
                find = true;
            }

            else if(vetor[meio] < valor) {
                esq = meio + 1;
            }

            else {
                dir = meio - 1;
            }
        }

        if(valor == vetor[meio]) {
            return meio;
        }
        return vetor.length;
    }

    public static int searchBinarioRecursive(int vetor[], int valor, int inicio, int fim) {
        
        if(inicio > fim) return vetor.length;

        int meio = (inicio + fim) / 2;

        if(vetor[meio] == valor) {
            return meio;
        }

        if(valor < vetor[meio]) {
            int esq = meio - 1;
            return searchBinarioRecursive(vetor, valor, inicio, esq);
        }

        else {
            int dir = meio + 1;
            return searchBinarioRecursive(vetor, valor, dir, fim);
        }
    }

}
