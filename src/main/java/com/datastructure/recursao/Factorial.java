package com.datastructure.recursao;

public class Factorial {

    public static void main (String[] args) {
        try{
            int Factorial = calculateFactorial(5);
            System.out.println("Factorial: " + Factorial);
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static int calculateFactorial(int n) throws Exception {
        
        if(n < 0) {
            throw new Exception("Cannot convert negative number to factorial!");
        }

        if(n == 1 || n == 0) {
            return 1;
        }
        
        int response = n * calculateFactorial(n - 1);
        return response;
    }
    
}
