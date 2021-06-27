package com.datastructure.recursao;

public class NaturalBinaryConversion {

    public static void main(String[] args) {
        System.out.println("");
        convertNaturalToBinary(12);
        System.out.println("");
    }

    public static void convertNaturalToBinary(int n) {
        
        if(n/2 != 0) {
            convertNaturalToBinary(n/2);
        }
        System.out.print(n%2);

    }
    
}
