/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.estruturadados.matriz;

import java.util.Scanner;

/**
 *
 * @author haganicolau
 */
public class RotasMain {
    public static void main(String args[]){
        Rotas rotas = new Rotas();
        rotas.popular();
        int origem, destino;
        Scanner scan = new Scanner(System.in);
        
        try{
            
            System.out.println("Escolha a cidade de origem: ");
            System.out.println("0- Cáceres");
            System.out.println("1- BBugres");
            System.out.println("2- Cuiabá");
            System.out.println("3- VGrande");
            System.out.println("4- Tangará");
            System.out.println("5- PLacerda");
            origem = scan.nextInt();
            
            System.out.println();
            System.out.println();
                    
            System.out.println("Escolha a cidade de destino: ");
            System.out.println("0- Cáceres");
            System.out.println("1- BBugres");
            System.out.println("2- Cuiabá");
            System.out.println("3- VGrande");
            System.out.println("4- Tangará");
            System.out.println("5- PLacerda");
            destino = scan.nextInt();
        
            int distancia = rotas.navegar(origem, destino);
            System.out.println("Distância é: " + distancia);
        
        }catch(Exception ex) {
            
            System.out.println(ex.getMessage());
        }
        scan.close();
    }
}
