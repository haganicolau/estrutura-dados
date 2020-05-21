package com.estruturadados.list;

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
    public No(){
        /*ao ser construído não existe nó encadeado*/
        this.proximo = null;
    }
    
    public int getValor() {
        return this.valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    public No getNoProximo() {
        return this.proximo;
    }
    
    public void setNoProximo(No novoNo) {
        this.proximo = novoNo;
    }
}
