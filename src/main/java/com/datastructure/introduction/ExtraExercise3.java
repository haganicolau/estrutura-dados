package com.datastructure.introduction;

import java.util.Scanner;

public class ExtraExercise3 {

    public static void main (String [] args) {
        /*
         * Ler um número se for maio que 10, informar maior que 10
         * */
        Scanner scan = new Scanner(System.in);
        System.out.println("read a number: ");
        int number = scan.nextInt();

        if(number > 10) {
            System.out.println("number greater than 10");
        }
    }
}
