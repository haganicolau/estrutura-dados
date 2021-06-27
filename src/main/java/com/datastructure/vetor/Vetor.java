package com.datastructure.vetor;

import java.util.Random;
import java.util.Scanner;

public class Vetor {

    public static void main (String [] args) {

        /*
         * 1- Crie um algoritmo que crie um array de 10 posições, insira os números de 1 a 10.
         *    Depois imprima os valores.
         */
        arrayRun1To10();


        /*
        * 2- Crie um algoritmo com 30 posições, peça que o usuário preencha com valores aleatórios.
        *    Após preenchido identifique o bigger e o smaller number do array.
        */
        int array[] = arrayCreate(5);
        enterRandomValues(array);
        int bigger = searchForTheBigger(array);
        int smaller = searchForTheSmaller(array);
        System.out.println("bigger: " + bigger);
        System.out.println("smaller: " + smaller);


        /*
         * 3- Crie um algoritmo que leia 50 valores e insira em um array. Posteriormente, calcule a média aritmética dos valores do array.
         */
        enterRandomValues(array);
        double arithmeticAverage = calculateMediaArithmeticArray(array);
        System.out.println("average: " + arithmeticAverage);


        /*
        * 4- Crie uma função que você passa um array e uma posição por parâmetro e ele retorna o number da posição.
        *    Se posição inválida, informar ao usuário: “Posição inválida”. retornar -1;
        * */
        int number = showNumber(array, 51);
        System.out.println("number in position 51: " + number);


        /*
         * 5- Crie uma função que você passa um array e um number e busque este number no array e retorna a posição
         *    Se number não encontrado, informar 'number nao encontrado' retornar -1;
         *
         * */
        int posicao = searchNumberFromPosition(array, 5);
        System.out.println("number in position 5: " + posicao);

    }

    static int[] arrayCreate(int tamanho) {
        int vetor[] = new int[tamanho];
        return vetor;
    }

    static void popularVetorUsuario(int array[]) {
        int size = array.length;
        Scanner scan = new Scanner(System.in);
        for(int index = 0; index < size; index++) {
            System.out.println("array[" + index + "] = ");
            array[index] = scan.nextInt();
        }
    }

    static void enterRandomValues(int array[]) {
        int size = array.length;
        Random random = new Random();
        for(int index = 0; index < size; index++) {
            array[index] = random.nextInt(100);
        }
    }

    static void arrayRun1To10() {
        int array[] = new int[10];
        int size = array.length;

        for(int index = 0; index < size; index++) {
            array[index] = index + 1;
        }

        for(int index = 0; index < size; index++) {
            System.out.println(array[index]);
        }
    }

    static int searchForTheBigger(int array[]) {
        int size = array.length;
        int bigger = 0;
        for(int index = 0; index < size; index++) {

            if(index == 0) {
                bigger = array[index];
            }

            if(array[index] > bigger) {
                bigger = array[index];
            }
        }
        return bigger;
    }

    static int searchForTheSmaller(int array[]) {
        int size = array.length;
        int smaller = 0;
        for(int index = 0; index < size; index++) {

            if(index == 0) {
                smaller = array[index];
            }

            if(array[index] < smaller) {
                smaller = array[index];
            }
        }
        return smaller;
    }

    static double calculateMediaArithmeticArray(int array[]) {
        int size = array.length;
        int sum = 0;

        for(int index = 0; index < size; index++) {
            sum = sum + array[index];
        }

        return sum/size;
    }

    static int showNumber(int array[], int position) {
        int size = array.length;
        if(position < 0 || position >= size) {
            System.out.println("Invalid position");
            return -1;
        }

        return array[position];
    }

    static int searchNumberFromPosition(int array[], int value) {
        int size = array.length;
        for(int index = 0; index < size; index++) {
            if(array[index] == value) {
                return index;
            }
        }
        System.out.println("Value not found");
        return -1;
    }

}
