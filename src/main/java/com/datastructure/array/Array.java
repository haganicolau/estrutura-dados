package com.datastructure.array;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Base64;
import java.util.Random;
import java.util.Scanner;
import java.util.Base64;

public class Array {

    public static void main (String [] args) throws IOException {


        LocalDateTime accessTime = LocalDateTime.now().minusHours(1);
        LocalDateTime timeToExpire = accessTime.plusSeconds(5800);
        LocalDateTime currentTime = LocalDateTime.now();
        currentTime.isAfter(timeToExpire);

    }

    static int[] arrayCreate(int size) {
        return new int[size];
    }

    static void popularVetorUsuario(int[] array) {
        int size = array.length;
        Scanner scan = new Scanner(System.in);
        for(int index = 0; index < size; index++) {
            System.out.println("array[" + index + "] = ");
            array[index] = scan.nextInt();
        }
    }

    static void enterRandomValues(int[] array) {
        int size = array.length;
        Random random = new Random();
        for(int index = 0; index < size; index++) {
            array[index] = random.nextInt(100);
        }
    }

    static void arrayRun1To10() {
        int[] array = new int[10];
        int size = array.length;

        for(int index = 0; index < size; index++) {
            array[index] = index + 1;
        }

        for(int index = 0; index < size; index++) {
            System.out.println(array[index]);
        }
    }

    static int searchForTheBigger(int[] array) {
        int size = array.length;
        int bigger = 0;
        for(int index = 0; index < size; index++) {

            if(index == 0) {
                bigger = array[index];
            }

            if(array[index] > bigger) {
                bigger = array[index];
            }
        }
        return bigger;
    }

    static int searchForTheSmaller(int[] array) {
        int size = array.length;
        int smaller = 0;
        for(int index = 0; index < size; index++) {

            if(index == 0) {
                smaller = array[index];
            }

            if(array[index] < smaller) {
                smaller = array[index];
            }
        }
        return smaller;
    }

    static double calculateMediaArithmeticArray(int[] array) {
        int size = array.length;
        int sum = 0;

        for(int index = 0; index < size; index++) {
            sum = sum + array[index];
        }

        return sum / size;
    }

    static int showNumber(int[] array, int position) {
        int size = array.length;
        if(position < 0 || position >= size) {
            System.out.println("Invalid position");
            return -1;
        }

        return array[position];
    }

    static int searchNumberFromPosition(int array[], int value) {
        int size = array.length;
        for(int index = 0; index < size; index++) {
            if(array[index] == value) {
                return index;
            }
        }
        System.out.println("Value not found");
        return -1;
    }

}
