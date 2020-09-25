package com.estruturadados.queue;

import com.estruturadados.queue.exception.DequeuException;
import com.estruturadados.queue.exception.EnqueueException;

public class mainQueu {
    public static void main(String args[]) {
        StaticCircularQueue fila = new StaticCircularQueue(5);
        try {
            fila.enqueue(4);
            fila.enqueue(7);
            fila.enqueue(9);
            fila.enqueue(2);
            fila.enqueue(7);

            int elemento1 = fila.dequeue();
            int elemento2 = fila.dequeue();
            int elemento3 = fila.dequeue();

            fila.enqueue(1);

            int elemento4 = fila.dequeue();
            int elemento5 = fila.dequeue();

            fila.enqueue(22);
            fila.enqueue(71);
            fila.enqueue(15);
        } catch (EnqueueException enqueueException) {
            System.out.println(enqueueException.getMessage());
        } catch (DequeuException dequeuException) {
            System.out.println(dequeuException.getMessage());
        }

    }
}
