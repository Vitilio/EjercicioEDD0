/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.15
 */
package com.mycompany.ejercicioedd0;

import java.util.Scanner;

/**
 *Calculates the area of a triangle
 * @author Víctor
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Triangle triangle = new Triangle();
        System.out.println("¿Cuál es la altura del triángulo?");
        Scanner scanner = new Scanner(System.in);
        triangle.setHeight(scanner.nextFloat());
        
        System.out.println("¿Cuál es el base del triángulo?");
        scanner = new Scanner(System.in);
        triangle.setBase(scanner.nextFloat());
        
        float area = triangle.calculateArea();
        System.out.println("El área del triangulo es "+area);
        
        float fixedHeight = 5;
        float fixedBase = 4;
        
        Triangle fixedTriangle = new Triangle (fixedBase,fixedHeight);
        System.err.println("El área del triángulo fijado es " + fixedTriangle);
    }
    
}
