package com.datastructure.multitask.shared;

public class Main {

    public static void main(String[] args) {
        SharedClass sharedClass = new SharedClass();

        Thread thread1 = new Thread(() -> sharedClass.method1());
        Thread thread2 = new Thread(() -> sharedClass.method2());

        thread1.start();
        thread2.start();

        System.out.println("A: " + sharedClass.getA());
        System.out.println("B: " + sharedClass.getB());
    }

}
