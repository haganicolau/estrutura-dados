package com.estruturadados.linear.queue.exception;

public class DequeuException extends Exception {
    public DequeuException() {
        super("Fila vazia, impossível desenfileirar.");
    }
}
