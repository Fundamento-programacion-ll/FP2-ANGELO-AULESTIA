/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejecuta;

import java.util.Comparator;

/**
 *
 * @author angelo aulestia
 */
public class comparador implements Comparator{
    double compararSueldo;
    Ejecuta eje=new Ejecuta();
    administrativo a=new administrativo();
    docente b=new docente();
    limpieza c=new limpieza();
    @Override
    public int compare(Object com1, Object com2) {
        return 0;
    }
    
}
