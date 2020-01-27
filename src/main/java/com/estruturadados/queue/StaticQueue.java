/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.estruturadados.queue;

/**
 *
 * @author hagan
 */
public class StaticQueue {
    int[] queue;
    int first;
    int last;
    int quantity;
    
    void create(int size) {
        this.queue = new int[size];
        this.first = 0;
        this.last = 0;
        this.quantity = 0;
    }
    
    boolean isEmpty() {
        return quantity == 0;
    }
    
    boolean isFull() {
        return this.quantity == this.queue.length;
    }
    
    void insert(int element){
        if(isFull()) {
            System.out.println("Fila Cheia!");
        } else {
            queue[last] = element;
            last++;
            quantity++;
            if(last == 4){
                last = 0;
            }
        }
    }
    
    int remove(){
        int element;
        if(isEmpty()) {
            element = -1;
            System.out.println("Fila Vazia");
        } else {
            element = queue[first];
            quantity --;
            first ++;
            if(first == 4){
                first = 0;
            }
        }
        return element;
        
    }
    
}
