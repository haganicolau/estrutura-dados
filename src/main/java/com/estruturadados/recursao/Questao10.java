package com.estruturadados.recursao;

public class Questao10 {

    public static void main (String[] args) {
        int vetor[] = {55,11,890,2,5,7,6,15,159};

        int maior = procuraMaiorElemento(vetor, 0, vetor[0]);
        System.out.println("maior: " + maior);
    }

    public static int procuraMaiorElemento(int vetor[], int pos, int maior) {

        if(vetor[pos] > maior) {
            maior = vetor[pos];
        }
        
        pos++;
        if(pos == vetor.length) {
            return maior;
        }

        return procuraMaiorElemento(vetor, pos, maior);
    }
    
}
