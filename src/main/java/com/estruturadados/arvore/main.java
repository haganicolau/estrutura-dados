package com.estruturadados.arvore;

import com.estruturadados.arvore.No.Valor;

public class main {

    public static void main(String [] args) {

        Valor<Integer> valor30 = new Valor<Integer>(30);
        Valor<Integer> valor24 = new Valor<Integer>(24);
        Valor<Integer> valor7 = new Valor<Integer>(7);
        Valor<Integer> valor19 = new Valor<Integer>(19);
        Valor<Integer> valor17 = new Valor<Integer>(17);
        Valor<Integer> valor32 = new Valor<Integer>(32);
        Valor<Integer> valor12 = new Valor<Integer>(12);
        Valor<Integer> valor9 = new Valor<Integer>(9);

        ArvoreAVL<Integer> avl = new ArvoreAVL<Integer>(valor30);
        avl.inserir(valor24);
        avl.inserir(valor7);
        avl.inserir(valor19);
        avl.inserir(valor17);
        avl.inserir(valor32);
        avl.inserir(valor12);
        avl.inserir(valor9);

        System.out.println();
        System.out.println();
        System.out.println();

        avl.preOrdem();
        System.out.println();
        System.out.println();

        avl.emOrdem();
        System.out.println();
        System.out.println();

        avl.posOrdem();
        System.out.println();
    }

}
