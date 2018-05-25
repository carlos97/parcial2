/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import static java.lang.Math.abs;

/**
 *
 * @author Estudiantes
 */
public class Punto {
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) 
    {
        this.x = abs(x);
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = abs(y);
    }
    
    public void setPoint(int n,int m){
        
    }
}
