package com.estruturadados.introducao;

import java.util.Scanner;

public class ExercicioRepeticao {

    public static void main(String [] args) {
        /*
         * exercicio: ler um número do usuário enquanto este número nao for igual a 5, informar número errado, novo número.
         * */
        Scanner scan = new Scanner(System.in);

        /*
         * escrever um algoritmo algoritmo que conte de 0 a 25 pulando de 3 em 3
         * */
        for(int contador = 0; contador < 25; contador = contador + 3) {
            System.out.println(contador);
        }

        System.out.println("saiu do laço");


        System.out.println("Informar novo número: ");
        int numero = scan.nextInt();

        while(numero != 5) {
            System.out.println("Número errado. Informar novo número");
            numero = scan.nextInt();
        }

        System.out.println("Informar novo número: ");
        numero = scan.nextInt();
        do {
            // ele vai executar uma vez antes de checar se a condição é verdadeira
            System.out.println("Número errado. Informar novo número");
            numero = scan.nextInt();
        } while(numero != 5);

        System.out.println("Número certo!");
    }
}
