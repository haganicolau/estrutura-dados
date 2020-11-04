package com.estruturadados.list;

public class No {
    /*valor que será manipulador*/
    int valor;

    /*referência ao próximo nó*/
    private No noProximo;

    public No(int value) {
        this.valor = value;
        this.noProximo = null;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public No getNoProximo() {
        return noProximo;
    }

    public void setNoProximo(No noProximo) {
        this.noProximo = noProximo;
    }
}
