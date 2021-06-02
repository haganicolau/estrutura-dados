package com.estruturadados.arvore;

import com.estruturadados.arvore.No.Valor;

public class ArvoreBinaria <T extends Comparable<T>> extends ArvoreAbstract {

    public ArvoreBinaria(Valor<T> valor) {
        super(valor);
    }

    /**
     * @description Método que chama o outro método a partir da raiz para encontrar
     *  o local correto de ser inserido na árvore
     * @author Hagamenon Oliveira <haganicolau@gmail.com>
     * @param valor float - valor a ser inserido na árvore.
     */
    @Override
    public void inserir(Valor valor) {
        inserir(this.raiz, valor);
    }

    @Override
    public Valor<T> remover(Valor valor) throws Exception {
        return this.remover(this.raiz, valor);
    }

    public int altura() {
        return altura(this.raiz);
    }
}
