package com.datastructure.introduction;

import java.util.Scanner;

public class CheckNumberEven {

    public static void main (String [] arags) {

        int size, x;
        Scanner scan = new Scanner(System.in);
        System.out.println("informe um size: ");
        size = scan.nextInt();
        int array[] = new int[size];

        for(x = 0; x < size; x++) {
            System.out.println("informe um numero: ");
            array[x] = scan.nextInt();
        }

        for(x = 0; x < size; x++) {
            System.out.println(array[x]);
        }
    }

}
