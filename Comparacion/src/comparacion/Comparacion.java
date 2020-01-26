/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparacion;

/**
 *
 * @author angelo aulestia
 */
public class Comparacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       empleado sa=new empleado();
       empleado n1=new empleado("Angelo", "Aulestia","13/05/2010", "10/08/2000",352.50);
       empleado n2=new empleado("David", "Ortega","15/05/2000", "19/26/2000",300.50);
       empleado n3=new empleado("Cristian", "Crodova","01/05/1960", "06/03/2007",200.50);
       empleado n4=new empleado("David", "Nicolas","1/03/2000", "30/12/1980",150.50);
       empleado n5=new empleado("Angelo", "Aulestia","14/60/1986", "30/16/2012",250.50);
       
        System.out.println("El empleado mas antiguo es: "+n1);
        System.out.println("El empleado que gana mas es: "+sa.sc);
       
    }
    
}
