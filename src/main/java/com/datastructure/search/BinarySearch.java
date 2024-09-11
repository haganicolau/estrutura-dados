package com.datastructure.search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {24,25,26,27,28,32,33,34,35,40,41,42,43,47,49,51,59,60,67};
        int position = binarySearch(array, 35);
        System.out.println("position: " + position);

    }

    public static int binarySearch(int[] array, int value) {
        int middle = 0;
        int left = 0;
        int right = array.length - 1;
        boolean find = false;
        int compares = 0;

        while ((left<=right) && (! find)) {
            compares++;
            middle = (left + right) / 2;

            if (array[middle] == value) {
                find = true;
            }

            else if (array[middle] < value) {
                left = middle + 1;
            }

            else {
                right = middle - 1;
            }
        }
        System.out.println("compares: "+ compares);
        if (value == array[middle]) {
            return middle;
        }
        System.out.println("compares: "+ compares);
        return array.length;
    }

    public static int searchBinarioRecursive(int[] array, int value, int start, int end) {
        
        if (start > end) return array.length;

        int middle = (start + end) / 2;

        if (array[middle] == value) {
            return middle;
        }

        if (value < array[middle]) {
            int left = middle - 1;
            return searchBinarioRecursive(array, value, start, left);
        }

        else {
            int right = middle + 1;
            return searchBinarioRecursive(array, value, right, end);
        }
    }

}
