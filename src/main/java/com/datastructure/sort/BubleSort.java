package com.datastructure.ordenacao;

public class BubleSort extends AbstractSort {

    public BubleSort(int size) {
        super(size);
        this.generateRandomArray();
    }

     /**
     * Buble selection sort O(n^2)
     * @author Hagamenon Oliveira <haganicolau@gmail.com>
     * @return void 
     */
    public void sort() {
        int i,j,aux;

        for(j = 0; j < this.array.length; j++) {
            for(i = 0; i < this.array.length - 1; i++) {

                this.compare++;
                if(this.array[i] > this.array[i + 1]) {
                    aux = this.array[i];
                    this.array[i] = this.array[i + 1];
                    this.array[i + 1] = aux;

                    this.change++;
                }
            }
        }

    }

}
