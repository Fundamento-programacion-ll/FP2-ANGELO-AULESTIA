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
public class empleadoporhoras extends empleado{
    private double sueldo;
    private double horas;

    public empleadoporhoras() {
    }
    public empleadoporhoras(double sueldo, double horas) {
        this.sueldo = sueldo;
        this.horas = horas;
    }

    public empleadoporhoras(double sueldo, double horas, String nombre, String apellido, int CI) {
        super(nombre, apellido, CI);
        this.sueldo = sueldo;
        this.horas = horas;
    }
    
    

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        if(horas>=0 && horas<=168){
            this.horas=horas;
          }else{
            this.horas=0;
        }
    }
    @Override
    public String toString() {
        return "Empleado por Horas\n"+"Nombre: "+getNombre()+"\n"+"Apellido: "+getApellido()+"\n"+"Salario por Comision: "+CalcarIngresos();
    }

    @Override
    public Double CalcarIngresos() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        double resultadoHoras=sueldo*horas;
        return resultadoHoras;
    }
    
    
}
