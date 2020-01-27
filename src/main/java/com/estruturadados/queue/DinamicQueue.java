package com.estruturadados.queue;

public class DinamicQueue {

    No first;
    No last;
    int size;

    void create() {
        first = new No();
        first.setNoValor(-1);
        last = new No();
        last.setNoValor(-1);
        size = 0;
    }

    int getSize() {
        return size;
    }

    boolean isEmpty() {
        return size == 0;
    }

    void insert(int value) {
        No newNo = new No();
        newNo.setNoValor(value);

        if(isEmpty()) {
            first.setNoProximo(newNo);
            last.setNoProximo(newNo);
        } else {
            last.getNoProximo().setNoProximo(newNo);
            last.setNoProximo(newNo);
        }
        size++;
    }

    int remove() {
        if(!isEmpty()) {
            No response = first.getNoProximo();
            first.setNoProximo(response.getNoProximo());
            size--;
            return response.getNoValor();
        } else {
            System.out.println("Fila vazia");
            return -1;
        }
    }
}
