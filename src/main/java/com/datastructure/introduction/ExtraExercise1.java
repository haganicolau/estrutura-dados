package com.datastructure.introduction;

import java.util.Scanner;

public class ExtraExercise1 {
    public static void main (String [] args) {
         /*
         * Exercício cáculo da média:
         * */
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a p1: ");
        double p1 = scan.nextDouble();

        System.out.println("enter a p2: ");
        double p2 = scan.nextDouble();

        double media = (p1 * 0.4) + (p2 * 0.6);
        System.out.println("average: " + media);
        if(media >= 7) {
            System.out.println("approved");
        }
        else if(media < 7  && media >=4) {
            System.out.println("PS");
        }
        else {
            System.out.println("disapproved");
        }

    }
}
