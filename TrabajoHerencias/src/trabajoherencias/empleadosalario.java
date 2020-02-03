/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajoherencias;

/**
 *
 * @author angelo aulestia
 */
public class empleadosalario extends empleado {
    private double salarioSemanal;

    public empleadosalario() {
    }

    public empleadosalario(double salarioSemanal) {
        this.salarioSemanal = salarioSemanal;
    }

    public empleadosalario(double salarioSemanal, String nombre, String apellido, int CI) {
        super(nombre, apellido, CI);
        this.salarioSemanal = salarioSemanal;
    }

    public double getSalarioSemanal() {
        return salarioSemanal;
    }

    public void setSalarioSemanal(double salarioSemanal) {
        this.salarioSemanal = salarioSemanal;
    }    

    @Override
    public String toString() {
        return "Datos empleado \n"+" nombre: \n"+getNombre()+" el apellido: \n"+getApellido()+" Cedula: \n"+getCI()+" Salario semanal: \n"+CalcarIngresos();
    }

    
    @Override
    public Double CalcarIngresos() {
        return this.salarioSemanal;
    }
    
    
    
}
