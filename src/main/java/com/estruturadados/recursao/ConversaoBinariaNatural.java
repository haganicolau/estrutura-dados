package com.estruturadados.recursao;

public class ConversaoBinariaNatural {

    public static void main(String[] args) {
        System.out.println("");
        converterNaturalToBinario(12);
        System.out.println("");
    }

    public static void converterNaturalToBinario(int n) {
        
        if(n/2 != 0) {
            converterNaturalToBinario(n/2);
        }
        System.out.print(n%2);

    }
    
}
