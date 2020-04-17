
package com.estruturadados.stack;

/*
 * @author Hagamenon.Oliveira <hagamenon.oliveira@soluti.com.br>
 * @Description Estrutura básica que será encadeada
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