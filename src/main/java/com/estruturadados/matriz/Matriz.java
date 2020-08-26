package com.estruturadados.matriz;

import java.util.Random;
import java.util.Scanner;

public class Matriz {

    public static void main(String[] args) {
        /*
         *  1- Crie um algoritmo que leia uma matriz 3x3 do usuário, retorne a soma de todos os valores.
         */
        int matriz[][] = criarMatriz(3,3);
        lerMatrizUsuario(matriz);
        int soma = somaElementos(matriz);
        System.out.println("Soma= "+soma);

        /*
         * 2- Crie um algoritmo em java que leia uma matriz 4x4 e print a diagonal principal
         */
        int matriz2[][] = criarMatriz(4,4);
        lerMatrizRandomica(matriz2);
        printarDiagonalPrincipal(matriz2);

        /*
         * 3- Crie um algoritmo em java que leia uma matriz 4x4 e print a diagonal secundária
         */
        printarDiagonalSecundaria(matriz2);

        /*
         * 4- Gerar e imprimir uma matriz de tamanho 10x10, onde seus elementos são da forma:
         *  - A[i][j] = 2i + 7j − 2 se i < j;
         *  - A[i][j] = 3i*2 − 1 se i = j;
         *  - A[i][j] = 4i*3 − 5j*2 + 1 se i > j.
         * */
        int matriz4[][] = criarMatriz(10,10);
        exercicio4(matriz4);
        escreverMatriz(matriz4);
    }

    public static void exercicio4(int matriz[][]) {
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[0].length; j++) {
                if(i < j) {
                    matriz[i][j] = (2*i) + (7*j) - 2;
                }
                else if(i == j) {
                    matriz[i][j] = (3*i*2) - 1;
                } else {
                    matriz[i][j] = (4*i*3) - (5*j*2) + 1;
                }
            }
        }
    }

    public static int[][] criarMatriz(int qtdLinhas, int qtdColunas) {
        int matriz[][] = new int[qtdLinhas][qtdColunas];
        return matriz;
    }

    public static void lerMatrizRandomica(int matriz[][]) {
        Random random = new Random();
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = random.nextInt(100);
            }
        }
    }

    public static void lerMatrizUsuario(int matriz[][]) {
        Scanner scan = new Scanner(System.in);
        for(int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.println("Matriz["+i+"]["+j+"]= ");
                matriz[i][j] = scan.nextInt();
            }
        }
    }

    public static int somaElementos(int matriz[][]) {
        int soma = 0;
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j< matriz[0].length; j++) {
                soma = soma + matriz[i][j];
            }
        }
        return soma;
    }

    public static void printarDiagonalPrincipal(int matriz[][]) {
        System.out.println("Diagonal Principal: ");
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[0].length; j++) {
                if(i == j) {
                    System.out.print("Matriz["+i+"]["+j+"]= ");
                    System.out.println(matriz[i][j]);
                }
            }
        }
    }

    public static void printarDiagonalSecundaria(int matriz[][]) {
        System.out.println("Diagonal Secundária: ");
        for(int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if(i + j == matriz.length -1) {
                    System.out.print("Matriz["+i+"]["+j+"]= ");
                    System.out.println(matriz[i][j]);
                }
            }
        }
    }

    public static void escreverMatriz(int matriz[][]) {
        for(int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }

}
