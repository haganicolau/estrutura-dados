package com.datastructure.linear.queue;


import com.datastructure.linear.queue.exception.DequeuException;

import java.util.Scanner;

/**
 *
 * @author hagan
 */
public class mainQueu {
    public static void main(String[] args){

        exercise02();
    }

    public static void exExemplo() {
        DinamicQueue queue = new DinamicQueue();
        queue.enqueueu(7);
        queue.enqueueu(14);
        queue.enqueueu(75);
        queue.enqueueu(8);
        queue.enqueueu(133);

        try{
            while(!queue.isEmpty()) {
                int number = queue.dequeue();
                System.out.println("number queue: " + number);
            }
        } catch (DequeuException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void exercicio01() {
        /*
         * 1- Desenvolva um algoritmo em Java, que usa a estrutura de queue simplesmente
         * encadeada para armazenar valores inteiros, busque um number. Observação,
         * você só tem acesso às funções de dequeue e enqueue
         * */
        DinamicQueue queue = new DinamicQueue();
        Scanner scan = new Scanner(System.in);
        int number = 1;
        while(number !=0) {
            System.out.println("Enter a number 0 to terminate.");
            number = scan.nextInt();
            queue.enqueueu(number);
        }

        System.out.println("Enter a number to be searched: ");
        number = scan.nextInt();

        boolean resposta = searchNumber(queue, number);
        if(resposta) {
            System.out.println("number found...");
        } else {
            System.out.println("number not found...");
        }

    }

    public static boolean searchNumber(DinamicQueue queue, int number) {
        try{
            while(!queue.isEmpty()) {
                int elemento = queue.dequeue();
                if(number == elemento)
                    return true;
            }
        } catch(DequeuException ex) {
            System.out.println(ex.getMessage());
        }
        return false;
    }

    public static void exercise02() {
        /*
        * 2- Dado uma queue sem tamanho definido, enfileire n números inteiros informados
        * pelo usuário, enquanto os números forem diferentes de -1. Apresente a
        * quantidade de elementos inseridos, a média, o bigger o smaller valor na queue.
         *
        * */
        DinamicQueue queue = new DinamicQueue();
        Scanner scan = new Scanner(System.in);
        int number = 1;
        while(number != -1) {
            System.out.println("Enter a number 0 to terminate.");
            number = scan.nextInt();
            queue.enqueueu(number);
        }
        int bigger = 0, smaller = 0, counter = 0, sum = 0;
        double media;

        try{
            while(!queue.isEmpty()) {
                number = queue.dequeue();
                if(counter == 0) {
                    bigger = number;
                    smaller = number;
                }

                if(number > bigger) {
                    bigger = number;
                }

                if(number < smaller) {
                    smaller = number;
                }
                sum = sum + number;
                counter++;
            }
        } catch (DequeuException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("bigger: " + bigger);
        System.out.println("smaller: " + smaller);
        System.out.println("media: " + sum/counter);
        System.out.println("Counter: " + counter);

    }

    public static void exercise03() {
        /*3- Dado uma fila sem tamanho definido, enfileire n números inteiros informados
         * pelo usuário, enquanto os números forem diferentes de -1. Enquanto
         * desenfileira apresente quantidade de elementos inseridos, a média,
         * o maior o menor valor na fila. Ao final do exercício, a fila deve estar em
         * sua configuração original.
        * */
    }

    public static void exercise04() {
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
