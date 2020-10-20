package com.estruturadados.queue;

public class No {
    /*valor que vai receber o nó*/
    private int valor;

    /*Referência do próximo nó*/
    private No noProximo;

    public No(int valor) {
        this.noProximo = null;
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public No getNoProximo() {
        return noProximo;
    }

    public void setNoProximo(No noProximo) {
        this.noProximo = noProximo;
    }
}
