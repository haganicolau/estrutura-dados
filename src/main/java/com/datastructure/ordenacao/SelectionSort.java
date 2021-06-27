package com.datastructure.ordenacao;

public class SelectionSort extends AbstractSort {

    public SelectionSort(int size) {
        super(size);
    }

    /**
     * Método selection sort O(n^2)
     * @author Hagamenon Oliveira <haganicolau@gmail.com>
     * @return void 
     */
    public void sort() {
        int i,j,min,aux;

        for(i = 0; i < this.array.length; i++) {
            min = i;
            
            for(j = i + 1; j < this.array.length; j++) {
                if(this.array[j] < this.array[min]) {
                    min = j;
                }

            }
            aux = this.array[i];
            this.array[i] = this.array[min];
            this.array[min] = aux;
        }

    }

}