package com.estruturadados.list.exceptino;

public class RemoveListException extends Exception {
    public RemoveListException() {
        super("Lista vazia, impossível remover");
    }
}
