package com.estruturadados.linear.stack.exception;

public class PushException extends Exception {
    public PushException() {
        super("Full stack! it is not possible to stack new item");
    }
}
