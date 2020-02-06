/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparadores;

import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 *
 * @author angelo aulestia
 */
public class provincias {
    private String nombreProvincias;
    private int numeroHabitantes;

    public provincias() {
        super();
        String datosNombre;
        int datosHabitantes;
        datosNombre = JOptionPane.showInputDialog("ingrese el nombre de las provincia separados por ';'");
        datosHabitantes=Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero de habitantes de esa privincia"));
        StringTokenizer tokens = new StringTokenizer(datosNombre, ";");
        this.nombreProvincias=tokens.nextToken();
        this.numeroHabitantes=datosHabitantes;
        
        
    }
    public provincias(String nombreProvincias, int numeroHabitantes) {
        this.nombreProvincias = nombreProvincias;
        this.numeroHabitantes = numeroHabitantes;
    }
    public String getNombreProvincias() {
        return nombreProvincias;
    }

    public void setNombreProvincias(String nombreProvincias) {
        this.nombreProvincias = nombreProvincias;
    }

    public int getNumeroHabitantes() {
        return numeroHabitantes;
    }

    public void setNumeroHabitantes(int numeroHabitantes) {
        this.numeroHabitantes = numeroHabitantes;
    }
    
    
    
}
