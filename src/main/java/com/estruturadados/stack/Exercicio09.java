package com.estruturadados.stack;

import com.estruturadados.stack.exception.PopException;
import com.estruturadados.stack.exception.PushException;

import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[] args) {
        /*
        * 9- Desenvolva uma função para testar se duas pilhas estáticas
        *    P1 e P2 são iguais. Duas pilhas são ditas iguais, se possui todos
        *    os elementos na mesma posição.
        * */

        try {
            StaticStack pilha1 = new StaticStack(6);
            StaticStack pilha2 = new StaticStack(5);
            System.out.println("Lendo primeira pilha: ");
            lerPilha(pilha1);
            System.out.println("Lendo segunda pilha: ");
            lerPilha(pilha2);
            boolean resposta = validarSeIguais(pilha1, pilha2);
            System.out.println("Pilhas são iguais? " + resposta);
        } catch (PopException popException) {
            System.out.println(popException.getMessage());
        } catch (PushException pushException) {
            System.out.println(pushException.getMessage());
        }
    }

    public static void lerPilha(StaticStack pilha) throws PushException{
        Scanner scan = new Scanner(System.in);
        for(int contador = 0; contador < pilha.length(); contador++) {
            System.out.println("Informe um elemento: ");
            pilha.push(scan.nextInt());
        }
    }

    public static boolean validarSeIguais(StaticStack pilha1, StaticStack pilha2) throws PopException{
        if(pilha1.length() != pilha2.length()) {
            return false;
        }

        while(!pilha1.isEmpty() && !pilha2.isEmpty()) {
            //int elementoPilha1 = pilha1.pop();
            //int elementoPilha2 = pilha2.pop();
            if(pilha1.pop() != pilha2.pop()) {
                return false;
            }
        }
        return true;
    }
}
