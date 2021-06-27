package com.datastructure.sort;

/**
 *
 * @author Hagamenon.Oliveira<haganicolau@gmail.com>
 */
public class InsertionSort extends AbstractSort {

    public InsertionSort(int size) {
        super(size);
        this.generateRandomArray();
    }

    /**
     * Método insertion sort O(n^2)
     * @author Hagamenon Oliveira <haganicolau@gmail.com>
     * @return void 
     */
    public void sort() {
        int i, j, key;

        for(j = 1; j < this.array.length; j++) {
            key = this.array[j];
            i = j - 1;

            while(i >= 0 && this.array[i] > key) {
                this.array[i + 1] = this.array[i];
                i--;

                this.compare++;
            }
            this.change++;
            this.array[i + 1] = key;
        }
    }
}
