/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

import javax.swing.JOptionPane;

/**
 *
 * @author angelo aulestia
 */
public class Polimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        circulo a=new circulo();
        punto b=new punto();
        int X;
        int Y;
        int Radio;
        String op;
        op=JOptionPane.showInputDialog("Menu\n"+"1.-Punto\n"+"2.-Circulo");
        if(op.equalsIgnoreCase("punto")){
            X=Integer.parseInt(JOptionPane.showInputDialog("ingrese X"));
            b.setX(X);
            Y=Integer.parseInt(JOptionPane.showInputDialog("ingrese Y"));
            b.setY(Y);
        }else if(op.equalsIgnoreCase("circulo")){
            Radio=Integer.parseInt(JOptionPane.showInputDialog("ingrese el radio"));
            a.setRadio(Radio);
            
        }else{
            JOptionPane.showConfirmDialog(null, "Escoja las opciones que se le de");
        }
    }
    
}
