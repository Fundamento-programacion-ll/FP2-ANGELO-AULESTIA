/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparadores;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author angelo aulestia
 */
public class pais {
    private ArrayList<provincias> listaProbvincias;
    

    public pais() {
        this.listaProbvincias=new ArrayList<>();
    }
    
    public pais(ArrayList<provincias> listaProbvincias) {
        this.listaProbvincias = listaProbvincias;
    }
    
    public ArrayList<provincias> getListaProbvincias() {
        return listaProbvincias;
    }

    public void setListaProbvincias() {
        int opcion ;
        provincias provincia;
        do {            
            provincia = new provincias();
            agregarProvincia(provincia);
            opcion = JOptionPane.showConfirmDialog(null, "Mas Provincias", "Continuar",JOptionPane.YES_NO_CANCEL_OPTION);
        } while (opcion==JOptionPane.YES_NO_CANCEL_OPTION);
    }
    
   public void agregarProvincia(provincias provincia) {
       this.listaProbvincias.add(provincia);
   }
   
   
    
    
}
