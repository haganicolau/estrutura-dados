package com.estruturadados.introducao;

import java.util.Scanner;

public class Exercicio27 {
    public static void main (String [] args) {
        /*
         * 27. Escreva um algoritmo que leia 35 valores inteiros e faça o que se pede:
         *    ● Encontre o maior valor
         *    ● Encontre o menor valor
         *    ● Calcule a média aritmética dos números lidos.
         *    ● Quantidade de números pares
         *    ● Quantidade de números ímpares
         * */
        Scanner scan = new Scanner(System.in);
        int maior = 0;
        int menor = 0;
        int somaTodos = 0;
        int qtdPares = 0;
        int qtdImpares = 0;
        int numero = 0;
        int media = 0;
        for(int contador = 0; contador < 35; contador++) {
            System.out.println("Informe um número: ");
            numero = scan.nextInt();
            if(contador == 0) {
                maior = numero;
                menor = numero;
            }
            if(numero > maior) {
                maior = numero;
            }
            if(numero < menor) {
                menor = numero;
            }
            somaTodos = somaTodos + numero;
            if(numero%2 == 0) {
                qtdPares++;
            } else {
                qtdImpares++;
            }
        }

        media = somaTodos / 35;
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Quantidade pares: " + qtdPares);
        System.out.println("Quantidade ímpares: " + qtdImpares);
        System.out.println("Média: " + media);
    }
}
