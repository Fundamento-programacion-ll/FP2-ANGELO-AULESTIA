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
public class cilindro extends circulo{
    private int altura;

    public cilindro(int altura, int radio, int x, int y) {
        super(radio, x, y);
        this.altura = altura;
    }

    public cilindro(int altura, int radio) {
        super(radio);
        this.altura = altura;
    }

    public cilindro(int altura) {
        this.altura = altura;
    }

    public cilindro() {
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
     public void dibujo(Graphics g){
        g.setColor(Color.MAGENTA);
        g.drawOval(getX(), getY(), getRadio(), getRadio());
        g.drawRect(getX(), getY(),getRadio(), getRadio());
        g.drawRect(getX(), getY(),getRadio(), getRadio());
        g.drawOval(-getX(), -getY(), -getRadio(), -getRadio());
    }

    
    
}
