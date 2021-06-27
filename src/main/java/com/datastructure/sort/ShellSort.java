package com.datastructure.sort;

public class ShellSort extends AbstractSort {

    public ShellSort(int size) {
        super(size);
        this.generateRandomArray();
    }

    public void sort() {
        sort(this.array);
    }

    public void sort(int[] array) {
        int h = array.length / 2;
        int key, j, i;

        while (h > 0) {
            for (i = h; i < array.length; i++) {
                key = array[i];
                j = i;

                this.compare++;
                while (j >= h && array[j - h] > key) {
                    array[j] = array[j - h];
                    j = j - h;
                    this.change++;
                }
                array[j] = key;
            }
            h = h / 2;
        }

    }
}
