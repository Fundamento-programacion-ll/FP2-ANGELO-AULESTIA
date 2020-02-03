/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import java.util.ArrayList;

/**
 *
 * @author crist
 */
public class user {
    ArrayList listaPersona=new ArrayList<String>();
    
    
      public String agregarPersona(String nombre){
       listaPersona.add(nombre);
       return "Persona agregada correctamente"+nombre;
   }
   public String ListadPersonas(){
       String lista="";
       for(int i=0; i<listaPersona.size();i++){
           System.out.println(listaPersona.get(i));
           lista +=listaPersona.get(i).toString()+"\n";
       }
       return lista;
   }
   }
