/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.estruturadados.stack;

import java.util.Scanner;

/**
 *
 * @author haganicolau
 */
public class StackMain {
    public static void main(String args[]){
       
    //    String x = "ABCDE";
    //    String y = "EDCBA";

    //     boolean resposta = determinarSeStringXY(x,y);
    //     System.out.println(resposta);

        TorreHanoi hanoi = new TorreHanoi();
        Scanner scan = new Scanner(System.in);

        while(!hanoi.changeComplete()) {

            hanoi.print();

            System.out.println("Quer mover de qual pino para qual pino?");
            
            System.out.println("Origem: ");
            System.out.println("1- Pino 1: ");
            System.out.println("2- Pino 2: ");
            System.out.println("3- Pino 3: ");
            int origem = scan.nextInt();

            StaticStack pinoOrigem = hanoi.getPino(origem);
            if(pinoOrigem == null) {
                System.out.println("número inválido, tente novamente");
                continue;
            }

            System.out.println("Destino: ");
            System.out.println("1- Pino 1: ");
            System.out.println("2- Pino 2: ");
            System.out.println("3- Pino 3: ");
            int destino = scan.nextInt();

            StaticStack pinoDestino = hanoi.getPino(destino);
            if(pinoDestino == null) {
                System.out.println("número inválido, tente novamente");
                continue;
            }

            hanoi.move(pinoOrigem, pinoDestino);

        }
        
    }
    
    /* 1- Criar um código que teste se uma fórmula é bem formada usando estrutura de pilha.
    *   Entrada: vai ser uma string inserida pelo usuário (uma fórmula)
    *   Saída: veradeiro ou falso
    *
    *  (9-5) verdadeiro
    *  (10+(85*8)+5) verdadeiro
    *  ((((8))) falso
    *  (1(5)(4)((3))) verdadeiro
    *  (8((( falso
    *  ))))) falso
    *  ((()()))
    */
//     public static boolean bemFormada(String formula) {
//        StaticStack pilha = new StaticStack(10);
//        try{
            
//            pilha.push(5);
//            pilha.push(4);
//            pilha.push(3);
//            pilha.push(2);
//            pilha.push(1);
           
//            StaticStack pilha2 =  pilha;
           
//            int numero = pilha2.pop();
//            System.out.println(numero);
            
//        } catch(Exception e) {
           
//            System.out.println(e.getMessage());
//        }
       
//        try{
//             for(int index = 0; index<formula.length(); index++) {
//                 char pos = formula.charAt(index);

//                 if(pos == '(') {
//                     pilha.push(1);
// }

//                 else if(pos == ')' ) {
//                     if(pilha.isEmpty()) return false;
//                     pilha.pop();
//                 }
//             }
//        } catch(Exception e) {
//            return false;
//        }
       
//        if(pilha.isEmpty()) return true;
       
//        return false;
//     }
    
   /*
    *02. Escreva um algoritmo que receba um número decimal e converta-o em binário. 
    * faça uso de uma pilha. 
    *
    *12%2 = 0
    *12/2 = 6
    *
    *6%2 = 0
    *6/2 = 3
    *
    *3%2 = 1
    *3/2 = 1
    *
    * 1100
    */
    
    // public static void decimalToTinario(int numero) {
    //     StaticStack pilha = new StaticStack(100);
        
    //     try{
    //         do {
    //             int resto = numero%2;
    //             pilha.push(resto);
    //             numero = numero/2;
    //         } while(numero > 1);

    //         pilha.push(numero);
            
    //         while(!pilha.isEmpty()) {
    //             int num = pilha.pop();
    //             System.out.print(num);
    //         }
    //     } catch(Exception ex) {
    //         System.out.println(ex.getMessage());
    //     }
    // }

    /**
     * Considere uma pilha estática que armazene caracteres. Desenvolva um algoritmo que faça uso
     * de uma função para determinar se uma string é da forma XY, onde X é uma cadeia formada por
     * caracteres arbitrários e Y o reverso de X. Por exemplo, se x = ABCD, então y = DCBA. Considere
     * que x e y são duas strings distintas.
     */
    // public static boolean determinarSeStringXY(String x, String y) {
    //     if(x.length() != y.length()) {
    //         return false;
    //     }

    //     StaticStack pilha = new StaticStack(x.length());

    //     try{
    //         for(int posicao = 0; posicao < x.length(); posicao++) {
    //             pilha.push(x.charAt(posicao));
    //         }
            
    //         int posicao = 0;
    //         while(!pilha.isEmpty()) {
    //             if(pilha.pop() != y.charAt(posicao)) {
    //                 return false;
    //             }
    //             posicao++;
    //         }

    //     }catch(Exception ex) {
    //         System.out.println(ex.getMessage());
    //     }

    //     return true;
    // }

    
}
