package com.estruturadados.introducao;

import java.util.Scanner;

public class VerificarSeNumeroPar {

    public static void main (String [] arags) {
        /*
        * Crie uma função que cheque se um número passado por parâmetro é par
        *
        * */

        int tamanho, x;
        Scanner scan = new Scanner(System.in);
        System.out.println("informe um tamanho: ");
        tamanho = scan.nextInt();
        int vetor[] = new int[tamanho];

        for(x = 0; x < tamanho; x++) {
            System.out.println("informe um numero: ");
            vetor[x] = scan.nextInt();
        }

        for(x = 0; x < tamanho; x++) {
            System.out.println(vetor[x]);
        }
    }

}
