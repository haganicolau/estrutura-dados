package com.estruturadados.introducao;

import java.util.Scanner;

public class ExercicioExtra3 {

    public static void main (String [] args) {
        /*
         * Ler um número se for maio que 10, informar maior que 10
         * */
        Scanner scan = new Scanner(System.in);
        System.out.println("Ler um número: ");
        int numero = scan.nextInt();

        if(numero > 10) {
            System.out.println("número maior que 10");
        }
    }
}
