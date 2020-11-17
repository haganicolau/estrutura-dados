package com.estruturadados.list;

import com.estruturadados.list.exceptino.RemoveListException;

public class DinamicDoubleList {

    private No head;
    private No tail;
    private int size;

    public DinamicDoubleList() {
        this.head = new No(-1);
        this.tail = new No(-1);
        this.size = 0;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public void insertFirst(int value) {
        No newNo = new No(value);

        if(isEmpty()) {
            this.head.setNoProximo(newNo);
            newNo.setNoAnterior(this.head);

            this.tail.setNoAnterior(newNo);
            newNo.setNoProximo(this.tail);
        } else {
            No first = this.head.getNoProximo();
            newNo.setNoProximo(first);
            first.setNoAnterior(newNo);
            newNo.setNoAnterior(this.head);
            this.head.setNoProximo(newNo);
        }
        this.size++;
    }

    public void insertLast(int value) {
        No newNo = new No(value);

        if(isEmpty()) {
            this.head.setNoProximo(newNo);
            newNo.setNoAnterior(this.head);
            this.tail.setNoAnterior(newNo);
            newNo.setNoProximo(this.tail);
        } else {
            No last = this.tail.getNoAnterior();
            newNo.setNoAnterior(last);
            last.setNoProximo(newNo);
            newNo.setNoProximo(this.tail);
            this.tail.setNoAnterior(newNo);
        }
        this.size++;
    }

    public int remove() throws RemoveListException {
        if(isEmpty()) {
            throw new RemoveListException();
        }

        No aux = this.head.getNoProximo();
        this.head.setNoProximo(aux.getNoProximo());
        this.head.getNoProximo().setNoAnterior(this.head);
        this.size--;
        return aux.getValor();
    }
}
