package com.datastructure.array;

import java.io.IOException;

public class MaiorPalindromo {

    public static boolean isPalindromo(long n) {
        String str = Long.toString(n);
        int len = str.length();

        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - 1 - i)) {
                return false;
            }
        }

        return true;
    }


    public static String maiorPalindromo(String s) {
        String maior = "";
        generatePermutationsHelper("", s, maior);
        return maior;
    }

    private static void generatePermutationsHelper(String prefix, String remaining, String maior) {
        if (remaining.length() == 0) {
            //permutations.add(prefix);
            if (isPalindromo(Long.parseLong(prefix))) {
                maior = prefix;
            }
            return;
        }

        for (int i = 0; i < remaining.length(); i++) {
            char currentChar = remaining.charAt(i);
            String newPrefix = prefix + currentChar;
            String newRemaining = remaining.substring(0, i) + remaining.substring(i + 1);
            generatePermutationsHelper(newPrefix, newRemaining, maior);
        }
    }

    public static void main(String[] args) {
        String numero1 = "39878";
        String numero2 = "00900";
        String numero3 = "0000";
        String numero4 = "54321";
        String numero5 = "8199";

        System.out.println(maiorPalindromo(numero1)); // Deve imprimir 898
        System.out.println(maiorPalindromo(numero2)); // Deve imprimir 9
        System.out.println(maiorPalindromo(numero3)); // Deve imprimir 0
        System.out.println(maiorPalindromo(numero4)); // Deve imprimir 5
        System.out.println(maiorPalindromo(numero5)); // Deve imprimir 5

    }
}
