package com.estruturadados.arvore;

public class main {

    public static void main(String [] args) {
        ArvoreBinaria binaria = new ArvoreBinaria(1);
        binaria.inserir(2);
        binaria.inserir(3);
        binaria.inserir(4);
        binaria.inserir(5);
        binaria.inserir(6);
        binaria.inserir(7);
        binaria.inserir(8);
        binaria.inserir(9);
        binaria.inserir(10);

        System.out.println("Pré ordem: ");
        binaria.preOrdem();

        System.out.println();
        System.out.println();

        System.out.println("Em ordem: ");
        binaria.emOrdem();

        System.out.println();
        System.out.println();

        System.out.println("Pós ordem: ");
        binaria.posOrdem();

        System.out.println();

        try {
            int numero = binaria.remover(9);
            System.out.println(numero);
        }catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}
