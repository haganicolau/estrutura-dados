package com.datastructure.introduction;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StructureMain {

    public static void main (String [] args) {
        System.out.println("start main");
        try {
            calculator();
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
        System.out.println("end main");
    }

    public static void calculator() throws Exception{
        while (true) {
            try {
                Scanner scan = new Scanner(System.in);
                System.out.println("Enter n1");
                int n1 = scan.nextInt();
                System.out.println("Enter n2");
                int n2 = scan.nextInt();

                int sum = sum(n1, n2);
                System.out.println("sum: " + sum);
                int multiplication = multiplication(n1, n2);
                System.out.println("multiplicacao: " + multiplication);
                int subtraction = subtraction(n1, n2);
                System.out.println("subtracao: " + subtraction);

                int division = division(n1, n2);
                System.out.println("division: " + division);
            } catch (InputMismatchException exception) {
                System.out.println("error tipo da entrada nao valido");
            }catch (Exception exception) {
                System.out.println("cagadinha... digitou 0");
            } finally {
                System.out.println("finally");
            }
        }

    }

    public static int sum(int n1, int n2) {
        return n1 + n2;
    }

    public static int multiplication(int n1, int n2) {
        return n1 * n2;
    }

    public static int subtraction(int n1, int n2) {
        return n1 - n2;
    }

    public static int division(int n1, int n2) throws Exception{
        if(n2 == 0) {
            throw new Exception("numero inválido");
        }

        return n1 / n2;
    }
}
