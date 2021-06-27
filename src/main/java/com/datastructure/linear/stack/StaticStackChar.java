package com.datastructure.linear.stack;

public class StaticStackChar {
    /******************************
     * CARACTERÍSTICAS DA PILHA
     * *******************************/

    /** REPRESENTA O TOPO DA PILHA */
    private int top;

    /** ESTRUTURA ESTÁTICA DE PILHA*/
    private final char[] stack;

    /** TAMANHO MÁXIMO DA PILHA*/
    private final int size;

    public StaticStackChar(int size) {
        this.stack = new char[size];
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

    public char peek() {
        if(isEmpty()) {
            System.out.println("Empty stack cannot return to top");
            return 0;
        }
        return this.stack[this.top];
    }

    public void push(char value) {
        if(isFull()) {
            System.out.println("Full stack! it is not possible to stack new item");
            return;
        }
        this.top++;
        this.stack[this.top] = value;
    }

    public char pop() {
        if(isEmpty()) {
            System.out.println("Empty stack, can't unstack");
            char response = 0;
            return response;
        }
        char letter = this.stack[this.top];
        this.top--;
        return letter;
    }
}
