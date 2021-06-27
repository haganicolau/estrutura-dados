package com.datastructure.introduction;


public class Question06N1 {
    public static void main(String[] args){
        int array[] = {0,4,2,8,1,6,5,3};
        int greater = seekGreater(array, 0, array[0]);
        int less = seekLess(array, 0, array[0]);


        int soughtValue = 12;
        int aux[] = insertSentinel(array, soughtValue);
        int index = sentinelSearch(aux, soughtValue, 0);

        System.out.println(greater);
        System.out.println(less);
        System.out.println(index);
    }

    /**
     * @description Busca o maior elemento de forma recursiva, quando encontrar o maior
     * a cada iteração, substitui. 
     * @author Hagamenon Oliveira <haganicolau@gmail.com>
     * @param array [] - vetor a ser buscado
     * @param int index - posição a ser incrementada 
     * @param int greater - maior elemento a ser comparado a cada iteração 
     * @return int maior encontrado
     */
    public static int seekGreater(int[] array, int index, int greater){

        if(array[index] > greater) {
            greater = array[index];
        }

        if(index+1 == array.length) {  
            return greater;
        }

        return seekGreater(array, index+1, greater);
        
    }

    /**
     * @description Busca o menor elemento de forma recursiva, quando encontrar o menor
     * a cada iteração, substitui. 
     * @author Hagamenon Oliveira <haganicolau@gmail.com>
     * @param array [] - vetor a ser buscado
     * @param int index - posição a ser incrementada 
     * @param int less - menor elemento a ser comparado a cada iteração 
     * @return int menor encontrado
     */
    public static int seekLess(int[] array, int index, int less) {
        if(array[index] < less) {
            less = array[index];
        }

        if(index+1 == array.length) {  
            return less;
        }

        return seekLess(array, index+1, less);
    }

    /**
     * @description Insere o sentinela
     * @author Hagamenon Oliveira <haganicolau@gmail.com>
     * @param array [] - vetor a ser buscado
     * @param int value - int valor a ser buscado
     * @return int[] array com sentinela
     */
    public static int[] insertSentinel(int[] array, int value) {
        int aux[] = new int[array.length + 1];

        for(int index = 0; index < array.length; index++) {
            aux[index] = array[index];
        }
        aux[aux.length - 1] = value;
        
        return aux;
    }

    /**
     * @description Insere o sentinela
     * @author Hagamenon Oliveira <haganicolau@gmail.com>
     * @param array [] - vetor a ser buscado
     * @param int value - int valor a ser buscado
     * @param int index - posição a ser incrementada 
     * @return int[] array com sentinela
     */
    public static int sentinelSearch(int array[], int value, int index) {
        
        if(value == array[index]) {
            return index;
        }

        return sentinelSearch(array, value, index+1);
    }
}

