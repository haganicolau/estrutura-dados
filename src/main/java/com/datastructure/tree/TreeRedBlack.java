package com.datastructure.tree;

import com.datastructure.tree.Node.Value;

public class TreeRedBlack<T extends Comparable<T>> extends TreeAbstract {

    public TreeRedBlack(Value<T> value) {
        super(value);
        this.raiz.setBlackNode();
    }

    @Override
    public void inserir(Value value) {
        this.inserir(this.raiz, value);

        /**
         * Validar as propriedades da árvore, se preciso
         * balancear
         */
    }

    @Override
    public Value remover(Value value) throws Exception {
        return null;
    }

    @Override
    public int altura() {
        return this.altura(this.raiz);
    }

}