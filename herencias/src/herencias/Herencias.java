/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias;

/**
 *
 * @author angelo aulestia
 */
public class Herencias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        perro perrito=new perro((float) 10.5, "perro", "masculino", "Dogy", 5);
        perrito.datosPerro();
        gato gatito=new gato ("Rojos", "persa", "femenino", "Dorami", 3);
        gatito.datosGato();
    }
    
}
