package com.estruturadados.introducao;

public class ExplicacaoVariaveis {
    public static void main(String [] args) {
        /*Variáveis: */
        int variavelInteiro = 12;
        float VariavelFloat = 1.5F;
        double variavelDouble = 1.5;
        char variavelChar = 'c';
        boolean variavelBoolean = true;



        String variavelString = "Texto";

        /*Operadores aritméticos: */
        int response, numero1, numero2, respostaSoma;
        response = 10 + 5;
        numero1 = 150;
        numero2 = 2;

        respostaSoma = numero1 + numero2;
        int respostaSubracao = numero1 - numero2;
        int respostaMultiplicacao = numero1 * numero2;
        int respostaDivisao = numero1 / numero2;
        int respostaResto = numero1%numero2;
        double respostaPotencia = Math.pow(numero1, numero2);

        System.out.println(respostaSoma);
        System.out.println(respostaSubracao);
        System.out.println(respostaMultiplicacao);
        System.out.println(respostaDivisao);
        System.out.println(respostaResto);
        System.out.println(respostaPotencia);
    }
}
