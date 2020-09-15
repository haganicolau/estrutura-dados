package com.estruturadados.vetor;

import java.util.Scanner;

public class Exercicio9 {

    public static void main(String [] args) {
        /*
        * 9- Crie um algoritmo que além da função main, tenha mais 3 funções que receba
        * um vetor por parâmetro e cada função deve retornar respectivamente o maior
        * valor, menor valor e o valor que se encontra na metade do array. Tanto
        * o tamanho do vetor quanto todos os elementos inseridos devem ser informados
        * pelo usuário.
        * */
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o tamanho do vetor: ");
        int tamanho = scan.nextInt();
        int vetor[] = new int[tamanho];

        for(int indice = 0; indice < vetor.length; indice++) {
            System.out.println("vetor["+indice+"]=");
            vetor[indice] = scan.nextInt();
        }

        int maiorElemento = maiorElemento(vetor);
        System.out.println("Maior: " + maiorElemento);

        int menorElemento = menorElemento(vetor);
        System.out.println("Menor: " + menorElemento);

        int elementoMeio = elementoMeio(vetor);
        System.out.println("Menor: " + elementoMeio);
    }

    public static int maiorElemento(int vet[]) {
        int maior = 0;
        for(int indice = 0; indice < vet.length; indice++) {
            if(indice == 0) {
                maior = vet[indice];
            }

            if(vet[indice] > maior) {
                maior = vet[indice];
            }
        }
        return maior;
    }

    public static int menorElemento(int vet[]) {
        int menor = 0;
        for(int indice = 0; indice < vet.length; indice++) {
            if(indice == 0) {
                menor = vet[indice];
            }

            if(vet[indice] < menor) {
                menor = vet[indice];
            }
        }
        return menor;
    }

    public static int elementoMeio(int vet[]) {
        int indiceMeio = vet.length/2;
        return vet[indiceMeio];
    }

}
