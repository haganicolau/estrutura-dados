package com.estruturadados.stack;

import com.estruturadados.stack.exception.PopException;

public class DinamicStack {
    /*Definição do topo*/
    private No top;

    /*defini a quantidade de elementos empilhados*/
    private int size;

    public DinamicStack() {
        this.top = new No(-1);
        this.size = 0;
    }

    public boolean isEmpty() {
        return this.top.getNoProximo() == null;
    }

    public void push(int value) {
        No newNo = new No(value);
        newNo.setNoProximo(this.top.getNoProximo());
        this.top.setNoProximo(newNo);
        this.size++;
    }

    public int pop() throws PopException {
        if(isEmpty()) {
            throw new PopException();
        }

        No aux = this.top.getNoProximo();
        top.setNoProximo(aux.getNoProximo());
        this.size--;
        return aux.getValor();
    }
}
