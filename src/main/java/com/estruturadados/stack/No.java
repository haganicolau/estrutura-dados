/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.estruturadados.stack;

/**
 *
 * @author hagan
 */
public class No {
    
    int valor;
    No proximo;
    
    void create(int novoValor){
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
