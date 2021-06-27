package com.datastructure.tree;

import com.datastructure.tree.Node.Value;

public class TreeBinaria<T extends Comparable<T>> extends TreeAbstract {

    public TreeBinaria(Value<T> value) {
        super(value);
    }

    /**
     * @description Método que chama o outro método a partir da raiz para encontrar
     *  o local correto de ser inserido na árvore
     * @author Hagamenon Oliveira <haganicolau@gmail.com>
     * @param value float - valor a ser inserido na árvore.
     */
    @Override
    public void inserir(Value value) {
        inserir(this.raiz, value);
    }

    @Override
    public Value<T> remover(Value value) throws Exception {
        return this.remover(this.raiz, value);
    }

    public int altura() {
        return altura(this.raiz);
    }
}
