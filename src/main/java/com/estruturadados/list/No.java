package com.estruturadados.list;

public class No {
    /*valor que será manipulador*/
    int valor;

    /*
    * referência ao próximo nó
    * cor: vermelho
    * */
    private No noProximo;

    /*
    * referência ao nó anterior
    * cor: azul
    * */
    private No noAnterior;

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

    public No getNoAnterior() {
        return noAnterior;
    }

    public void setNoAnterior(No noAnterior) {
        this.noAnterior = noAnterior;
    }
}
