package com.estruturadados.introducao;

import java.util.Scanner;

public class EstruturaMain {

    public static void main (String [] args) {
        int n1, n2, soma;
        Scanner scan = new Scanner(System.in);
        System.out.println("numero1: ");
        n1 = scan.nextInt();

        System.out.println("numero2: ");
        n2 = scan.nextInt();

        soma = somarDoisNumeros(n1, n2);

        System.out.println("Soma: "+ soma);
    }

    static int somarDoisNumeros(int numero1, int numero2) {
        int resposta = 0;
        resposta = numero1 + numero2;
        return resposta;
    }
}
