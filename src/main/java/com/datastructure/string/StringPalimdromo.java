package com.datastructure.string;

public class StringPalimdromo {

    public static void main(String[] args) {

        String A = "madam";
        int length = A.length();
        boolean flag = true;
        for (int i = 0; i < length / 2; i++) {

            if (A.charAt(i) != A.charAt(length - 1 - i)) {
                flag = false;
                break;
            }
        }
        System.out.print(flag);
    }
}
