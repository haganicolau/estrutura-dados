package com.estruturadados.stack;

/*
 * @author Hagamenon.Oliveira <hagamenon.oliveira@soluti.com.br>
 * @Description Estrutura de pilha simplesmene encadeada
 */
public class DinamicStack {
    
    No top;
    int size;
    
    public DinamicStack() {
        this.top = new No(-1);
        this.size = 0;
    }
    
    public void push(int valor) {
        No newNo = new No(valor);
        newNo.setNoProximo(top.getNoProximo());
        this.top.setNoProximo(newNo);
        size++;
    }
    
    public int pop() throws Exception{
        if(this.size == 0) {
            throw new Exception("pilha vazia");
        }
        
        No aux = top.getNoProximo();
        top.setNoProximo(aux.getNoProximo());
        
        return aux.getValor();
    }
    
    public boolean isEmpty() {
        return this.top.getNoProximo() == null;
    }
    
    public int getSize() {
        return this.size;
    }
    
}