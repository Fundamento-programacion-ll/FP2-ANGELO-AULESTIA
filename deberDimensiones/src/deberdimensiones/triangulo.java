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
public class triangulo extends dimensiones{
    public float areaTriangulo(){
        int altura=getAltura();
        int base=getBase();
        float resultado=(altura*base)/2;
        System.out.println("la area del triangulo es: "+resultado);
        return resultado;
    }
    
    public float volumenTriangulo(){
        int altura=getAltura();
        int base=getBase();
        float resultado=(altura*base)/3;
        System.out.println("El volumen del triangulo es: "+resultado);
        return resultado;
    }
     public float perimetroTringulo(){
         int lado=getLados();
         float resultado=lado*3;
         System.out.println("El perimetro del triganulo es: "+resultado);
         return resultado;
     }
    
}
