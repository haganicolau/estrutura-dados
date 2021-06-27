package com.datastructure.linear.stack;

import com.datastructure.linear.stack.exception.PopException;
import com.datastructure.linear.stack.exception.PushException;
import java.util.Scanner;

public class StackMain {
    public static void main(String [] args) {

        /*
        * 1- Crie um algoritmo que leia uma stack dinâmica, que
        * vai empilhar enquanto os elementos forem diferentes de 0,
        * quando terminar, desempilhar printando todos os valores.
        *
        * */

        DinamicStack stack = new DinamicStack();
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scan.nextInt();

        while(number != 0) {
            stack.push(number);

            System.out.println("Enter a number: ");
            number = scan.nextInt();
        }

        try {
            System.out.println(" ");
            System.out.println("Printing elements from the stack: ");
            while (!stack.isEmpty()) {
                number = stack.pop();
                System.out.println("number: "+number);
            }
        } catch (PopException ex) {
            System.out.println(ex.getMessage());
        }

    }

    public static void exampleDynamicStack() {
        DinamicStack stack = new DinamicStack();

        stack.push(7);
        stack.push(14);
        stack.push(75);
        stack.push(8);
        stack.push(133);

        try{
            int value1 = stack.pop();
            System.out.println("value 1: "+ value1);

            int value2 = stack.pop();
            System.out.println("value 2: "+ value2);

            int value3 = stack.pop();
            System.out.println("value 3: "+ value3);

            int value4 = stack.pop();
            System.out.println("value 4: "+ value4);

            int value5 = stack.pop();
            System.out.println("valor 5: "+ value5);
        } catch( PopException exc) {
            System.out.println(exc.getMessage());
        }
    }

    public static void exerciseExtra01() {
        /*
         * Crie um algoritmo que leia uma pilha estática de 10 posições e imprima
         * (print) todos os valores.
         * */
        StaticStack stack = new StaticStack(10);
        Scanner scan = new Scanner(System.in);

        try {
            for (int counter = 0; counter < 10; counter++) {
                System.out.println("Enter a number: ");
                stack.push(scan.nextInt());
            }
        } catch (PushException pushException) {
            System.out.println(pushException.getMessage());
        }

        System.out.println("Top Number: " + stack.peek());

        try {
            while (!stack.isEmpty()) {
                System.out.println(stack.pop());
            }
        } catch (PopException popException) {
            System.out.println(popException.getMessage());
        }
    }

    public static void exerciseExtra02() {
        /*
         * Crie um algoritmo que leia uma pilha estática de 15 posições e some
         * os elementos pares após desempilhar
         * */
        StaticStack stack = new StaticStack(15);
        Scanner scan = new Scanner(System.in);
        for(int counter = 0; counter < 15; counter++) {
            System.out.println("Enter a number: ");
            try {
                stack.push(scan.nextInt());
            } catch (PushException pushException) {
                System.out.println(pushException.getMessage());
                break;
            }
        }
        int sum = 0;
        try {
            while(!stack.isEmpty()) {
                int aux = stack.pop();
                if(aux%2 == 0) {
                    sum = sum + aux;
                }
            }
        } catch (PopException popException) {
            System.out.println(popException.getMessage());
        }
        System.out.println("Sum: " + sum);
    }

    public static boolean exerciseExtra03(StaticStack stack) {
        try {
            int top = stack.pop();
            while (!stack.isEmpty()) {
                if (stack.pop() > top) {
                    return false;
                }
            }
            return true;
        } catch (PopException popException) {
            System.out.println(popException.getMessage());
            return false;
        }
    }

    public static boolean exerciseExtra04(StaticStack stack) {
        int biggestNumber = 0;
        StaticStack stackAux = new StaticStack(stack.length());
        for(int counter  = 0; counter < stack.length(); counter++) {
            try {
                stackAux.push(stack.pop());
            } catch (PushException pushException) {
                System.out.println(pushException.getMessage());
                break;
            } catch (PopException popException) {
                System.out.println(popException.getMessage());
            }
            if(stackAux.peek() > biggestNumber || counter == 0) {
                biggestNumber = stackAux.peek();
            }
        }
        for(int counter  = 0; counter < stackAux.length(); counter++) {
            try {
                stack.push(stackAux.pop());
            } catch (PushException | PopException pushException) {
                System.out.println(pushException.getMessage());
                break;
            }
        }

        return stack.peek() == biggestNumber;
    }
}
