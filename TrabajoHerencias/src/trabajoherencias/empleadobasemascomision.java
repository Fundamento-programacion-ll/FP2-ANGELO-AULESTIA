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
public class empleadobasemascomision extends empleadoporcomision {
    private double salarioBase;

    public empleadobasemascomision() {
    }
    public empleadobasemascomision(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public empleadobasemascomision(double salarioBase, double ventasBrutas, double tarifaComision) {
        super(ventasBrutas, tarifaComision);
        this.salarioBase = salarioBase;
    }

    public empleadobasemascomision(double salarioBase, double ventasBrutas, double tarifaComision, String nombre, String apellido, int CI) {
        super(ventasBrutas, tarifaComision, nombre, apellido, CI);
        this.salarioBase = salarioBase;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    private double Ingresos(){
        return salarioBase*super.CalcarIngresos();
    }
    
    @Override
    public String toString() {
        return "Empleado por Base\n"+"Nombre: "+getNombre()+"\n"+"Apellido: "+getApellido()+"\n"+"Salario por Comision: "+CalcarIngresos();
    }
}
