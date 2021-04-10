package com.estruturadados.arvore;

public class ArvoreBinaria {

    No raiz;

    public ArvoreBinaria(int valor) {
        this.raiz = new No(valor);
    }

    public void inserir(int valor) {
        this.inserir(this.raiz, valor);
    }

    public void inserir(No no, int valor) {
        if(valor < no.getValor()) {
            //esquerda
            if(no.getEsquerdo() == null) {
                No novo = new No(valor);
                no.setEsquerdo(novo);
            }
            else {
                inserir(no.getEsquerdo(), valor);
            }
        }
        else {
            //direita
            if(no.getDireito() == null) {
                No novo = new No(valor);
                no.setDireito(novo);
            }
            else {
                inserir(no.getDireito(), valor);
            }
        }
    }

    public void preOrdem() {
        preOrdem(this.raiz);
    }

    public void preOrdem(No no) {
        if(no != null) {
            System.out.print(no.getValor() + ", ");
            preOrdem(no.getEsquerdo());
            preOrdem(no.getDireito());
        }
    }

    public void emOrdem() {
        emOrdem(this.raiz);
    }

    public void emOrdem(No no) {
        if(no != null) {
            emOrdem(no.getEsquerdo());
            System.out.print(no.getValor() + ", ");
            emOrdem(no.getDireito());
        }
    }

    public void posOrdem() {
        posOrdem(this.raiz);
    }

    public void posOrdem(No no) {
        if(no != null) {
            posOrdem(no.getEsquerdo());
            posOrdem(no.getDireito());
            System.out.print(no.getValor() + ", ");
        }
    }

}
