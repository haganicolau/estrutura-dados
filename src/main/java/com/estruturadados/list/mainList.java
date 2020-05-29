package com.estruturadados.list;

public class mainList {
    public static void main (String args[]) {
        
        /**
         * 1- Escreva uma função que verifique se uma lista encadeada que contém números inteiros está em
             ordem crescente. Retorne verdadeiro ou false.
        */
        
        
        DinamicList list = new DinamicList();
        list.insert(0);
        list.insert(1);
        list.insert(6);
        list.insert(3);
        list.insert(4);
        list.insert(5);

        try{
            int profundidade = list.profundidade(3);
            System.out.println(profundidade);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        /** 
         * 2- Escreva uma função que encontre em uma lista simplesmente encadeada o valor mínimo.
         * 
        */
    }

}