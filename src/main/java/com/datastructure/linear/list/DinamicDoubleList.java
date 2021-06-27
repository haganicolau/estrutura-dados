package com.datastructure.linear.list;

import com.datastructure.linear.list.exception.RemoveListException;
import com.datastructure.linear.node.Node;

public class DinamicDoubleList {

    private Node head;
    private Node tail;
    private int size;

    public DinamicDoubleList() {
        this.head = new Node(-1);
        this.tail = new Node(-1);
        this.size = 0;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public void insertFirst(int value) {
        Node newNo = new Node(value);

        if(isEmpty()) {
            this.head.setNextNode(newNo);
            newNo.setPreviousNode(this.head);

            this.tail.setPreviousNode(newNo);
            newNo.setNextNode(this.tail);
        } else {
            Node first = this.head.getNextNode();
            newNo.setNextNode(first);
            first.setPreviousNode(newNo);
            newNo.setPreviousNode(this.head);
            this.head.setNextNode(newNo);
        }
        this.size++;
    }

    public void insertLast(int value) {
        Node newNo = new Node(value);

        if(isEmpty()) {
            this.head.setNextNode(newNo);
            newNo.setPreviousNode(this.head);
            this.tail.setPreviousNode(newNo);
            newNo.setNextNode(this.tail);
        } else {
            Node last = this.tail.getPreviousNode();
            newNo.setPreviousNode(last);
            last.setNextNode(newNo);
            newNo.setNextNode(this.tail);
            this.tail.setPreviousNode(newNo);
        }
        this.size++;
    }

    public int remove() throws RemoveListException {
        if(isEmpty()) {
            throw new RemoveListException();
        }

        Node aux = this.head.getNextNode();
        this.head.setNextNode(aux.getNextNode());
        this.head.getNextNode().setPreviousNode(this.head);
        this.size--;
        return aux.getValue();
    }
}
