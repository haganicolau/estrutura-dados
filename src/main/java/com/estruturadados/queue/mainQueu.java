package com.estruturadados.queue;


import com.estruturadados.queue.exception.DequeuException;

import java.util.Scanner;

/**
 *
 * @author hagan
 */
public class mainQueu {
    public static void main(String args[]){

        exercicio02();
    }

    public static void exExemplo() {
        DinamicQueue fila = new DinamicQueue();
        fila.enqueueu(7);
        fila.enqueueu(14);
        fila.enqueueu(75);
        fila.enqueueu(8);
        fila.enqueueu(133);

        try{
            while(!fila.isEmpty()) {
                int elemento = fila.dequeu();
                System.out.println("elemento fila: " + elemento);
            }
        } catch (DequeuException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void exercicio01() {
        /*
         * 1- Desenvolva um algoritmo em Java, que usa a estrutura de fila simplesmente
         * encadeada para armazenar valores inteiros, busque um elemento. Observação,
         * você só tem acesso às funções de dequeue e enqueue
         * */
        DinamicQueue fila = new DinamicQueue();
        Scanner scan = new Scanner(System.in);
        int elemento = 1;
        while(elemento !=0) {
            System.out.println("Informe um número. 0 para encerrar.");
            elemento = scan.nextInt();
            fila.enqueueu(elemento);
        }

        System.out.println("Informe um número a ser buscado: ");
        int numero = scan.nextInt();

        boolean resposta = buscarNumero(fila, numero);
        if(resposta) {
            System.out.println("número encontrado...");
        } else {
            System.out.println("número não encontrado...");
        }

    }

    public static boolean buscarNumero(DinamicQueue fila, int numero) {
        try{
            while(!fila.isEmpty()) {
                int elemento = fila.dequeu();
                if(numero == elemento)
                    return true;
            }
        } catch(DequeuException ex) {
            System.out.println(ex.getMessage());
        }
        return false;
    }

    public static void exercicio02() {
        /*
        * 2- Dado uma fila sem tamanho definido, enfileire n números inteiros informados
        * pelo usuário, enquanto os números forem diferentes de -1. Apresente a
        * quantidade de elementos inseridos, a média, o maior o menor valor na fila.
         *
        * */
        DinamicQueue fila = new DinamicQueue();
        Scanner scan = new Scanner(System.in);
        int elemento = 1;
        while(elemento != -1) {
            System.out.println("Informe um número. 0 para encerrar.");
            elemento = scan.nextInt();
            fila.enqueueu(elemento);
        }
        int maior = 0, menor = 0, contador = 0, soma = 0;
        double media;

        try{
            while(!fila.isEmpty()) {
                elemento = fila.dequeu();
                if(contador == 0) {
                    maior = elemento;
                    menor = elemento;
                }

                if(elemento > maior) {
                    maior = elemento;
                }

                if(elemento < menor) {
                    menor = elemento;
                }
                soma = soma + elemento;
                contador++;
            }
        } catch (DequeuException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("maior: " + maior);
        System.out.println("menor: " + menor);
        System.out.println("media: " + soma/contador);
        System.out.println("Quantidade elementos: " + contador);

    }

    public static void exercicio03() {
        /*3- Dado uma fila sem tamanho definido, enfileire n números inteiros informados
         * pelo usuário, enquanto os números forem diferentes de -1. Enquanto
         * desenfileira apresente quantidade de elementos inseridos, a média,
         * o maior o menor valor na fila. Ao final do exercício, a fila deve estar em
         * sua configuração original.
        * */
    }

    public static void exercicio04() {
        /*
        * 4-Escreva um programa que simule o controle de uma pista de decolagem
        *    de aviões em um aeroporto. Neste programa, o usuário deve ser capaz de
        *    realizar as seguintes tarefas:
        *    a) Listar o número de aviões aguardando na fila de decolagem;
        *    b) Autorizar a decolagem do primeiro avião da fila;
        *    c) Adicionar um avião à fila de espera;
        *    d) Listar todos os aviões na fila de espera;
        *    e) Listar as características do primeiro avião da fila
        *
        *   Os aviões serão definidos por inteiros.
        * */
    }
}
