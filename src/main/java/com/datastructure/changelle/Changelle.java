package com.datastructure.changelle;

import java.io.IOException;
import java.util.Arrays;

public class Changelle {
    public static void main (String [] args) throws IOException {

        //String input = "O draconia;conian devil! Oh la;h lame sa;saint!";
        String input = "m quaerat voluptatem.;pora incidunt ut labore et d;, consectetur, adipisci velit;olore magnam aliqua;idunt ut labore et dolore magn;uptatem.;i dolorem ipsum qu;iquam quaerat vol;psum quia dolor sit amet, consectetur, a;ia dolor sit amet, conse;squam est, qui do;Neque porro quisquam est, qu;aerat voluptatem.;m eius modi tem;Neque porro qui;, sed quia non numquam ei;lorem ipsum quia dolor sit amet;ctetur, adipisci velit, sed quia non numq;unt ut labore et dolore magnam aliquam qu;dipisci velit, sed quia non numqua;us modi tempora incid;Neque porro quisquam est, qui dolorem i;uam eius modi tem;pora inc;am al";
        String parts[] = input.split(";");
        Arrays.sort(parts);
        /*part1 O draconia*/
        StringBuilder output = new StringBuilder();


    }
}
