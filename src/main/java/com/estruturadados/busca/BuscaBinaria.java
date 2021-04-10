package com.estruturadados.busca;

public class BuscaBinaria {
    public static void main(String[] args) {
        int vetor[] = {24,25,26,27,28,32,33,34,35,40,41,42,43,47,49,51,59,60,67};
        int position = searchBinario(vetor, 35);
        System.out.println("Posicao: " + position);

    }

    public static int searchBinario(int vetor[], int valor) {
        int meio = 0;
        int esq = 0;
        int dir = vetor.length - 1;
        boolean find = false;
        int comparacoes = 0;

        while((esq<=dir) && (find == false)) {
            comparacoes++;
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
        System.out.println("comparacoes: "+ comparacoes);
        if(valor == vetor[meio]) {
            return meio;
        }
        System.out.println("comparacoes: "+ comparacoes);
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
