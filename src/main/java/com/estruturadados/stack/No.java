package com.estruturadados.stack;

public class No {

    /*valor a ser manipulado*/
    private int valor;

    /*No que recebe a referênciad o próximo nó*/
    private No noProximo;

    public No(int valor) {
        this.valor = valor;
        this.noProximo = null;
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
