/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajo1;

import java.util.Scanner;

/**
 *
 * @author angelo aulestia
 */
public class Trabajo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        serie num=new serie();
        int n1;
        System.out.println("Ingrese el numero");
        n1=sc.nextInt();
        num.setN(n1);
        System.out.println("resultado: "+num.resul());
    }
    
}
