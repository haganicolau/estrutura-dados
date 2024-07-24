package com.datastructure.multitask.callable;

import java.util.List;
import java.util.concurrent.Callable;

public class AvgCallable implements Callable<Double> {

    List<Integer> listOfNumbers;

    public AvgCallable(List<Integer> listOfNumbers) {
        this.listOfNumbers = listOfNumbers;
    }

    @Override
    public Double call() throws Exception {
        if (!listValidate()) {
            throw new Exception("List o numbers is empty");
        }

        double result = 0;
        double quantity = 0;
        for (Integer num : this.listOfNumbers) {
            result = result + num;
            quantity++;
        }
        return result/quantity;
    }

    public boolean listValidate() {
        return !this.listOfNumbers.isEmpty();
    }
}
