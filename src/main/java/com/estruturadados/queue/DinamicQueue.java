package com.estruturadados.queue;

public class DinamicQueue {
    
    No first;
    No last;
    int size;
    
    public DinamicQueue() {
        this.first = new No(-1);
        this.last = new No(-1);
        this.size = 0;
    }
    
    public int getSize() {
        return this.size;
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public void queue(int value) {
        No newNo = new No(value);
        
        if(isEmpty()) {
            this.first.setNoProximo(newNo);
            this.last.setNoProximo(newNo);
        } else {
            this.last.getNoProximo().setNoProximo(newNo);
            this.last.setNoProximo(newNo);
        }
        
        this.size++;
    }
    
    public int dequeue() throws Exception {
        if(isEmpty()) {
            throw new Exception("Fila vazia");
        }
        
        No aux = first.getNoProximo();
        
        first.setNoProximo(aux.getNoProximo());
        this.size--;
        return aux.getValor();
    }
}