package com.estruturadados.matriz;

import java.util.Random;

public class exercicio07 {

    public static void main(String [] args) {
        /*
        * Leia uma matriz 5 x 5 e faça uma troca de posição dos elementos da diagonal principal
        * pelos da diagonal secundária.
        *
        *   1   2    3    4    04
        *   4   5    6    13    8
        *   9   10   22   12   14
        *   15  31   17   18   19
        *   40  21   22   23   24
        *
        *   auxPrincipal = 1 5 11 18 24
        *   auxSecundaria = 5 7 11 16 20
        * */

        Random random = new Random();
        int matriz[][] = new int[5][5];
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = random.nextInt(100);
            }
        }

        printarMatriz(matriz);
        int diagonalP[] = encontrarDiagonalPrincipal(matriz);
        int diagonalS[] = encontrarDiagonalSecundaria(matriz);
        trocarDiagonalPrincipalPelaSecundaria(diagonalP, diagonalS, matriz);
        System.out.println("");
        System.out.println("");
        printarMatriz(matriz);
    }

    public static int[] encontrarDiagonalPrincipal(int matriz[][]) {
        int diagonalPrincipal[] = new int[matriz.length];
        for(int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if(i == j) {
                    diagonalPrincipal[i] = matriz[i][j];
                }
            }
        }
        return diagonalPrincipal;
    }

    public static int[] encontrarDiagonalSecundaria(int matriz[][]) {
        int diagonalSecundaria[] = new int[matriz.length];
        int indiceDiagSec = 0;

        for(int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {

                if((i + j) == (matriz.length - 1)) {
                    diagonalSecundaria[indiceDiagSec] = matriz[i][j];
                    indiceDiagSec++;
                }
            }
        }
        return diagonalSecundaria;
    }

    public static void trocarDiagonalPrincipalPelaSecundaria(int diagPrinc[], int diagSec[], int matriz[][]) {
        int indiceDiagSec = 0;
        for(int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if(i == j) {
                    matriz[i][j] = diagSec[j];
                }

                if((i + j) == (matriz.length - 1)) {
                    matriz[i][j] = diagPrinc[indiceDiagSec];
                    indiceDiagSec++;
                }
            }
        }
    }

    public static void printarMatriz(int matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(" " + matriz[i][j]);
            }
            System.out.println(" ");
        }
    }
}
