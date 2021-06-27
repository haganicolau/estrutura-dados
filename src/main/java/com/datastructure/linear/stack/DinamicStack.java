package com.datastructure.linear.stack;

import com.datastructure.linear.node.Node;
import com.datastructure.linear.stack.exception.PopException;

public class DinamicStack {

    /*node top*/
    private final Node top;

    private int size;

    public DinamicStack() {
        this.top = new Node(-1);
        this.size = 0;
    }

    public boolean isEmpty() {
        return this.top.getNextNode() == null;
    }

    /**
     * @description push item to stack top
     * @param value value to be stacked on top of the pile
     */
    public void push(int value) {
        Node newNo = new Node(value);
        newNo.setNextNode(this.top.getNextNode());
        this.top.setNextNode(newNo);
        this.size++;
    }

    /**
     * @description remove item from stack top
     * @exception PopException
     */
    public int pop() throws PopException {
        if(isEmpty()) {
            throw new PopException();
        }

        Node aux = this.top.getNextNode();
        top.setNextNode(aux.getNextNode());
        this.size--;
        return aux.getValue();
    }
}
