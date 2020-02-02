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
public class DeberDimensiones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        triangulo resul1=new triangulo();
        cuadrado resul2=new cuadrado();
        circulo resul3=new circulo();
        System.out.println("Los datos del triangulo son: ");
        resul1.areaTriangulo();
        resul1.perimetroTringulo();
        resul1.volumenTriangulo();
        System.out.println("los datos del cuadrado son: ");
        resul2.areaCuadrado();
        resul2.perimetroCuadrado();
        resul2.volumenCuadrado();
        System.out.println("Los resultado del circulo son: ");
        resul3.areaCirculo();
        resul3.circunferenciaCirculo();
        resul3.volumenCirculo();
        
    }
    
}
