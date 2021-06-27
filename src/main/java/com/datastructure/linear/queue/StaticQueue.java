package com.datastructure.linear.queue;

import com.datastructure.linear.queue.exception.DequeuException;
import com.datastructure.linear.queue.exception.EnqueueException;

public class StaticQueue {

    private final int[] queue;
    private final int first;
    private int last;

    public StaticQueue(int size) {
        this.queue = new int[size];
        this.last = -1;
        this.first = 0;
    }

    public boolean isEmpty() {
        return this.last == -1;
    }

    public boolean isFull() {
        return this.last == length() -1;
    }

    public int length() {
        return this.queue.length;
    }

    public void enqueue(int element) throws EnqueueException {
        if(isFull()) {
            throw new EnqueueException();
        }

        this.last++;
        this.queue[this.last] = element;
    }

    public int dequeue() throws DequeuException {
        if(isEmpty()) {
            throw new DequeuException();
        }

        int element = this.queue[this.first];
        arrangement();
        this.last--;
        return element;
    }

    public void arrangement() {
        for(int position = this.first; position < this.last; position++) {
            this.queue[position] = this.queue[position + 1];
        }
    }










}
