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
public class DinamicStack {
    No topo;
    int size;
    
    public void create(){
        this.topo = new No();
        this.topo.create(-1);
        this.size = 0;
    }
    
    public void push(int value){
        No novoNo = new No();
        novoNo.create(value);
        novoNo.setNoProximo(topo.getNoProximo());
        topo.setNoProximo(novoNo);
        size++;
    }
    
    public boolean isEmpty(){
        return topo.getNoProximo() == null;
    }
    
    public int pop(){
        No NoReturn = topo.getNoProximo();
        topo.setNoProximo(NoReturn.getNoProximo());
        size--;
        return NoReturn.getNoValor();
    }
    
    public No peek(){
        return topo;
    }


    /**Função responsável por informar o tamamnho atual da pilha*/
    public int size(){
        return size;
    }

    /*printa pilha dinâmica*/
    public int printAll(No aux){
        if(aux.getNoProximo() == null){
            return aux.getNoValor();
        } else {
            int response =  printAll(aux.getNoProximo());
            System.out.println(response);
            return aux.getNoValor();
        }
    }


}
