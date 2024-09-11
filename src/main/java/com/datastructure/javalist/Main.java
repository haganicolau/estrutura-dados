package com.datastructure.javalist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List arrayList = new ArrayList<String>();
        List linkedList = new LinkedList<String>();

        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");
        arrayList.add("4");
        arrayList.add("5");


        linkedList.add("1");
        linkedList.add("2");
        linkedList.add("3");
        linkedList.add("4");
        linkedList.add("5");

        System.out.println(arrayList.remove(0));
        System.out.println(linkedList.get(0));

        System.out.println(arrayList.contains("2"));
        System.out.println(linkedList.contains("3"));

        System.out.println(arrayList.contains("4"));

    }
}
