package com.datastructure.introduction;

import java.util.Scanner;

public class RepetExercise {

    public static void main(String [] args) {
        /*
         * exercicio: ler um número do usuário enquanto este número nao for igual a 5, informar número errado, novo número.
         * */
        Scanner scan = new Scanner(System.in);

        /*
         * escrever um algoritmo algoritmo que conte de 0 a 25 pulando de 3 em 3
         * */
        for(int counter = 0; counter < 25; counter = counter + 3) {
            System.out.println(counter);
        }

        System.out.println("got out of the loop");


        System.out.println("Enter new number: ");
        int number = scan.nextInt();

        while(number != 5) {
            System.out.println("Wrong number. Inform new number");
            number = scan.nextInt();
        }

        System.out.println("Inform new number: ");
        number = scan.nextInt();
        do {

            System.out.println("Wrong number. Inform new number");
            number = scan.nextInt();
        } while(number != 5);

        System.out.println("right number!");
    }
}
