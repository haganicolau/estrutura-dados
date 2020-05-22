package com.estruturadados.list;

public class DinamicList {

    int size;
    No start;

    public DinamicList() {
        this.start = new No();
        this.size = 0;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public int getSize() {
        return this.size;
    }

    public void insert(int value) {
        No newNo = new No();
        newNo.setValor(value);

        if(isEmpty()) {
            this.start = newNo;
        }
        else {
            insertNo(this.start, newNo);
        }
        this.size++;
    }

    public void insertNo(No aux, No newNo) {
        while(aux.proximo != null) {
            aux = aux.getNoProximo();
        }

        aux.setNoProximo(newNo);
    }

    public int remove() throws Exception {
        if(isEmpty()) {
            throw new Exception("Lista vazia");
        }

        No aux = this.start;
        int value = aux.getValor();

        this.start = aux.getNoProximo();
        this.size--;
        return value;
    }

    public void list() throws Exception { 
        if(isEmpty()) {
            throw new Exception("Lista vazia");
        } 
        
        No aux = this.start;

        // for(int contador = 0; contador < this.size; contador++) {
        //     System.out.println("Elemento: " + aux.getValor());
        //     aux = aux.getNoProximo();
        // }

        // do {
        //     System.out.println("Elemento: " + aux.getValor());
        //     aux = aux.getNoProximo();
        // } while(aux != null);

        while(aux != null) { 
            System.out.println("Elemento: " + aux.getValor());
            aux = aux.getNoProximo();
        }
    }
}