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
public abstract class transaccion {
    private int numCuenta;

    public transaccion(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public transaccion() {
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }
    
    public abstract String ejecutar();
    
    public String obtenerCuenta(){
        return ejecutar();
    }
}
