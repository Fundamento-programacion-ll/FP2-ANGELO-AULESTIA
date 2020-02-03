/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deberdimensiones;

/**
 *
 * @author angelo aulestia
 */
public class circulo extends dimensiones {
    public float areaCirculo(){
        int base=getBase();
        float resultado=(float) (3.1416*(base*base));
        System.out.println("la area del Circulo es: "+resultado);
        return resultado;
    }
    public float volumenCirculo(){
        int base=getBase();
        float resultado=(float)(1/4*3.1416*(base*base*base));
        System.out.println("El volumen del Circulo es: "+resultado);
        return resultado;
    }
    public float circunferenciaCirculo(){
         int base=getBase();
         float resultado=2*base;
         System.out.println("LA cincunferencia de circulo es: "+resultado);
         return resultado;
     }
    
    
}
