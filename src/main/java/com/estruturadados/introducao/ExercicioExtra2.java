package com.estruturadados.introducao;

import java.util.Scanner;

public class ExercicioExtra2 {

    public static void main(String [] args) {
        /*
         * Ler um número se for maio que 10, informar maior que 10
         * caso contrário printar número nao é maior que 10
         * */
        System.out.println("Ler um número: ");
        Scanner scan = new Scanner(System.in);
        int numero = scan.nextInt();

        boolean response = numero > 10;
        if(response) {
            System.out.println("número maior que 10");
        } else {
            System.out.println("número não é maior que 10");
        }
    }
}
