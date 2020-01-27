package com.estruturadados.stack;

/**
 * @author: Hagamenon Oliveira
 * @since: 02/04/2018
 * @description: Estrutura de dados do tipo LIFO
 * */
public class StaticStack {

    /********************************
     * Caracetrísticas da Pilha
     *********************************/

    /**Topo da pilha, onde deve ser empilhado e desempilhado*/
    int top = -1;

    /**Tamanho máximo da pilha*/
    int max = 5;

    /**Estrutura estática da pilha*/
    int Stack[] = new int[max];


    /********************************
     * Funções / Métodos da Pilha
     *********************************/

    /**Função responsável por empilhar, recebe número por parâmetro e empilha no topo*/
    public void push(int number){
        //Verifica se pilha está cheia. Se estiver cheia não empilha.
        if(isFull()) {
            System.out.println("Pilha cheia! Não é possível fazer o push");
        } else{
            top++;
            Stack[top]=number;
        }
    }

    /**Função responsável por desempilhar, decrementa o topo, perdendo a referência do elemento. E retorna o elemento*/
    public int pop(){
        //Verifica se pilha está vazia. Se estiver não retorna nada.
        if(isEmpty()){
            System.out.println("Pilha vazia");
            return -1;
        } else {
            int number = Stack[top];
            top--;
            return number;
        }
    }

    /**Função responsável por verificar se pilha está vazia*/
    public boolean isEmpty(){
        if(top == -1){
            return true;
        } else{
            return false;
        }
    }
    /**Função responsável por verificar se pilha está vazia*/
    public boolean isFull(){
        if(top == max-1){
            return true;
        } else{
            return false;
        }
    }

    /**Função responsável por informar o tamamnho atual da pilha*/
    public int size(){
        return top;
    }
}