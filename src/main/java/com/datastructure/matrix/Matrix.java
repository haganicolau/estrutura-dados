package com.datastructure.matriz;

import java.util.Random;
import java.util.Scanner;

public class Matrix {

    public static void main(String[] args) {
        /*
         *  1- Crie um algoritmo que leia uma matrix 3x3 do usuário, retorne a sum de todos os valores.
         */
        int[][] matrix = createMatrix(3,3);
        readMatrixUser(matrix);
        int sum = sumElements(matrix);
        System.out.println("Sum= "+sum);

        /*
         * 2- Crie um algoritmo em java que leia uma matrix 4x4 e print a diagonal principal
         */
        int[][] matrix2 = createMatrix(4,4);
        readRandomMatrix(matrix2);
        printDiagonalMain(matrix2);

        /*
         * 3- Crie um algoritmo em java que leia uma matrix 4x4 e print a diagonal secundária
         */
        printarDiagonalSecondary(matrix2);

        /*
         * 4- Gerar e imprimir uma matrix de tamanho 10x10, onde seus elementos são da forma:
         *  - A[i][j] = 2i + 7j − 2 se i < j;
         *  - A[i][j] = 3i*2 − 1 se i = j;
         *  - A[i][j] = 4i*3 − 5j*2 + 1 se i > j.
         * */
        int[][] matrix4 = createMatrix(10,10);
        exercise4(matrix4);
        writeMatrix(matrix4);
    }

    public static void exercise4(int[][] matrix) {
        for(int indexI = 0; indexI < matrix.length; indexI++) {
            for(int indexJ = 0; indexJ < matrix[0].length; indexJ++) {
                if(indexI < indexJ) {
                    matrix[indexI][indexJ] = (2*indexI) + (7*indexJ) - 2;
                }
                else if(indexI == indexJ) {
                    matrix[indexI][indexJ] = (3*indexI*2) - 1;
                } else {
                    matrix[indexI][indexJ] = (4*indexI*3) - (5*indexJ*2) + 1;
                }
            }
        }
    }

    public static int[][] createMatrix(int qtyRows, int qtyColumns) {
        return new int[qtyRows][qtyColumns];
    }

    public static void readRandomMatrix(int[][] matrix) {
        Random random = new Random();
        for(int indexI = 0; indexI < matrix.length; indexI++) {
            for(int indexJ = 0; indexJ < matrix[0].length; indexJ++) {
                matrix[indexI][indexJ] = random.nextInt(100);
            }
        }
    }

    public static void readMatrixUser(int[][] matriz) {
        Scanner scan = new Scanner(System.in);
        for(int indexI = 0; indexI < matriz.length; indexI++) {
            for (int indexJ = 0; indexJ < matriz[0].length; indexJ++) {
                System.out.println("Matriz["+indexI+"]["+indexJ+"]= ");
                matriz[indexI][indexJ] = scan.nextInt();
            }
        }
    }

    public static int sumElements(int[][] matriz) {
        int sum = 0;
        for(int indexI = 0; indexI < matriz.length; indexI++) {
            for(int indexJ = 0; indexJ< matriz[0].length; indexJ++) {
                sum = sum + matriz[indexI][indexJ];
            }
        }
        return sum;
    }

    public static void printDiagonalMain(int[][] matrix) {
        System.out.println("Main Diagonal: ");
        for(int indexI = 0; indexI < matrix.length; indexI++) {
            for(int indexJ = 0; indexJ < matrix[0].length; indexJ++) {
                if(indexI == indexJ) {
                    System.out.print("Matrix["+indexI+"]["+indexJ+"]= ");
                    System.out.println(matrix[indexI][indexJ]);
                }
            }
        }
    }

    public static void printarDiagonalSecondary(int[][] matrix) {
        System.out.println("Secondary Diagonal: ");
        for(int indexI = 0; indexI < matrix.length; indexI++) {
            for (int indexJ = 0; indexJ < matrix[0].length; indexJ++) {
                if(indexI + indexJ == matrix.length -1) {
                    System.out.print("Matrix["+indexI+"]["+indexJ+"]= ");
                    System.out.println(matrix[indexI][indexJ]);
                }
            }
        }
    }

    public static void writeMatrix(int[][] matrix) {
        for(int indexI = 0; indexI < matrix.length; indexI++) {
            for (int indexJ = 0; indexJ < matrix[0].length; indexJ++) {
                System.out.print(matrix[indexI][indexJ] + " ");
            }
            System.out.println("");
        }
    }

}
