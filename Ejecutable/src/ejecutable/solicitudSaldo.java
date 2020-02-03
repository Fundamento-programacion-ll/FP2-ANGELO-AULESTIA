/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejecutable;

/**
 *
 * @author angelo aulestia
 */
public class solicitudSaldo extends transaccion {
    private double dinero;

    public solicitudSaldo() {
    }
    

    public solicitudSaldo(double dinero, int numCuenta) {
        super(numCuenta);
        this.dinero = dinero;
    }

    public solicitudSaldo(double dinero) {
        this.dinero = dinero;
    }
    
    
    

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }
    

    
    
    
    @Override
    public String ejecutar() {
        return "Cuenta: "+getNumCuenta()+"\n su saldo es : "+dinero;
    }

    @Override
    public String toString() {
        return ejecutar();
    }
    
}
