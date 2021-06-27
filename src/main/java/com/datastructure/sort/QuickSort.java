package com.datastructure.sort;

/**
 *
 * @author Hagamenon.Oliveira<haganicolau@gmail.com>
 */
public class QuickSort extends AbstractSort {


    public QuickSort(int size) {
        super(size);
    }

    public void sort() {
        sort(this.array, 0, this.array.length - 1);
    }

    public void sort(int[] array, int first, int last) {
        if(first < last) {
            int pivot = part(array, first, last);
            sort(array, first, pivot - 1);
            sort(array, pivot + 1, last);
        }
    }

    public int part(int[] array, int first, int last) {
        int pivot = array[first];
        int left = first + 1;
        int right = last;

        while(left <= right) {
            
            if(array[left] <= pivot) {
                left++;
            }

            else if(array[right] > pivot) {
                right--;
            }

            else {
                change(array, left, right);
            }
        }

        array[first] = array[right];
        array[right] = pivot;
        return right;
    }

    public void change(int[] array, Integer left, Integer right) {
        int change = array[left];
        array[left] = array[right];
        array[right] = change;
        left += 1;
        right -= 1;
    }

}