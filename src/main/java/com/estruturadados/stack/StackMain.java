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
       
       DinamicStack pilha = new DinamicStack();   
       pilha.push(5);
       pilha.push(4);
       pilha.push(3);
       pilha.push(2);
       pilha.push(1);

       try{
           
            int numero  = pilha.pop();
            System.out.println(numero);
        }catch (Exception e) {
            
            System.out.println(e.getMessage());
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
    public static boolean bemFormada(String formula) {
       StaticStack pilha = new StaticStack(10);
       try{
            
           pilha.push(5);
           pilha.push(4);
           pilha.push(3);
           pilha.push(2);
           pilha.push(1);
           
           StaticStack pilha2 =  pilha;
           
           int numero = pilha2.pop();
           System.out.println(numero);
            
       } catch(Exception e) {
           
           System.out.println(e.getMessage());
       }
       
       
       
       
       
       
       
       
       
       
       
       
       
       try{
            for(int index = 0; index<formula.length(); index++) {
                char pos = formula.charAt(index);

                if(pos == '(') {
                    pilha.push(1);
}

                else if(pos == ')' ) {
                    if(pilha.isEmpty()) return false;
                    pilha.pop();
                }
            }
       } catch(Exception e) {
           return false;
       }
       
       if(pilha.isEmpty()) return true;
       
       return false;
    }
    
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
    
    public static void decimalToTinario(int numero) {
        StaticStack pilha = new StaticStack(100);
        
        try{
            do {
                int resto = numero%2;
                pilha.push(resto);
                numero = numero/2;
            } while(numero > 1);

            pilha.push(numero);
            
            while(!pilha.isEmpty()) {
                int num = pilha.pop();
                System.out.print(num);
            }
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
