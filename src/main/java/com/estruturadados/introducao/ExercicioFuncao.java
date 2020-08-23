package com.estruturadados.introducao;

import java.util.Scanner;

public class ExercicioFuncao {

    public static void main(String [] args) {
        /*
        * 2- Escreva um programa que leia o raio de um círculo e faça duas funções: uma função chamada área que
        * calcula e retorna a área do círculo e outra função chamada perímetro que calcula e retorna o perímetro
        * do círculo, tendo PI = 3,14 Funções:
        *  - Área = PI * r * r;
        *  - Perímetro = PI * 2 * r;
        * */

        double raio = 0, area = 0, perimetro = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o raio: ");
        raio = scan.nextDouble();

        area = calcularAreaCirculo(raio);
        perimetro = calcularPerimetroCirculo(raio);

        System.out.println("Calculo área: " + area);
        System.out.println("Calculo perimetro: " + perimetro);
    }

    static double calcularAreaCirculo(double raio) {
        double area = 3.14 * raio * raio;
        return area;
    }

    static double calcularPerimetroCirculo(double raio) {
        double perimetro = 2 * 3.14 * raio;
        return perimetro;
    }
}
