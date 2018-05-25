/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import static java.lang.Math.*;

/**
 *
 * @author Estudiantes
 */
public class Calculator implements ICalculator{
    
    public Punto punto1 = new Punto();
    public Punto punto2 = new Punto(); 
    
   
    
    public double CalcularDistacia(){
        double a=0;
        a = sqrt(pow(punto2.getY()-punto1.getY() ,2) + pow(punto2.getX()-punto1.getX(),2));
        return a;
    }
    public double CalcularArea(){
        double a=0;
        double b=0;
        a = (punto1.getY()*punto1.getX());
        b =((punto2.getY()-punto1.getY())*(punto2.getX()-punto1.getX()));
        return a+(b/2);
    }
    public double CalcularPendiente(){
        double a=0;
        a = (punto2.getY() - punto1.getY()/punto2.getX() - punto1.getX());
        return a;
    }

    
}
