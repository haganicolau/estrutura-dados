package com.estruturadados.introducao;


public class Questao06N1 {
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

    public static int seekGreater(int[] array, int index, int greater){

        if(array[index] > greater) {
            greater = array[index];
        }

        if(index+1 == array.length) {  
            return greater;
        }

        return seekGreater(array, index+1, greater);
        
    }

    public static int seekLess(int[] array, int index, int less) {
        if(array[index] < less) {
            less = array[index];
        }

        if(index+1 == array.length) {  
            return less;
        }

        return seekLess(array, index+1, less);
    }


    public static int[] insertSentinel(int[] vetor, int value) {
        int aux[] = new int[vetor.length + 1];

        for(int index = 0; index < vetor.length; index++) {
            aux[index] = vetor[index];
        }
        aux[aux.length - 1] = value;
        
        return aux;
    }


    public static int sentinelSearch(int vetor[], int value, int index) {
        
        if(value == vetor[index]) {
            return index;
        }

        return sentinelSearch(vetor, value, index+1);
    }
}

