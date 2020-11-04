package com.estruturadados.list.exceptino;

public class ListException extends Exception {
    public ListException() {
        super("Lista vazia, impossível listar");
    }
}
