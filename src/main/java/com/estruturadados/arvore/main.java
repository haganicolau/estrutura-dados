package com.estruturadados.arvore;

public class main {

    public static void main(String [] args) {
        ArvoreBinaria binaria = new ArvoreBinaria(6);
        binaria.inserir(3);
        binaria.inserir(4);
        binaria.inserir(1);
        binaria.inserir(0);
        binaria.inserir(2);
        binaria.inserir(9);
        binaria.inserir(7);
        binaria.inserir(8);
        binaria.inserir(14);
        binaria.inserir(15);

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

    }
    
}
