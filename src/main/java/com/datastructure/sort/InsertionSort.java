package com.datastructure.ordenacao;

/**
 *
 * @author Hagamenon.Oliveira<haganicolau@gmail.com>
 */
public class InsertionSort extends AbstractSort {

    public InsertionSort(int size) {
        super(size);
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

            this.compare++;
            while(i >= 0 && this.array[i] > key) {
                this.array[i + 1] = this.array[i];
                i--;

                this.change++;
            }
            this.array[i + 1] = key;
        }
    }
}
