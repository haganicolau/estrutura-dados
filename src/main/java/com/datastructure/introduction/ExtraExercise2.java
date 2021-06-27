package com.datastructure.introduction;

import java.util.Scanner;

public class ExtraExercise2 {

    public static void main(String [] args) {
        /*
         * Ler um número se for maio que 10, informar maior que 10
         * caso contrário printar número nao é maior que 10
         * */
        System.out.println("read a number: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        boolean response = number > 10;
        if(response) {
            System.out.println("number greater than 10");
        } else {
            System.out.println("number is not greater than 10");
        }
    }
}
