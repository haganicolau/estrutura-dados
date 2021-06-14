package com.estruturadados.linear.list;

import com.estruturadados.linear.list.exception.RemoveListException;

import java.util.Random;
import java.util.Scanner;

public class MainList {
    public static void main(String[] args) {
        ex01();
    }

    public static void exExemplo() {
        DinamicDoubleList list = new DinamicDoubleList();
        list.insertLast(7);
        list.insertLast(14);
        list.insertLast(75);
        list.insertLast(8);
        list.insertLast(133);

        try {
            while(!list.isEmpty()) {
                int elemento = list.remove();
                System.out.println("elemento: " +elemento);
            }

        } catch(RemoveListException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void ex01() {
        /*
        * 1- Desenvolva um algoritmo em Java, que usa a estrutura de lista
        * simplesmente encadeada para armazenar 100 valores inteiros,
        * inseridos randômicos, busque um elemento, se encontrar, retorne true.
        * Observação, você só tem acesso às funções de inserir e remover.
        * */

        DinamicDoubleList lista = new DinamicDoubleList();
        for(int contador  = 0; contador < 100; contador++) {
            Random random = new Random();
            lista.insertLast(random.nextInt(100));
        }

        Scanner scan = new Scanner(System.in);
        System.out.println("Informe um elemento a ser buscado: ");
        int numero = scan.nextInt();
        boolean response = searchElement(lista, numero);
        if(response) {
            System.out.println("pertence a lista");
        } else {
            System.out.println("Não pertence a lista");
        }
    }

    public static boolean searchElement(DinamicDoubleList lista, int numero) {
        try {
            while (!lista.isEmpty()) {
                int numeroLista = lista.remove();
                if (numeroLista == numero) {
                    return true;
                }
            }
        } catch (RemoveListException ex) {
            System.out.println(ex.getMessage());
        }
        return false;
    }

    /*
    * 2- Dado uma lista sem tamanho definido, insira na última posição n
    * números inteiros informados pelo usuário, enquanto os números forem
    * \diferentes de -1. Apresente a quantidade de elementos inseridos, a
    * média, o maior o menor valor.
    */

    /*
    * 3- Refaça o exercício anterior (2), ao final do programa, a
    * lista deve estar em sua configuração original, ou seja, os valores
    * devem ser mantidos em sua posição original.
    * */

    /*
     * 12- Crie uma função search na lista simplesmente encadeada que busca
     * e remove o elemento da lista. Se o elemento não existir, soltar uma
     * exceção específica criada para elemento buscado e não encontrado.
     * Ao final do exercício, a lista deve manter sua configuração original,
     * sem o elemento buscado.
     * */
}
