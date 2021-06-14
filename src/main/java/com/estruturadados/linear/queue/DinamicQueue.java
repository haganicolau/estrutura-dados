package com.estruturadados.linear.queue;

import com.estruturadados.linear.queue.exception.DequeuException;
import com.estruturadados.linear.node.Node;

public class DinamicQueue {
    private Node first;
    private Node last;
    private int size;

    DinamicQueue() {
        this.first = new Node(-1);
        this.last = new Node(-1);
        this.size = 0;
    }

    public int getSize() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public void enqueueu(int value) {
        Node newNode = new Node(value);

        this.size++;
        if(isEmpty()) {
            this.last.setNextNode(newNode);
            this.first.setNextNode(newNode);
            return;
        }

        Node lastAux = this.last.getNextNode();
        lastAux.setNextNode(newNode);
        this.last.setNextNode(newNode);
    }

    public int dequeue() throws DequeuException {
        if(isEmpty()) {
            throw new DequeuException();
        }

        Node aux = this.first.getNextNode();
        this.first.setNextNode(aux.getNextNode());
        this.size--;
        return aux.getValue();
    }

    public Node getLast() {
        return this.last.getNextNode();
    }
}
