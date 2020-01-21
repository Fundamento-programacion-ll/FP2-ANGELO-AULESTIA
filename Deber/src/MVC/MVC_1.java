/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;

import Modelo.persona;
import java.util.Scanner;


/**
 *
 * @author crist
 */
public class MVC_1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String res;
        String cedula;
        do{
        System.out.println("Coloque el numero de cedula");
        cedula=sc.next();
        if(cedula.length()>10 ||cedula.length()<10){
            System.err.println("la cedula ingresada esta mal porfavor coloque bien los valores");
            }else{
            int cedulap=Integer.parseInt(cedula);
            persona cristian = new persona ("cristian","cordova",0, 0,cedulap, "la 41", 'm', true);
            System.out.println(cristian);
            }
            System.out.println("Desea intentarlo de nuevo o salir? n=salir o s=Mostrar resultado");
        res=sc.next();
        }while(!res.equalsIgnoreCase("n"));    
    }
}
