package com.estruturadados.arvore;

public class No {

    int valor;
    No esquerdo;
    No direito;


    public No(int valor) {
        this.valor = valor;
        this.esquerdo = null;
        this.direito = null;
    }

    public int getValor() {
        return this.valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void setEsquerdo(No no) {
        this.esquerdo = no;
    }

    public No getEsquerdo() {
        return this.esquerdo;
    }

    public void setDireito(No no) {
        this.direito = no;
    } 

    public No getDireito() {
        return this.direito;
    }
}
