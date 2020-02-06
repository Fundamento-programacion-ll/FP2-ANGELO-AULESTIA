/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

import com.sun.org.apache.bcel.internal.generic.D2F;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JOptionPane;

/**
 *
 * @author angelo aulestia
 */
public class circulo extends punto {

    private double radio;

    public circulo(int x, int y, double radio) {
        super(x, y);
        this.radio = radio;
    }

    public circulo() {
        super();
        this.radio = Double.parseDouble(JOptionPane.showInputDialog("ingrese la radio del circulo"));
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getDiametro() {
        return 2 * this.radio;
    }

    public double getCircunferencia() {
        return Math.PI * this.getDiametro();
    }

    public double getPerimetro() {
        return this.getCircunferencia();
    }

    public void paint(Graphics g) {        
        g.setColor(Color.MAGENTA);
        g.drawOval(super.getX(), super.getY(), (int) this.radio, (int) this.radio);

    }

    public double getArea() {
        return Math.PI * getRadio() * getRadio();
        
    }

    public double getVolumen() {
        return 0.0;
    }

    @Override
    public String toString() {
        return "\n Circulo" + super.toString() + " \n Radio= " + this.radio;
    }
  
    @Override
    public double area() {
        
        return getArea();
    }

}
