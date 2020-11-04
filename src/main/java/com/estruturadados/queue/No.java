package com.estruturadados.queue;

public class No {
    /*valor que vai receber o nó*/
    int valor;

    /*referência ao próximo nó*/
    private No noProximo;

    public No(Integer value) {
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
