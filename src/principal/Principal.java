/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.Scanner;

/**
 *
 * @author Estudiantes
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        
        Scanner s = new Scanner(System.in);
        int a = 0;
        
        System.out.println("El sistema solo validara puntos en el primer cuadrante,");
        System.out.println("Los puntos ingresados en otros cuadrantes se moveran a primero.");
        
        System.out.println("Ingrese el punto 1 en X:");
        calculator.punto1.setX(s.nextInt());
        System.out.println("Ingrese el punto 1 en Y:");
        calculator.punto1.setY(s.nextInt());
        
        System.out.println("Ingrese el punto 2 en X:");
        calculator.punto2.setX(s.nextInt());
        System.out.println("Ingrese el punto 2 en Y:");
        calculator.punto2.setY(s.nextInt());
        
        System.out.println("Distancia entre los puntos:");
        System.out.println(calculator.CalcularDistacia());
        
        System.out.println("area bajo los puntos los puntos:");
        System.out.println(calculator.CalcularArea());
        
        System.out.println("Pendiente de la linea entre los puntos:");
        System.out.println(calculator.CalcularPendiente());

    }
    
}
