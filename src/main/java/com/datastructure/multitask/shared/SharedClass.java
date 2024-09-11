package com.datastructure.multitask.shared;

public class SharedClass {
    int a = 0;
    int b = 0;

    public void method1() {
        int local1 = a;
        this.b = 1;
    }

    public void method2() {
        int local2 = b;
        this.a = 2;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

}

