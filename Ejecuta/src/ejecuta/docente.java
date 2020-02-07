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
public class docente  extends persona{
    
    private String area;
    private String cargo;

    public docente() {
    }

    public docente(String area, String cargo) {
        this.area = area;
        this.cargo = cargo;
    }

    public docente(String area, String cargo, int edad, String nombre, int cedula, String apellido, String genero) {
        super(edad, nombre, cedula, apellido, genero);
        this.area = area;
        this.cargo = cargo;
    }
    
    

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    
    

    @Override
    public double sueldo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
