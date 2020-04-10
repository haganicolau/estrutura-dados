package com.estruturadados.queue;

/**
 *
 * @author hagamenon.oliviveira <hagamenon.oliveira@unialfa.com.br>
 */
public class StaticQueue {
    
    int queue[];
    int first;
    int last;
    int quantity;
    
    public StaticQueue(int size) {
        this.queue = new int[size];
        this.first = 0;
        this.last = -1;
        this.quantity = 0;
    }
    
    boolean isEmpty() {
        return this.quantity == 0;
    }
    
    boolean isFull() {
        return this.quantity == this.queue.length;
    }
    
    void queue(int element) throws Exception {
        if(isFull()) {
            throw new Exception("Fila cheia");
        } 
        
        last++;
        if(last == queue.length) {
            last = 0;
        }
        queue[last] = element;
        quantity++;
    }
    
    int dequeue() throws Exception{
        if(isEmpty()) {
            throw new Exception("Fila vazia");
        }
        
        int element;
        element = queue[first];
        
        first++;
        if(first == queue.length) {
            first = 0;
        }
        quantity--;
        return element;
    }
    
    int getQuantity() {
        return quantity;
    }
    
   /*
    * Implementem um método que printa os elementos da fila, mantendo as mesmas propriedades. 
    * você deve usar as propriedades first e last.
    */
    
}
