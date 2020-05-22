package com.estruturadados.list;

public class mainList {
    public static void main (String args[]) {
        DinamicList list = new DinamicList();

        list.insert(1);
        list.insert(7);
        list.insert(8);
        list.insert(75);
        list.insert(133);

        try{
            list.list();
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}