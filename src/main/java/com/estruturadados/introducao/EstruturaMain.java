package com.estruturadados.introducao;

import java.util.Scanner;

public class EstruturaMain {

    public static void main (String [] args) {
        System.out.println("start main");
        try {
            calculadora();
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
        System.out.println("end main");
    }

    public static void calculadora() throws Exception{
        while (true) {
//            try {
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
//            } catch (InputMismatchException inputMismatchException) {
//                System.out.println("error tipo da entrada nao valido ");
//            }catch (Exception exception) {
//                System.out.println("cagadinha... digitou 0");
//            } finally {
//                System.out.println("finally");
//            }
        }

    }

    public static int soma(int n1, int n2) {
        //return n1 + n2;
        int soma = 0;
        soma = n1 + n2;
        return soma;
    }

    public static int multiplicacao(int n1, int n2) {
//        int[] vetor = new int[5];
//        vetor[5] = 0;
        int multi = 0;
        multi = n1 * n2;
        return multi;
    }

    public static int subtracao(int n1, int n2) {
        int sub = 0;
        sub = n1 - n2;
        return sub;
    }

    public static int divisao(int n1, int n2) throws Exception{
        if(n2 == 0) {
            throw new Exception("numero inválido");
        }
        int divisao = 0;
        divisao = n1 / n2;
        return divisao;
    }
}
