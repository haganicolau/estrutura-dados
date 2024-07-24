package com.datastructure.multitask.thread;

import java.util.List;

public class SubNumbers extends Thread {

    List<Integer> listOfNumbers;

    Integer result = 0;

    public SubNumbers(List<Integer> listOfNumbers) {
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

        for (Integer num : this.listOfNumbers) {
            result = result - num;
        }
    }

    public void printResult() {
        System.out.println("result sub: " + result);
    }

}
