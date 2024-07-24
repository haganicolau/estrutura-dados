package com.datastructure.multitask.callable;

import java.util.List;
import java.util.concurrent.Callable;

public class SubCallable implements Callable<Integer> {

    List<Integer> listOfNumbers;

    public SubCallable(List<Integer> listOfNumbers) {
        this.listOfNumbers = listOfNumbers;
    }

    @Override
    public Integer call() throws Exception {
        if (!listValidate()) {
            throw new Exception("List o numbers is empty");
        }

        int result = 0;
        for (Integer num : this.listOfNumbers) {
            result = result - num;
        }
        return result;
    }

    public boolean listValidate() {
        return !this.listOfNumbers.isEmpty();
    }
}
