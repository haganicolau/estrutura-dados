/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.estruturadados.stack;

/**
 *
 * @author haganicolau
 */
public class StackMain {
    public static void main(String args[]){
        
        StaticStack pilha = new StaticStack(5);
        
        try{
            //top -1
            pilha.push(9); // 0
            pilha.push(84); // 1
            pilha.push(73); // 2

            pilha.print();
            
        } catch(Exception ex ) {
            
            System.out.println(ex.getMessage());
        }
        
    }
}
