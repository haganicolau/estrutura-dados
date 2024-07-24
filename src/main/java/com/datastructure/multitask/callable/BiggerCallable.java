package com.datastructure.multitask.callable;

import java.util.List;
import java.util.concurrent.Callable;

public class BiggerCallable implements Callable<Integer> {

    List<Integer> listOfNumbers;

    public BiggerCallable(List<Integer> listOfNumbers) {
        this.listOfNumbers = listOfNumbers;
    }

    @Override
    public Integer call() throws Exception {
        if (!listValidate()) {
            throw new Exception("List o numbers is empty");
        }

        int result = this.listOfNumbers.get(0);
        for (Integer num : this.listOfNumbers) {
            if (num > result) {
                result = num;
            }
        }
        return result;
    }

    public boolean listValidate() {
        return !this.listOfNumbers.isEmpty();
    }
}
