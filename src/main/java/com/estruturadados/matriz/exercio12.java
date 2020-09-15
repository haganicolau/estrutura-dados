package com.estruturadados.matriz;

import java.util.Random;

public class exercio12 {

    public static void main(String[] args) {
        /*
        * 12- Crie uma função em java que receba por parâmetro duas matrizes lidas
        *     e retorne uma matriz resultante da união das matrizes.
        * */
        int matriz1[][] = new int[5][5];
        int matriz2[][] = new int[5][5];
        lerMatrizRandomica(matriz1);
        lerMatrizRandomica(matriz2);
        int matrizUniao[][] = uniaoMatriz(matriz1,matriz2);
    }

    public static void lerMatrizRandomica(int matriz[][]) {
        Random random = new Random();
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = random.nextInt(100);
            }
        }
    }

    public static int[][] uniaoMatriz(int[][] matriz1, int[][] matriz2) {
        int matrizUniao[][] = new int[5][10];

        for(int i = 0; i < matriz1.length; i++) {
            for(int j = 0; j < matriz1[0].length; j++) {
                int numero = matriz2[i][j];
                if(!verificaSeValorExiste(matrizUniao, numero)) {
                    matrizUniao[i][j] = matriz1[i][j];
                }
            }
        }

        for(int i = 0; i < matriz2.length; i++) {
            for(int j = 0; j < matriz2[0].length; j++) {
                int numero = matriz2[i][j];
                if(!verificaSeValorExiste(matrizUniao, numero)) {
                    matrizUniao[i][j + matriz1[0].length] = numero;
                }
            }
        }
        return matrizUniao;
    }

    public static boolean verificaSeValorExiste(int matriz[][], int numero) {
        for(int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if(matriz[i][j] == numero) {
                    return true;
                }
            }
        }
        return false;
    }
}
