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
public class circulo extends punto{
    private int radio;

    public circulo(int radio, int x, int y) {
        super(x, y);
        this.radio = radio;
    }

    public circulo(int radio) {
        this.radio = radio;
    }

    public circulo() {
        
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }
    
     public void dibujo(Graphics g){
        g.setColor(Color.MAGENTA);
        g.drawOval(getX(), getY(), radio, radio);
    }

    @Override
    public String toString() {
        return "El radio que usted ingreso es: "+this.radio;
    }
     
    
}
