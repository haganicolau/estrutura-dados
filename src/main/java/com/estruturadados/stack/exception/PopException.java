package com.estruturadados.stack.exception;

public class PopException extends Exception {
    public PopException() {
        super("Pilha vazia, não é possível desempilhar");
    }
}
