package com.datastructure.linear.list;

import com.datastructure.linear.list.exception.ListException;
import com.datastructure.linear.list.exception.RemoveListException;
import com.datastructure.linear.node.Node;

public class DinamicList {
    int size;
    Node head;

    public DinamicList() {
        this.head = new Node(-1);
        this.size = 0;
    }

    public boolean isEmpty() {
        return this.head.getNextNode() == null;
    }

    public void insertFirst(int value) {
        Node newNode = new Node(value);

        newNode.setNextNode(head.getNextNode());
        head.setNextNode(newNode);
        this.size++;
    }

    public void insertLast(int value) {
        Node newNode = new Node(value);

        if(isEmpty()) {
            head.setNextNode(newNode);
        }
        else {
            Node aux = this.head.getNextNode();
            while(aux.getNextNode() != null) {
                aux = aux.getNextNode();
            }
            aux.setNextNode(newNode);
        }

        this.size++;
    }

    public int remove() throws RemoveListException {
        if(isEmpty()) {
            throw new RemoveListException();
        }

        Node aux = this.head.getNextNode();
        this.head.setNextNode(aux.getNextNode());
        this.size--;
        return aux.getValue();
    }

    public void list() throws ListException {
        if(isEmpty()) {
            throw new ListException();
        }

        Node aux = this.head.getNextNode();
        while(aux != null) {
            System.out.println("Elemento: " + aux.getValue());
            aux = aux.getNextNode();
        }
    }

    public int getSize() {
        return this.size;
    }
}
