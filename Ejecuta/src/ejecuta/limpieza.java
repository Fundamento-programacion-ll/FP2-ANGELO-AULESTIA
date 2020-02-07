/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejecuta;

/**
 *
 * @author angelo aulestia
 */
public class limpieza  extends persona{
    private String turno;

    public limpieza() {
    }
    public limpieza(String turno) {
        this.turno = turno;
    }

    public limpieza(String turno, int edad, String nombre, int cedula, String apellido, String genero) {
        super(edad, nombre, cedula, apellido, genero);
        this.turno = turno;
    }

    
    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    
    @Override
    public double sueldo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }  
}
