package com.datastructure.introduction;

import java.util.Scanner;

public class FunctionExercise {

    public static void main(String [] args) {
        /*
        * 2- Escreva um programa que leia o ray de um círculo e faça duas funções: uma função chamada área que
        * calcula e retorna a área do círculo e outra função chamada perímetro que calcula e retorna o perímetro
        * do círculo, tendo PI = 3,14 Funções:
        *  - Área = PI * r * r;
        *  - Perímetro = PI * 2 * r;
        * */

        double ray = 0, area = 0, perimeter = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a ray: ");
        ray = scan.nextDouble();

        area = calculateAreaCircle(ray);
        perimeter = calculatePerimeterCircle(ray);

        System.out.println("Calculation area: " + area);
        System.out.println("Calculation perimeter: " + perimeter);
    }

    static double calculateAreaCircle(double raio) {
        return 3.14 * raio * raio;
    }

    static double calculatePerimeterCircle(double raio) {
        return 2 * 3.14 * raio;
    }
}
