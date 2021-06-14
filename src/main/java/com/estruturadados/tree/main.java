package com.estruturadados.tree;

import com.estruturadados.tree.Node.Value;

public class main {

    public static void main(String [] args) {

        Value<Integer> value30 = new Value<Integer>(30);
        Value<Integer> value24 = new Value<Integer>(24);
        Value<Integer> value7 = new Value<Integer>(7);
        Value<Integer> value19 = new Value<Integer>(19);
        Value<Integer> value17 = new Value<Integer>(17);
        Value<Integer> value32 = new Value<Integer>(32);
        Value<Integer> value12 = new Value<Integer>(12);
        Value<Integer> value9 = new Value<Integer>(9);

        TreeAVL<Integer> avl = new TreeAVL<Integer>(value30);
        avl.inserir(value24);
        avl.inserir(value7);
        avl.inserir(value19);
        avl.inserir(value17);
        avl.inserir(value32);
        avl.inserir(value12);
        avl.inserir(value9);

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
