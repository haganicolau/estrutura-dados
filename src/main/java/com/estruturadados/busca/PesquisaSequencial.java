package com.estruturadados.busca;

public class PesquisaSequencial {
    
    public static void main(String [] args) {
        int array[] = {4,5,8,10,11,56,88,1,6,89,0,111,81,7,9};
        int posicao = sentinelSearch(array, 9);

        System.out.println("Posição: " + posicao);
    }

    public static int simpleSearch(int array[], int value) {
        int index = 0;

        while((array[index] != value) && index < array.length) {
            index++;
        }

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