package com.datastructure.linear.node;

public class Node {

    /**
     * @description node value
     */
    private int value;

    /**
     * @description reference of next node
     */
    private Node nextNode;
    private Node previousNode;

    public Node(int value) {
        this.value = value;
        this.nextNode = null;
        this.previousNode = null;
    }

    public int getValue() {
        return value;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    public Node getPreviousNode() {
        return previousNode;
    }

    public void setPreviousNode(Node previousNode) {
        this.previousNode = previousNode;
    }
}
