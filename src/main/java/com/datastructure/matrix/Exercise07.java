package com.datastructure.matriz;

import java.util.Random;

public class Exercise07 {

    public static void main(String [] args) {
        /*
        * Leia uma matrix 5 x 5 e faça uma troca de posição dos elementos da diagonal principal
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
        int[][] matrix = new int[5][5];
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = random.nextInt(100);
            }
        }

        printMatrix(matrix);
        int[] diagonalP = findMainDiagonal(matrix);
        int[] diagonalS = findSecondaryDiagonal(matrix);
        changeMainDiagonalToSecondary(diagonalP, diagonalS, matrix);

        printMatrix(matrix);
    }

    public static int[] findMainDiagonal(int[][] matrix) {
        int[] mainDiagonal = new int[matrix.length];
        for(int indexI = 0; indexI < matrix.length; indexI++) {
            for (int indexJ = 0; indexJ < matrix[0].length; indexJ++) {
                if(indexI == indexJ) {
                    mainDiagonal[indexI] = matrix[indexI][indexJ];
                }
            }
        }
        return mainDiagonal;
    }

    public static int[] findSecondaryDiagonal(int[][] matriz) {
        int[] secondaryDiagonal = new int[matriz.length];
        int diagonalIndex = 0;

        for(int indexI = 0; indexI < matriz.length; indexI++) {
            for (int indexJ = 0; indexJ < matriz[0].length; indexJ++) {

                if((indexI + indexJ) == (matriz.length - 1)) {
                    secondaryDiagonal[diagonalIndex] = matriz[indexI][indexJ];
                    diagonalIndex++;
                }
            }
        }
        return secondaryDiagonal;
    }

    public static void changeMainDiagonalToSecondary(int[] mainDiagonal, int[] secondaryDiagonal, int[][] matrix) {
        int diagonalIndex = 0;
        for(int indexI = 0; indexI < matrix.length; indexI++) {
            for (int indexJ = 0; indexJ < matrix[0].length; indexJ++) {
                if(indexI == indexJ) {
                    matrix[indexI][indexJ] = secondaryDiagonal[indexJ];
                }

                if((indexI + indexJ) == (matrix.length - 1)) {
                    matrix[indexI][indexJ] = mainDiagonal[diagonalIndex];
                    diagonalIndex++;
                }
            }
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int indexI = 0; indexI < matrix.length; indexI++) {
            for (int indexJ = 0; indexJ < matrix[0].length; indexJ++) {
                System.out.print(" " + matrix[indexI][indexJ]);
            }
            System.out.println(" ");
        }
    }
}
