package com.estruturadados.introducao;

import java.util.Scanner;

public class ExercicioExtra1 {
    public static void main (String [] args) {
         /*
         * Exercício cáculo da média:
         * */
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe a p1: ");
        double p1 = scan.nextDouble();

        System.out.println("informe a p2: ");
        double p2 = scan.nextDouble();

        double media = (p1 * 0.4) + (p2 * 0.6);
        System.out.println("Média: " + media);
        if(media >= 7) {
            System.out.println("Aprovado");
        }
        else if(media < 7  && media >=4) {
            System.out.println("Fazer PS");
        }
        else {
            System.out.println("Reprovado");
        }

    }
}
