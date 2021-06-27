package com.datastructure.search;

public class PesquisaSequencial {
    
    public static void main(String [] args) {
        int array[] = {24,25,26,27,28,32,33,34,35,40,41,42,43,47,49,51,59,60,67};
        int posicao = simpleSearch(array, 35);

        System.out.println("Posição: " + posicao);
    }

    public static int simpleSearch(int array[], int value) {
        int index = 0;
        int comparacoes = 0;

        while((array[index] != value) && index < array.length) {
            comparacoes++;
            index++;
        }
        System.out.println("comparacoes: " +comparacoes );
        return index;
    }

    public static int search(int array[], int value) {
        int index = 0;
        boolean find = false;

        while((find == false) && index < array.length) {
         if(array[index] == value) {
             find = true;
             continue;
         }

         index++;   
        }

        if(find) return index;

        return array.length;
    }

    public static int sentinelSearch(int array[], int value) {
        int aux[] = new int[array.length + 1];
        int operacao = 0;

        for(int index = 0; index < array.length; index++) {
            aux[index] = array[index];
        }
        aux[aux.length - 1] = value;

        int index = 0;
        boolean find = false;
        while((find == false) && index < aux.length) {
            if(aux[index] == value) {
                find = true;
                continue;
            }
            index++;
        }

        return index;
    }
}