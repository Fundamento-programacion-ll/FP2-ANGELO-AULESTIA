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
public class empleadoporcomision extends empleado {
    private double ventasBrutas;
    private double tarifaComision;

    public empleadoporcomision() {
    }

    public empleadoporcomision(double ventasBrutas, double tarifaComision) {
        this.ventasBrutas = ventasBrutas;
        this.tarifaComision = tarifaComision;
    }

    public empleadoporcomision(double ventasBrutas, double tarifaComision, String nombre, String apellido, int CI) {
        super(nombre, apellido, CI);
        this.ventasBrutas = ventasBrutas;
        this.tarifaComision = tarifaComision;
    }    
    

    public double getVentasBrutas() {
        return ventasBrutas;
    }

    public void setVentasBrutas(double ventasBrutas) {
        this.ventasBrutas = ventasBrutas;
    }

    public double getTarifaComision() {
        return tarifaComision;
    }

    public void setTarifaComision(double tarifaComision) {
        if(tarifaComision>=0 && tarifaComision<=1 ){
            this.tarifaComision = tarifaComision;
        }else{
             this.tarifaComision =0;
        }
    }

    @Override
    public String toString() {
        return "Empleado por Comision\n"+"Nombre: "+getNombre()+"\n"+"Apellido: "+getApellido()+"\n"+"Salario por Comision: "+CalcarIngresos();
    }
    

    @Override
    public Double CalcarIngresos() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        double resultadoComision=(ventasBrutas*tarifaComision);
        return resultadoComision;
    }
    
    
}
