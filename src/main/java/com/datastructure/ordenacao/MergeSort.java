package com.datastructure.ordenacao;

public class MergeSort extends AbstractSort {

    public MergeSort(int size) {
        super(size);
    }

    public void sort() {
        sort(this.array, 0, this.array.length - 1);
    }

    public void sort(int[] array, int first, int last) {
        if(first < last) {
            int middle = (first + last) / 2;
            sort(array, first, middle);
            sort(array, middle + 1, last);
            merge(array, first, middle, last);
        }
    }

    public void merge(int[] array, int first, int middle, int last) {

        int[] secondary = new int[array.length];

        for(int k = first; k <= last; k++) {
            secondary[k] = array[k];
        }

        int left = first;
        int right = middle + 1;


        for(int k = first; k <= last; k++) {
            if(left > middle) array[k] = secondary[right++];
            else if(right > last) array[k] = secondary[left++];
            else if(secondary[left] < secondary[right]) array[k] = secondary[left++];
            else array[k] = secondary[right++];
        }
    }
}