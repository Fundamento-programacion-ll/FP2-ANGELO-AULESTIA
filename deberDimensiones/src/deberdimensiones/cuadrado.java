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
public class cuadrado extends dimensiones{
    public float areaCuadrado(){
        int lado=getLados();
        float resultado=lado*lado;
        System.out.println("la area del Cuadrado es: "+resultado);
        return resultado;
    }
    public float volumenCuadrado(){
        int lado=getLados();
        float resultado=lado*lado*lado;
        System.out.println("El volumen del Cuadrado es: "+resultado);
        return resultado;
    }
    public float perimetroCuadrado(){
         int lado=getLados();
         float resultado=lado+lado+lado+lado;
         System.out.println("El perimetro del Cuadrado es: "+resultado);
         return resultado;
     }
    
}
