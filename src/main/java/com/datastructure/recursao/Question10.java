package com.datastructure.recursao;

public class Question10 {

    public static void main (String[] args) {
        int array[] = {55,11,890,2,5,7,6,15,159};

        int bigger = looksForBiggestElement(array, 0, array[0]);
        System.out.println("bigger: " + bigger);
    }

    public static int looksForBiggestElement(int array[], int position, int bigger) {

        if(array[position] > bigger) {
            bigger = array[position];
        }
        
        position++;
        if(position == array.length) {
            return bigger;
        }

        return looksForBiggestElement(array, position, bigger);
    }
    
}
