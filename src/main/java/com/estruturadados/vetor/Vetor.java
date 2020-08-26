package com.estruturadados.vetor;

import java.util.Random;
import java.util.Scanner;

public class Vetor {

    public static void main (String [] args) {

        /*
         * 1- Crie um algoritmo que crie um vetor de 10 posições, insira os números de 1 a 10.
         *    Depois imprima os valores.
         */
        correrVetor1a10();

        /*
        * 2- Crie um algoritmo com 30 posições, peça que o usuário preencha com valores aleatórios.
        *    Após preenchido identifique o maior e o menor elemento do array.
        */
        int vetor[] = criarVetor(5);
        popularVetorRandomico(vetor);
        int maior = procurarMaior(vetor);



        int menor = procurarMenor(vetor);
        System.out.println("maior: " + maior);
        System.out.println("menor: " + menor);

        /*
         * 3- Crie um algoritmo que leia 50 valores e insira em um array. Posteriormente, calcule a média aritmética dos valores do array.
         */
        popularVetorRandomico(vetor);
        double mediaAritmetica = calcularMediaAritmeticaVetor(vetor);
        System.out.println("média: " + mediaAritmetica);

        /*
        * 4- Crie uma função que você passa um array e uma posição por parâmetro e ele retorna o elemento da posição.
        *    Se posição inválida, informar ao usuário: “Posição inválida”. retornar -1;
        * */
        int elemento = mostrarElemento(vetor, 51);
        System.out.println("elemento posicao 34: " + elemento);

        /*
         * 5- Crie uma função que você passa um array e um elemento e busque este elemento no array e retorna a posição
         *    Se elemento não encontrado, informar 'elemento nao encontrado' retornar -1;
         *
         * */
        int posicao = buscarElementoApartirPosicao(vetor, 5);
        System.out.println("posicao do valor 5: " + posicao);

    }

    static int[] criarVetor(int tamanho) {
        int vetor[] = new int[tamanho];
        return vetor;
    }

    static void popularVetorUsuario(int vetor[]) {
        int tamanho = vetor.length;
        Scanner scan = new Scanner(System.in);
        for(int indice = 0; indice < tamanho; indice++) {
            System.out.println("Informe o valor vetor[" + indice + "] = ");
            vetor[indice] = scan.nextInt();
        }
    }

    static void popularVetorRandomico(int vetor[]) {
        int tamanho = vetor.length;
        Random random = new Random();
        for(int indice = 0; indice < tamanho; indice++) {
            vetor[indice] = random.nextInt(100);
        }
    }

    static void correrVetor1a10() {

        int vetor[] = new int[10];
        int tamanho = vetor.length;

        for(int indice = 0; indice < tamanho; indice++) {
            vetor[indice] = indice + 1;
        }

        for(int indice = 0; indice < tamanho; indice++) {
            System.out.println(vetor[indice]);
        }
    }

    static int procurarMaior(int vetor[]) {
        int tamanho = vetor.length;
        int maior = 0;
        for(int indice = 0; indice < tamanho; indice++) {

            if(indice == 0) {
                maior = vetor[indice];
            }

            if(vetor[indice] > maior) {
                maior = vetor[indice];
            }
        }
        return maior;
    }

    static int procurarMenor(int vetor[]) {
        int tamanho = vetor.length;
        int menor = 0;
        for(int indice = 0; indice < tamanho; indice++) {

            if(indice == 0) {
                menor = vetor[indice];
            }

            if(vetor[indice] < menor) {
                menor = vetor[indice];
            }
        }
        return menor;
    }

    static double calcularMediaAritmeticaVetor(int vetor[]) {
        int tamanho = vetor.length;
        int somaTodas = 0;

        for(int indice = 0; indice < tamanho; indice++) {
            somaTodas = somaTodas + vetor[indice];
        }

        return somaTodas/tamanho;
    }

    static int mostrarElemento(int vetor[], int posicao) {
        int tamanho = vetor.length;
        if(posicao < 0 || posicao >= tamanho) {
            System.out.println("Posicao inválida");
            return -1;
        }

        return vetor[posicao];
    }

    static int buscarElementoApartirPosicao(int vetor[], int valor) {
        int tamanho = vetor.length;
        for(int indice = 0; indice < tamanho; indice++) {
            if(vetor[indice] == valor) {
                return indice;
            }
        }
        System.out.println("Valor não encontrado");
        return -1;
    }

}
