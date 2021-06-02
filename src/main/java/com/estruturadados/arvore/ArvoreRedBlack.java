package com.estruturadados.arvore;

import com.estruturadados.arvore.No.Valor;

public class ArvoreRedBlack <T extends Comparable<T>> extends ArvoreAbstract {

    public ArvoreRedBlack(Valor<T> valor) {
        super(valor);
        this.raiz.setBlackNode();
    }

    @Override
    public void inserir(Valor valor) {
        this.inserir(this.raiz, valor);

        /**
         * Validar as propriedades da árvore, se preciso
         * balancear
         */
    }

    @Override
    public Valor remover(Valor valor) throws Exception {
        return null;
    }

    @Override
    public int altura() {
        return this.altura(this.raiz);
    }

}