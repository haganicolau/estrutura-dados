package com.estruturadados.queue;

/**
 *
 * @author hagan
 */
public class No {

    int valor;
    No proximo;

    void crate(int novoValor){
        this.valor = novoValor;
    }

    int getNoValor(){
        return valor;
    }

    void setNoValor(int novoValor){
        this.valor = novoValor;
    }

    No getNoProximo(){
        return this.proximo;
    }

    void setNoProximo(No newNext){
        this.proximo = newNext;
    }
}

