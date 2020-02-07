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
public class administrativo extends persona{
    private String area;

    public administrativo() {
    }

    public administrativo(String area) {
        this.area = area;
    }

    public administrativo(String area, int edad, String nombre, int cedula, String apellido, String genero) {
        super(edad, nombre, cedula, apellido, genero);
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public double sueldo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
