package com.estruturadados.linear.list.exception;

public class RemoveListException extends Exception {
    public RemoveListException() {
        super("Lista vazia, impossível remover");
    }
}
