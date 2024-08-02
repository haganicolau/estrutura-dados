package com.datastructure.string;

import java.util.Scanner;

public class Anagrams {

    static boolean isAnagram(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        Character [] charsA = new Character[a.length()];
        Integer [] occurs = new Integer[a.length()];

        int position = 0;
        for (int i = 0; i< a.length(); i++) {
            char ch = a.charAt(i);
            if (charAlredyExist(charsA, ch)) {
                continue;
            }
            charsA[position] = ch;
            occurs[position] = countOccurrences(a, ch);
            position++;
        }

        return checkAnagrams(charsA, occurs, b);
    }

    public static boolean charAlredyExist(Character[] charsA, Character ch) {

        for (int i = 0; i < charsA.length; i++) {
            if (charsA[i] == ch) {
                return true;
            }
        }
        return false;
    }

    public static int countOccurrences(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }

    public static Integer getOccurs(char ch, Character [] charsA, Integer [] occurs) {
        for (int i = 0; i < charsA.length; i++) {
            if (charsA[i] != ch) {
                continue;
            }

            return occurs[i];
        }
        return null;
    }

    public static boolean checkAnagrams(Character [] charsA, Integer [] occurs, String b) {

        for (int i = 0; i < b.length(); i++) {
            char ch = b.charAt(i);
            if (!charAlredyExist(charsA, ch)) {
                return false;
            }

            Integer ocA = getOccurs(ch, charsA, occurs);
            if (ocA == null) {
                return false;
            }

            int ocB = countOccurrences(b, ch);
            if (ocB != ocA) {
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
