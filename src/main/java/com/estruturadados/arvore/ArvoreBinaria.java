package com.estruturadados.arvore;

public class ArvoreBinaria extends ArvoreAbstract {

    public ArvoreBinaria(int valor) {
        super(valor);
    }

    /**
     * @description Método que chama o outro método a partir da raiz para encontrar
     *  o local correto de ser inserido na árvore
     * @author Hagamenon Oliveira <haganicolau@gmail.com>
     * @param valor float - valor a ser inserido na árvore.
     */
    public void inserir(int valor) {
        inserir(this.raiz, valor);
    }

    public int remover(int valor) throws Exception {
        return this.remover(this.raiz, valor);
    }

    public int altura() {
        return altura(this.raiz);
    }
}
