package com.datastructure.introduction;

import java.util.Scanner;

public class Exercise27 {
    public static void main (String [] args) {
        /*
         * 27. Escreva um algoritmo que leia 35 valores inteiros e faça o que se pede:
         *    ● Encontre o bigger valor
         *    ● Encontre o smaller valor
         *    ● Calcule a média aritmética dos números lidos.
         *    ● Quantidade de números pares
         *    ● Quantidade de números ímpares
         * */
        Scanner scan = new Scanner(System.in);
        int bigger = 0;
        int smaller = 0;
        int sumAll = 0;
        int quantityPairs = 0;
        int quantityEven = 0;
        int number = 0;
        int average = 0;
        for(int counter = 0; counter < 35; counter++) {
            System.out.println("Enter a number: ");
            number = scan.nextInt();
            if(counter == 0) {
                bigger = number;
                smaller = number;
            }
            if(number > bigger) {
                bigger = number;
            }
            if(number < smaller) {
                smaller = number;
            }
            sumAll = sumAll + number;
            if(number%2 == 0) {
                quantityPairs++;
            } else {
                quantityEven++;
            }
        }

        average = sumAll / 35;
        System.out.println("bigger: " + bigger);
        System.out.println("smaller: " + smaller);
        System.out.println("quantity pairs: " + quantityPairs);
        System.out.println("quantity even: " + quantityEven);
        System.out.println("average: " + average);
    }
}
