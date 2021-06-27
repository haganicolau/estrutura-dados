package com.datastructure.linear.stack;

import com.datastructure.linear.stack.exception.PopException;
import com.datastructure.linear.stack.exception.PushException;

public class StaticStack {
    /******************************
    * STACK CHARACTERISTICS
    * *******************************/

    /** TOP STACK */
    private int top;

    /** STACK STRUCTURE*/
    private int[] stack;

    /** STACK SIZE*/
    private final int size;

    public StaticStack(int size) {
        this.stack = new int[size];
        this.top = -1;
        this.size = size;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size-1;
    }

    public int length() {
        return this.size;
    }

    public int peek() {
        if(isEmpty()) {
            System.out.println("Empty stack cannot return to top ");
            return 0;
        }
        return this.stack[this.top];
    }

    public void push(int value) throws PushException {
        if(isFull()) {
            throw new PushException();
        }
        this.top++;
        this.stack[this.top] = value;
    }

    public int pop() throws PopException {
        if(isEmpty()) {
            throw new PopException();
        }
        int number= this.stack[this.top];
        this.top--;
        return number;
    }
}
