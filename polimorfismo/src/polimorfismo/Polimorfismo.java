/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

import javax.swing.JFrame;
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
        menu();

//        punto pto = new punto();
//        circulo circle = new circulo();
//        cilindro cili = new cilindro();
    }

    public static void menu() {
        JFrame ventana = new JFrame();
        String input = JOptionPane.showInputDialog(null, "Ingreser la opcion a dibujar:\n"+"1.-punto\n"+"2.-circulo\n"+"3.-cilindro\n"+"4.-cuadrado\n"+"5.-Rectangulo\n"+"4.-salir");
        if (input.equalsIgnoreCase("punto")) {
            punto pto = new punto();
            ventana.add(pto);
            ventana.setSize(700, 400);
            ventana.setVisible(true);
            ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        } else if (input.equalsIgnoreCase("circulo")) {
            
            circulo circle = new circulo();
            ventana.add(circle);
            ventana.setSize(700, 400);
            ventana.setVisible(true);
            ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            System.out.println("el area del ciruclo es= "+356);
         }else if(input.equalsIgnoreCase("cuadrado")){
            cuadrado cua=new cuadrado();
            ventana.add(cua);
            ventana.setSize(700, 400);
            ventana.setVisible(true);
            ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
            }else if(input.equalsIgnoreCase("rectangulo")){
            rectangulo rec=new rectangulo();
            ventana.add(rec);
            ventana.setSize(700, 400);
            ventana.setVisible(true);
            ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          }else if(input.equalsIgnoreCase("cilindro")){
            cilindro ci=new cilindro();
            ventana.add(ci);
            ventana.setSize(700, 400);
            ventana.setVisible(true);
            ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          } else {
            JOptionPane.showMessageDialog(null, "Opcion no encontrada");
        }
    }
}
