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
public class retiros extends transaccion{
    private double monto;

    public retiros() {
    }

    public retiros(double monto, int numCuenta) {
        super(numCuenta);
        this.monto = monto;
    }

    public retiros(double monto) {
        this.monto = monto;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
    

    @Override
    public String ejecutar() {
        return "Cuenta: "+getNumCuenta()+"\n a retirado: "+monto;
    }

    @Override
    public String toString() {
        return "Señor de la cuenta: "+getNumCuenta()+" el retiro de su cuenta es: "+getMonto();
    }
    
    
}
