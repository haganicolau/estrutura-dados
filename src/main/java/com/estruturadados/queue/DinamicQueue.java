package com.estruturadados.queue;

import com.estruturadados.queue.exception.DequeuException;

public class DinamicQueue {
    private No first;
    private No last;
    private int size;

    DinamicQueue() {
        this.first = new No(-1);
        this.last = new No(-1);
        this.size = 0;
    }

    public int getSize() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public void enqueueu(int value) {
        No newNo = new No(value);

        if(isEmpty()) {
            this.last.setNoProximo(newNo);
            this.first.setNoProximo(newNo);
        }
        else {
            No lastAux = this.last.getNoProximo();
            lastAux.setNoProximo(newNo);
            this.last.setNoProximo(newNo);
        }
        this.size++;
    }

    public int dequeu() throws DequeuException {
        if(isEmpty()) {
            throw new DequeuException();
        }

        No aux = this.first.getNoProximo();
        this.first.setNoProximo(aux.getNoProximo());
        this.size--;
        return aux.getValor();
    }

    public No getLast() {
        return this.last.getNoProximo();
    }
}
