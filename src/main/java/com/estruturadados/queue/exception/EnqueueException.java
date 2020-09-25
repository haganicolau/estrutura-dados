package com.estruturadados.queue.exception;

public class EnqueueException extends Exception {
    public EnqueueException() {
        super("Fila Cheia, não é possível enfileirar");
    }
}
