package com.datastructure.array;

import java.util.Scanner;

public class Exercise9 {

    public static void main(String [] args) {
        /*
        * 9- Crie um algoritmo que além da função main, tenha mais 3 funções que receba
        * um array por parâmetro e cada função deve retornar respectivamente o maior
        * valor, menor valor e o valor que se encontra na metade do array. Tanto
        * o size do array quanto todos os elementos inseridos devem ser informados
        * pelo usuário.
        * */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a array size: ");
        int size = scan.nextInt();
        int array[] = new int[size];

        for(int index = 0; index < array.length; index++) {
            System.out.println("array["+index+"]=");
            array[index] = scan.nextInt();
        }

        int bigger = searchForBiggest(array);
        System.out.println("bigger number: " + bigger);

        int smaller = searchForSmaller(array);
        System.out.println("smaller: " + smaller);

        int middle = searchMidlle(array);
        System.out.println("middle: " + middle);
    }

    public static int searchForBiggest(int array[]) {
        int bigger = 0;
        for(int index = 0; index < array.length; index++) {
            if(index == 0) {
                bigger = array[index];
            }

            if(array[index] > bigger) {
                bigger = array[index];
            }
        }
        return bigger;
    }

    public static int searchForSmaller(int array[]) {
        int smaller = 0;
        for(int index = 0; index < array.length; index++) {
            if(index == 0) {
                smaller = array[index];
            }

            if(array[index] < smaller) {
                smaller = array[index];
            }
        }
        return smaller;
    }

    public static int searchMidlle(int array[]) {
        int index = array.length/2;
        return array[index];
    }

}
