/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejecuta;

import javax.swing.JOptionPane;

/**
 *
 * @author angelo aulestia
 */
public class Ejecuta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int edad;
         String nombre;
         int cedula;
         String apellido;
         String genero;
         String area = null;
        administrativo a=new administrativo();
        docente b=new docente();
        limpieza c=new limpieza();
        double sueldoa;
        double sueldob;
        double sueldoc;
        String op;
        do{
        nombre=JOptionPane.showInputDialog(null, "coloque su nombre");
        apellido=JOptionPane.showInputDialog(null, "coloque su apellido");
        genero=JOptionPane.showInputDialog(null, "Es hombre o mujer?");
        edad=Integer.parseInt(JOptionPane.showInputDialog(null, "coloque su edad"));
        cedula=Integer.parseInt(JOptionPane.showInputDialog(null, "coloque su cedula"));
        area=JOptionPane.showInputDialog(null, "Coloque su area de trabajo: \n"+"1.-Administrativo\n"+"2.-Docente\n"+"3.-Limpieza");
        if(area.equalsIgnoreCase("Administrativo")){
            a.setNombre(nombre);
            a.setApellido(apellido);
            a.setEdad(edad);
            a.setCedula(cedula);
            a.setGenero(genero);
            a.setArea(area);
            sueldoa=Double.parseDouble(JOptionPane.showInputDialog("ingrese su sueldo en total:"));
        }else if(area.equalsIgnoreCase("Docente")){
            String cargo;
            b.setNombre(nombre);
            b.setApellido(apellido);
            b.setEdad(edad);
            b.setCedula(cedula);
            b.setGenero(genero);
            b.setArea(area);
            sueldob=Double.parseDouble(JOptionPane.showInputDialog("ingrese su sueldo en total:"));
            cargo=JOptionPane.showInputDialog("ingrese su cargo ya sea lic o master");
            b.setCargo(cargo);
            
        }else if(area.equalsIgnoreCase("Limpieza")){
            String turno;
            c.setNombre(nombre);
            c.setApellido(apellido);
            c.setEdad(edad);
            c.setCedula(cedula);
            c.setGenero(genero);
            turno=JOptionPane.showInputDialog("ingrese que turno hace? (ejem: Matutino");
            c.setTurno(turno);
            sueldoc=Double.parseDouble(JOptionPane.showInputDialog("ingrese su sueldo en total:"));
        }else{
            JOptionPane.showMessageDialog(null, "coloque una de las 3 opciones que les damos");
        }
        op=JOptionPane.showInputDialog("quiere colocar otro trabajador o reemplazar los datos? si/no");
        }while(op.equalsIgnoreCase("Si"));
        
    }
    
}
