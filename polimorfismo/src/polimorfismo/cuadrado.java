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
public class cuadrado extends punto{
    private int lado;

    public cuadrado() {
        super();
        this.lado=Integer.parseInt(JOptionPane.showInputDialog("ingrese el lado del cuadrado: "));
    }

    public cuadrado(int lado) {
        this.lado = lado;
    }

    public cuadrado(int lado, int x, int y) {
        super(x, y);
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
    
    public void paint(Graphics g) {  
        int resul=getLado()*getLado();
        g.setColor(Color.MAGENTA);
        g.drawRect(super.getX(), super.getY(), resul, resul);

    }
    
}
