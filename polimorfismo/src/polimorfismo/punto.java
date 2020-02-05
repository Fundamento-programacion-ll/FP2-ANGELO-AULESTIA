/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author angelo aulestia
 */
public class punto extends figura{
    int x;
    int y;

    public punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public punto() {
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public void dibujo(Graphics g) {
        //rellenar un ovalo
        g.setColor(Color.MAGENTA);
        g.fillOval(this.x,this.y, 20, 20);
    }

    @Override
    public String toString() {
        return "los punto que usted ingreson son:\n"+"X= "+this.x+"\n"+"Y= "+this.y;
    }
    
    
    
}
