package com.estruturadados.arvore;

public class ArvoreAVL extends ArvoreAbstract {

    public ArvoreAVL(int valor) {
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

    @Override
    public int remover(int valor) throws Exception {
        // TODO Auto-generated method stub
        return 0;
    }

}