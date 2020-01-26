/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparacion;

import java.util.logging.Logger;

/**
 *
 * @author angelo aulestia
 */
public class empleado {
    Comparacion sc=new Comparacion();
    private String nombre;
    private String apellido;
    private String fecha_inicio;
    private String fecha_nacimiento;
    private double salario;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(String fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
        
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public empleado(String nombre, String apellido, String fecha_inicio, String fecha_nacimiento, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha_inicio = fecha_inicio;
        this.fecha_nacimiento = fecha_nacimiento;
        this.salario = salario;
    }

    public empleado() {
    }

    @Override
    public String toString() {
        return "empleado{" + "nombre=" + nombre + ", apellido=" + apellido + ", fecha_inicio=" + fecha_inicio + ", fecha_nacimiento=" + fecha_nacimiento + ", salario=" + salario + '}';
    }
    
    public double salario(){
        double numMax=0;
        double n[] = null;
        for(int cont = 1;cont <= 5;cont++ ){
        if(n[cont]<numMax){
            numMax=n[cont];
        }
 
    }
        return 0;
    }
    
    
    
}