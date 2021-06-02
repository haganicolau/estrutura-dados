package com.estruturadados.arvore.No;

public class No <T extends Comparable<T>>{

    private No<T> esquerdo;
    private No<T> direito;
    private No<T> pai;
    private Valor<T> valor;


    private int fb;


    private boolean RED;
    private boolean BLACK;

    public No(Valor<T> valor) {
        this.valor = valor;
        this.esquerdo = null;
        this.direito = null;
        this.pai = null;
        this.fb = 0;
        this.BLACK = false;
        this.RED = true;
    }

    public void setValor(Valor<T> valor) {
        this.valor = valor;
    }

    public Valor<T> getValor() {
        return this.valor;
    }

    public void setEsquerdo(No<T> no) {
        this.esquerdo = no;
    }

    public No<T> getEsquerdo() {
        return this.esquerdo;
    }

    public void setDireito(No<T> no) {
        this.direito = no;
    }

    public No<T> getDireito() {
        return this.direito;
    }

    public void setPai(No<T> no) {
        this.pai = no;
    }

    public No<T> getPai() {
        return this.pai;
    }

    public int getFb() {
        return fb;
    }

    public void setFb(int fb) {
        this.fb = fb;
    }

    public void setRedNode() {
        this.RED = true;
        this.BLACK = false;
    }

    public void setBlackNode() {
        this.RED = false;
        this.BLACK = true;
    }

    public boolean isBlackNode() {
        return this.BLACK;
    }

    public boolean isRedNode() {
        return this.RED;
    }

    public boolean isRoot() {
        return this.pai == null;
    }
  
}
