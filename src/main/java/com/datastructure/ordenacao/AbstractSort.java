package com.datastructure.ordenacao;

import java.util.Random;

public abstract class AbstractSort {

    protected int change;
    protected int compare;
    protected int array[];

    public AbstractSort(int size) {
        this.change = 0;
        this.compare = 0;
        this.array = new int[size];
    }

    public abstract void sort();

    public void generateRandomArray() {
        Random random = new Random();

        for(int i = 0; i < this.array.length; i ++) {
            array[i] = random.nextInt(100);
        }
    }

    public void printarVetor() {
        System.out.print("array [ ");
        for (int j : this.array) {
            System.out.print(j + " ");
        }
        System.out.print("];");
    }

    public int getCompare() {
        return compare;
    }

    public int getChange() {
        return change;
    }
}

