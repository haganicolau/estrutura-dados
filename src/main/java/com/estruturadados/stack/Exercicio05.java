package com.estruturadados.stack;


import java.util.Scanner;

public class Exercicio05 {
    public static void main(String [] args) {

        /*
        * Considere uma pilha estática que armazene caracteres. Desenvolva um
        * algoritmo que faça uso de uma função para determinar se uma string é da
        * forma XY, onde X é uma cadeia formada por caracteres arbitrários e Y o
        * reverso de X. Por exemplo, se x = ABCD, então y = DCBA. Considere que x e y
        * são duas strings distintas. Faça uso da função charAt(int indice), função da
        * String que retorna um caracter a partir da posição do caracter na String.
        * */
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe x:");
        String x = scan.nextLine();
        System.out.println("Informe y:");
        String y = scan.nextLine();

    }
}
