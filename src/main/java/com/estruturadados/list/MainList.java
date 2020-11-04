package com.estruturadados.list;

import com.estruturadados.list.exceptino.ListException;
import com.estruturadados.list.exceptino.RemoveListException;

public class MainList {
    public static void main(String [] args) {
        DinamicList list = new DinamicList();
        list.insertFirst(7);
        list.insertFirst(14);
        list.insertFirst(75);
        list.insertFirst(8);
        list.insertFirst(133);

        try {
            list.list();

        } catch(ListException ex) {
            System.out.println(ex.getMessage());
        }


    }
}
