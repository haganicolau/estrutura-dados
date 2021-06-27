package com.datastructure.linear.stack.exception;

public class PopException extends Exception {
    public PopException() {
        super("Empty stack, can't pop");
    }
}
