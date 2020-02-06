/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JOptionPane;

/**
 *
 * @author angelo aulestia
 */
public class rectangulo extends punto {
    private int lado1;
    private int lado2;

    public rectangulo() {
        super();
        this.lado1=Integer.parseInt(JOptionPane.showInputDialog("ingrese el lado 1 del rectangulo: "));
        this.lado2=Integer.parseInt(JOptionPane.showInputDialog("ingrese el lado 2 del rectangulo: "));
    }

    public rectangulo(int lado1, int lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public rectangulo(int lado1, int lado2, int x, int y) {
        super(x, y);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }
    
    public void paint(Graphics g) {  
        g.setColor(Color.MAGENTA);
        g.drawRect(super.getX(), super.getY(), this.lado1, this.lado2);

    }
    
}
