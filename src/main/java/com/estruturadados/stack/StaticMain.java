package com.estruturadados.stack;

import java.util.Scanner;

public class StaticMain {
    public static void main(String [] args) {

    /*
    * Crie uma função booleana, que verifica se o topo é o maior elemento da pilha.
    * */
        String texto = "Algum texto";
        System.out.println(texto.charAt(3));
//        StaticStack stack = new StaticStack(10);
//        Scanner scan = new Scanner(System.in);
//        for(int contador = 0; contador < 10; contador++) {
//            System.out.println("Informe o elemento: ");
//            stack.push(scan.nextInt());
//        }
//        boolean response = exercicioExtra03(stack);
//        boolean response2 = exercicioExtra04(stack);
//        System.out.println(response2);
    /*
     * Crie uma função booleana, que verifica se o topo é o maior elemento da pilha.
     * e ao final a pilha deve estar na mesma configuração que antes.
     * */

    }

    public static void exercicioExtra01() {
        /*
         * Crie um algoritmo que leia uma pilha estática de 10 posições e imprima
         * (print) todos os valores.
         * */
        StaticStack stack = new StaticStack(10);
        Scanner scan = new Scanner(System.in);
        for(int contador = 0; contador < 10; contador++) {
            System.out.println("Informe o elemento: ");
            stack.push(scan.nextInt());
        }
        System.out.println("Elemento do topo: " + stack.peek());

        while(!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }

    public static void exercicioExtra02() {
        /*
         * Crie um algoritmo que leia uma pilha estática de 15 posições e some
         * os elementos pares após desempilhar
         * */
        StaticStack stack = new StaticStack(15);
        Scanner scan = new Scanner(System.in);
        for(int contador = 0; contador < 15; contador++) {
            System.out.println("Informe o elemento: ");
            stack.push(scan.nextInt());
        }
        int soma = 0;
        while(!stack.isEmpty()) {
            int aux = stack.pop();
            if(aux%2 == 0) {
                soma = soma + aux;
            }
        }
        System.out.println("valor da soma: " + soma);
    }

    public static boolean exercicioExtra03(StaticStack pilha) {
        int topo = pilha.pop();
        while(!pilha.isEmpty()) {
            if(pilha.pop() > topo) {
                return false;
            }
        }
        return true;
    }

    public static boolean exercicioExtra04(StaticStack pilha) {
        int maiorElemento = 0;
        StaticStack stackAux = new StaticStack(pilha.length());
        for(int contador  = 0; contador < pilha.length(); contador++) {
            stackAux.push(pilha.pop());
            if(stackAux.peek() > maiorElemento || contador == 0) {
                maiorElemento = stackAux.peek();
            }
        }
        for(int contador  = 0; contador < stackAux.length(); contador++) {
            pilha.push(stackAux.pop());
        }

        return pilha.peek() == maiorElemento;
    }
}
