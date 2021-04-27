package com.estruturadados.arvore;

public class No {

    private No esquerdo; //left
    private No direito; //right
    private int valor;
    private int fb;

    public No(int valor) {
        this.valor = valor;
        this.esquerdo = null;
        this.direito = null;
        this.fb = 0;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return this.valor;
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

    public int getFb() {
        return fb;
    }

    public void setFb(int fb) {
        this.fb = fb;
    }
  
}
