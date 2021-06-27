package com.datastructure.matriz;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author haganicolau
 */
public class MainRoutes {
    public static void main(String[] args){
        Routes routes = new Routes();
        routes.enterValues();
        int origin, destiny;
        Scanner scan = new Scanner(System.in);

        try{

            System.out.println("Choose origin city: ");
            System.out.println("0- Cáceres");
            System.out.println("1- BBugres");
            System.out.println("2- Cuiabá");
            System.out.println("3- VGrande");
            System.out.println("4- Tangará");
            System.out.println("5- PLacerda");
            origin = scan.nextInt();

            System.out.println();
            System.out.println();

            System.out.println("Choose destiny city: ");
            System.out.println("0- Cáceres");
            System.out.println("1- BBugres");
            System.out.println("2- Cuiabá");
            System.out.println("3- VGrande");
            System.out.println("4- Tangará");
            System.out.println("5- PLacerda");
            destiny = scan.nextInt();

            int distance = routes.navigate(origin, destiny);
            System.out.println("distance is: " + distance);

        }catch(Exception ex) {

            System.out.println(ex.getMessage());
        }
        scan.close();
    }
}
