package com.estruturadados.recursao;

public class Fatorial {

    public static void main (String[] args) {
        try{
            int fatorial = calcularFatorial(5);
            System.out.println("fatorial: " + fatorial);
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static int calcularFatorial(int n) throws Exception {
        
        if(n < 0) {
            throw new Exception("Não é posível efetuar fatorial de número negativo!");
        }

        if(n == 1 || n == 0) {
            return 1;
        }
        
        int response = n * calcularFatorial(n - 1);
        return response;
    }
    
}
