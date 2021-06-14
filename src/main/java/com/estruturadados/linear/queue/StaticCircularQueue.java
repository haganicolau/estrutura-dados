package com.estruturadados.linear.queue;

import com.estruturadados.linear.queue.exception.DequeuException;
import com.estruturadados.linear.queue.exception.EnqueueException;

public class StaticCircularQueue {
    private int queue[];
    private int first;
    private int last;
    private int quantity;

    public StaticCircularQueue(int size) {
        this.queue = new int[size];
        this.first = 0;
        this.last = -1;
        this.quantity = 0;
    }

    public boolean isEmpty() {
        return quantity == 0;
    }

    public boolean isFull() {
        return quantity == length();
    }

    public int length() {
        return this.queue.length;
    }

    public void enqueue(int element) throws EnqueueException {
        if(isFull()) {
            throw new EnqueueException();
        }

        this.last++;
        if(this.last == length()) {
            this.last = 0;
        }
        this.queue[this.last] = element;
        this.quantity++;
    }

    public int dequeue() throws DequeuException {
        if(isEmpty()) {
            throw new DequeuException();
        }

        int element = this.queue[this.first];
        this.first++;
        if(this.first == length()) {
            this.first = 0;
        }
        this.quantity--;
        return element;
    }








}
