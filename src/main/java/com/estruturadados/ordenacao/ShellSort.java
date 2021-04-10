package com.estruturadados.ordenacao;

public class Questao06 {

    public static void main(String[] args){

        int vet[] = {2,7,6,1,7,11,4,15,5,0};
        int menor = buscarMenor(vet, 0, vet.length-1);
int maior = buscarMaior(vet, 0, vet.length-1);

        System.out.println(menor);
        System.out.println(maior);
    }

    private static int buscarMenor(int[] vet, int i, int j){
        if(i == j){
            return vet[i];
        }else{
            int n1, n2;
            int m;

            m = (i + j)/2;
            n1 = buscarMenor(vet, i, m);
            n2 = buscarMenor(vet, m + 1, j);

            if(n1 < n2){
                return n1;
            }else{
                return n2;
            }
        }
    }

    private static int buscarMaior(int[] vet, int i, int j){
        if(i == j){
            return vet[i];
        }else{
            int n1, n2;
            int m;

            m = (i + j)/2;
            n1 = buscarMaior(vet, i, m);
            n2 = buscarMaior(vet, m + 1, j);

            if(n1 > n2){
                return n1;
            }else{
                return n2;
            }
        }
    }}
