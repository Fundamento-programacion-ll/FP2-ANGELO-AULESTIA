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
public class deposito extends transaccion{
    private double montoDeposito;
    

    public deposito(double montoDeposito, int numCuenta) {
        super(numCuenta);
        this.montoDeposito = montoDeposito;
    }

    public deposito(double montoDeposito) {
        this.montoDeposito = montoDeposito;
    }
    
    

    public double getMontoDeposito() {
        return montoDeposito;
    }

    public void setMontoDeposito(double montoDeposito) {
        this.montoDeposito = montoDeposito;
    }

    @Override
    public String ejecutar() {
        return "Cuenta: "+getNumCuenta()+"\n A depositado: "+montoDeposito;
    }

    @Override
    public String toString() {
        return "señor su cuenta es: "+getNumCuenta()+" su deposito es el total: "+getMontoDeposito();
    }
    
    
}
