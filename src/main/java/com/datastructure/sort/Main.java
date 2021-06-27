package com.datastructure.sort;

public class Main {
    public static void main(String[] args) {

        BubleSort buble = new BubleSort(10);
        System.out.println("*********BUBLE SORT*********");
        System.out.print("Before: ");
        buble.arrayPrint();
        buble.sort();
        System.out.print("After: ");
        buble.arrayPrint();
        System.out.println("Compares: " + buble.getCompare());
        System.out.println("Changes: " + buble.getChange());


        System.out.println("");
        InsertionSort insertion = new InsertionSort(10);
        System.out.println("*********INSERTION SORT*********");
        System.out.print("Before: ");
        insertion.arrayPrint();
        insertion.sort();
        System.out.print("After: ");
        insertion.arrayPrint();
        System.out.println("Compares: " + insertion.getCompare());
        System.out.println("Changes: " + insertion.getChange());

        System.out.println("");
        SelectionSort selection = new SelectionSort(10);
        System.out.println("*********SELECTION SORT*********");
        System.out.print("Before: ");
        selection.arrayPrint();
        selection.sort();
        System.out.print("After: ");
        selection.arrayPrint();
        System.out.println("Compares: " + selection.getCompare());
        System.out.println("Changes: " + selection.getChange());

        System.out.println("");
        ShellSort shell = new ShellSort(10);
        System.out.println("*********SHELL SORT*********");
        System.out.print("Before: ");
        shell.arrayPrint();
        shell.sort();
        System.out.print("After: ");
        shell.arrayPrint();
        System.out.println("Compares: " + shell.getCompare());
        System.out.println("Changes: " + shell.getChange());

        System.out.println("");
        MergeSort merge = new MergeSort(10);
        System.out.println("*********MERGE SORT*********");
        System.out.print("Before: ");
        merge.arrayPrint();
        merge.sort();
        System.out.print("After: ");
        merge.arrayPrint();
        System.out.println("Compares: " + merge.getCompare());
        System.out.println("Changes: " + merge.getChange());

        System.out.println("");
        QuickSort quick = new QuickSort(10);
        System.out.println("*********QUICK SORT*********");
        System.out.print("Before: ");
        quick.arrayPrint();
        quick.sort();
        System.out.print("After: ");
        quick.arrayPrint();
        System.out.println("Compares: " + quick.getCompare());
        System.out.println("Changes: " + quick.getChange());
    }
}
