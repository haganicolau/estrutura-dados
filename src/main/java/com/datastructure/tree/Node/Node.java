package com.datastructure.tree.Node;

public class Node<T extends Comparable<T>>{

    private Node<T> left;
    private Node<T> right;
    private Node<T> father;
    private Value<T> value;

    private int fb;

    private boolean RED;
    private boolean BLACK;

    public Node(Value<T> value) {
        this.value = value;
        this.left = null;
        this.right = null;
        this.father = null;
        this.fb = 0;
        this.BLACK = false;
        this.RED = true;
    }

    public void setValue(Value<T> value) {
        this.value = value;
    }

    public Value<T> getValue() {
        return this.value;
    }

    public void setLeft(Node<T> node) {
        this.left = node;
    }

    public Node<T> getLeft() {
        return this.left;
    }

    public void setRight(Node<T> node) {
        this.right = node;
    }

    public Node<T> getRight() {
        return this.right;
    }

    public void setFather(Node<T> node) {
        this.father = node;
    }

    public Node<T> getFather() {
        return this.father;
    }

    public int getFb() {
        return fb;
    }

    public void setFb(int fb) {
        this.fb = fb;
    }

    public void setRedNode() {
        this.RED = true;
        this.BLACK = false;
    }

    public void setBlackNode() {
        this.RED = false;
        this.BLACK = true;
    }

    public boolean isBlackNode() {
        return this.BLACK;
    }

    public boolean isRedNode() {
        return this.RED;
    }

    public boolean isRoot() {
        return this.father == null;
    }
  
}
