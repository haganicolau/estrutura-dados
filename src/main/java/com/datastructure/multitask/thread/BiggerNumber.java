package com.datastructure.multitask.thread;

import java.util.List;

public class BiggerNumber extends Thread {

    List<Integer> listOfNumbers;

    Integer result = 0;

    public BiggerNumber(List<Integer> listOfNumbers) {
        this.listOfNumbers = listOfNumbers;
    }

    public List<Integer> getListOfNumbers() {
        return listOfNumbers;
    }

    public Integer getResult() {
        return result;
    }

    @Override
    public void run() {
        if (!listValidate()) {
            throw new RuntimeException("List o numbers is empty");
        }

        operation();
        printResult();
    }

    public boolean listValidate() {
        return !this.listOfNumbers.isEmpty();
    }

    public void operation() {
        result = this.listOfNumbers.get(0);
        for (Integer num : this.listOfNumbers) {
            if (num > result) {
                result = num;
            }
        }

    }

    public void printResult() {
        System.out.println("Bigger num: " + result);
    }

}
