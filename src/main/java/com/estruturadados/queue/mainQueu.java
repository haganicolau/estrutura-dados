package com.estruturadados.queue;

import com.estruturadados.queue.exception.DequeueException;
import com.estruturadados.queue.exception.EnqueueException;

/**
 *
 * @author hagan
 */
public class mainQueu {
    public static void main(String args[]){
        try {
            DinamicQueue fila = new DinamicQueue();
            fila.enqueue(7);
            fila.enqueue(14);
            fila.enqueue(75);
            fila.enqueue(8);
            fila.enqueue(133);

            while(!fila.isEmpty()) {
                int numero = fila.dequeue();
                System.out.println("elemento fila: " + numero);
            }
        }
        catch (DequeueException dequeueException) {
            System.out.println(dequeueException.getMessage());
        }
    }
}
