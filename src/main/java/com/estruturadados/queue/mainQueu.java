package com.estruturadados.queue;

/**
 *
 * @author hagan
 */
public class mainQueu {
    public static void main(String args[]){
        StaticQueue queue = new StaticQueue();
        queue.create(4);

        queue.insert(1);
        queue.insert(5);
        queue.insert(8);
        queue.insert(9);
        
        while(!queue.isEmpty()){
            int element = queue.remove();
            System.out.println(element);
        }
    }
}
