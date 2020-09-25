package com.estruturadados.stack.exception;

public class PushException extends Exception {
    public PushException() {
        super("Pilha cheia! não é possível empilhar novo ítem");
    }
}
