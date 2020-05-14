package com.estruturadados.queue;

import com.estruturadados.stack.StaticStack;

/**
 *
 * @author hagan
 */
public class mainQueu {
    public static void main(String args[]){
        DinamicQueue f1 = new DinamicQueue();
        DinamicQueue f2 = new DinamicQueue();

        f1.queue(1);
        f1.queue(2);
        f1.queue(3);
        f1.queue(4);
        f1.queue(5);
        
        f2.queue(6);
        f2.queue(7);
        f2.queue(8);

        DinamicQueue f3 = concatenarFila(f1, f2);
        try{
            while(!f3.isEmpty()) {
                System.out.println(f3.dequeue());
            }
        }catch(Exception e) {
            System.out.println(e.getMessage());
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
    // public static StaticQueue inverterFila(StaticQueue fila) {
    //     StaticStack pilha = new StaticStack(fila.getQuantity());
        
    //     try{
    //         while(!fila.isEmpty()) {
    //             int elemento = fila.dequeue();
    //             pilha.push(elemento);
    //         }

    //         while(!pilha.isEmpty()) {
    //             int elemento = pilha.pop();
    //             fila.queue(elemento);
    //         }
    //     }catch(Exception e) {
    //         System.out.println(e.getMessage());
    //     }
        
    //     return fila;
    // }


    /** 07. Crie uma função que ao receber duas filas dinâmicas, ela concatene,
     * coloque uma fila na frente da outra e retorne uma única fila resultante
     * 
     * */
    public static DinamicQueue concatenarFila(DinamicQueue f1, DinamicQueue f2) {
        DinamicQueue f3 = new DinamicQueue();

        try {
            while(!f1.isEmpty()) {
                f3.queue(f1.dequeue());
            }
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
        }

        try {
            while(!f2.isEmpty()) {
                f3.queue(f2.dequeue());
            }
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
        }

        return f3;
    }
   
    
}
