package com.estruturadados.queue;

/**
 *
 * @author hagan
 */
public class No {
    
    /*valor que vai receber o nó*/
    int valor;
    
    /*Nó a ser encadeado*/
    No proximo;
    
    /*construtor do Nó*/
    public No(int valor){
        /*ao ser construído não existe nó encadeado*/
        this.proximo = null;
        this.valor = valor;
    }
    
    int getValor() {
        return this.valor;
    }
    
    No getNoProximo() {
        return this.proximo;
    }
    
    void setNoProximo(No novoNo) {
        this.proximo = novoNo;
    }
}
