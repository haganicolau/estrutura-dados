package com.estruturadados.introducao;

import java.util.Scanner;

public class EstruturaMain {

    public static void main (String [] args) {
//        System.out.println("start main");
//
//        calculadora();
//
//        System.out.println("end main");

        String texto = "palavra";
        char letra = texto.charAt(2);
    }

    public static void calculadora() {
        Scanner scan = new Scanner(System.in);
        System.out.println("informe n1");
        int n1 = scan.nextInt();
        System.out.println("informe n2");
        int n2 = scan.nextInt();

        int soma = soma(n1, n2);
        System.out.println("soma: " + soma);
        int mult = multiplicacao(n1, n2);
        System.out.println("multiplicacao: " + mult);
        int subt = subtracao(n1, n2);
        System.out.println("subtracao: " + subt);
        int divisao = divisao(n1, n2);
        System.out.println("divisao: " + divisao);

    }

    public static int soma(int n1, int n2) {
        //return n1 + n2;
        int soma = 0;
        soma = n1 + n2;
        return soma;
    }

    public static int multiplicacao(int n1, int n2) {
        int multi = 0;
        multi = n1 * n2;
        return multi;
    }

    public static int subtracao(int n1, int n2) {
        int sub = 0;
        sub = n1 - n2;
        return sub;
    }

    public static int divisao(int n1, int n2) {
        int divisao = 0;
        divisao = n1 / n2;
        return divisao;
    }
}
