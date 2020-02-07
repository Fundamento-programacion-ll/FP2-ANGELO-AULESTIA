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
public abstract class persona  {
    private int edad;
    private String nombre;
    private int cedula;
    private String apellido;
    private String genero;

    public persona() {
        
    }

    public persona(int edad, String nombre, int cedula, String apellido, String genero) {
        this.edad = edad;
        this.nombre = nombre;
        this.cedula = cedula;
        this.apellido = apellido;
        this.genero = genero;
    }
    
    

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    public abstract double sueldo();
    
}
