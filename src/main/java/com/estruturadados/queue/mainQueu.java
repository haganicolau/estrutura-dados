package com.estruturadados.queue;

import com.estruturadados.stack.StaticStack;

/**
 *
 * @author hagan
 */
public class mainQueu {
    public static void main(String args[]){
       StaticQueue f1 = new StaticQueue(5);
       
       try{
           
        f1.queue(0);
        f1.queue(1);
        f1.queue(2);
        f1.queue(3);
        f1.queue(4);
        
        StaticQueue fInvertida = inverterFila(f1);
        
        while(!fInvertida.isEmpty()) {
            int element = fInvertida.dequeue();
            System.out.println(element);
        }
        
       }catch(Exception ex) {
           
           System.out.println(ex.getMessage());
       }
        
    }
    
    /* 01 Desenvolva uma função (com parâmetros), para testar se uma fila F1, tem mais
     * elementos que uma fila F2 (não se esqueça de usar apenas as operações de fila)
     * queue dequeue;
     *
     */
    public static boolean f1TemMaisElementosF2(StaticQueue f1, StaticQueue f2) {
        
        int contadorF1 = 0;
        int contadorF2 = 0;
        
        try{
            while(!f1.isEmpty()) {
                f1.dequeue();
                contadorF1++;
            }

            while(!f2.isEmpty()) {
                f2.dequeue();
                contadorF2++;
            }
        }catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        return contadorF1 > contadorF2;
    }
    
    
    /* 02 Desenvolva uma função para inverter a ordem dos elementos da fila.
     * só pode usar as propriedades da fila queue e dequeu. Pode usar uma pilha 
     * auxiliar
     */
    public static StaticQueue inverterFila(StaticQueue fila) {
        StaticStack pilha = new StaticStack(fila.getQuantity());
        
        try{
            while(!fila.isEmpty()) {
                int elemento = fila.dequeue();
                pilha.push(elemento);
            }

            while(!pilha.isEmpty()) {
                int elemento = pilha.pop();
                fila.queue(elemento);
            }
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
        
        return fila;
    }
    
    
}
