package com.estruturadados.linear.stack;

import com.estruturadados.linear.stack.exception.PopException;
import com.estruturadados.linear.stack.exception.PushException;
import java.util.Scanner;

public class StackMain {
    public static void main(String [] args) {

        /*
        * 1- Crie um algoritmo que leia uma pilha dinâmica, que
        * vai empilhar enquanto os elementos forem diferentes de 0,
        * quando terminar, desempilhar printando todos os valores.
        *
        * */

        DinamicStack pilha = new DinamicStack();
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int elemento = scan.nextInt();

        while(elemento != 0) {
            pilha.push(elemento);

            System.out.println("Informe um número: ");
            elemento = scan.nextInt();
        }

        try {
            System.out.println(" ");
            System.out.println("Printando elementos da pilha: ");
            while (!pilha.isEmpty()) {
                elemento = pilha.pop();
                System.out.println("elemento: "+elemento);
            }
        } catch (PopException ex) {
            System.out.println(ex.getMessage());
        }

    }

    public static void exemploPilhaDinamica() {
        DinamicStack pilha = new DinamicStack();

        pilha.push(7);
        pilha.push(14);
        pilha.push(75);
        pilha.push(8);
        pilha.push(133);

        try{
            int valor1 = pilha.pop();
            System.out.println("valor 1: "+ valor1);

            int valor2 = pilha.pop();
            System.out.println("valor 2: "+ valor2);

            int valor3 = pilha.pop();
            System.out.println("valor 3: "+ valor3);

            int valor4 = pilha.pop();
            System.out.println("valor 4: "+ valor4);

            int valor5 = pilha.pop();
            System.out.println("valor 5: "+ valor5);
        } catch( PopException exc) {
            System.out.println(exc.getMessage());
        }
    }

    public static void exercicioExtra01() {
        /*
         * Crie um algoritmo que leia uma pilha estática de 10 posições e imprima
         * (print) todos os valores.
         * */
        StaticStack stack = new StaticStack(10);
        Scanner scan = new Scanner(System.in);

        try {
            for (int contador = 0; contador < 10; contador++) {
                System.out.println("Informe o elemento: ");
                stack.push(scan.nextInt());
            }
        } catch (PushException pushException) {
            System.out.println(pushException.getMessage());
        }

        System.out.println("Elemento do topo: " + stack.peek());

        try {
            while (!stack.isEmpty()) {
                System.out.println(stack.pop());
            }
        } catch (PopException popException) {
            System.out.println(popException.getMessage());
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
            try {
                stack.push(scan.nextInt());
            } catch (PushException pushException) {
                System.out.println(pushException.getMessage());
                break;
            }
        }
        int soma = 0;
        try {
            while(!stack.isEmpty()) {
                int aux = stack.pop();
                if(aux%2 == 0) {
                    soma = soma + aux;
                }
            }
        } catch (PopException popException) {
            System.out.println(popException.getMessage());
        }
        System.out.println("valor da soma: " + soma);
    }

    public static boolean exercicioExtra03(StaticStack pilha) {
        try {
            int topo = pilha.pop();
            while (!pilha.isEmpty()) {
                if (pilha.pop() > topo) {
                    return false;
                }
            }
            return true;
        } catch (PopException popException) {
            System.out.println(popException.getMessage());
            return false;
        }
    }

    public static boolean exercicioExtra04(StaticStack pilha) {
        int maiorElemento = 0;
        StaticStack stackAux = new StaticStack(pilha.length());
        for(int contador  = 0; contador < pilha.length(); contador++) {
            try {
                stackAux.push(pilha.pop());
            } catch (PushException pushException) {
                System.out.println(pushException.getMessage());
                break;
            } catch (PopException popException) {
                System.out.println(popException.getMessage());
            }
            if(stackAux.peek() > maiorElemento || contador == 0) {
                maiorElemento = stackAux.peek();
            }
        }
        for(int contador  = 0; contador < stackAux.length(); contador++) {
            try {
                pilha.push(stackAux.pop());
            } catch (PushException pushException) {
                System.out.println(pushException.getMessage());
                break;
            } catch (PopException popException) {
                System.out.println(popException.getMessage());
                break;
            }
        }

        return pilha.peek() == maiorElemento;
    }
}
