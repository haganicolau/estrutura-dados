package com.estruturadados.arvore;

/**
* @description classe nó da árvore binária
* @author Hagamenon.Oliveira <haganicolau@gmail.com>
* @version 1
*/
public class No {
    private float valor;
    private No esquerdo;
    private No direito;
    private int fb;
    
    public No() {
        this.valor = 0;
        this.fb = 0;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public No getEsquerdo() {
        return esquerdo;
    }

    public void setEsquerdo(No esquerdo) {
        this.esquerdo = esquerdo;
    }

    public No getDireito() {
        return direito;
    }

    public void setDireito(No direito) {
        this.direito = direito;
    }

    public int getFb() {
        return fb;
    }

    public void setFb(int fb) {
        this.fb = fb;
    }
}
