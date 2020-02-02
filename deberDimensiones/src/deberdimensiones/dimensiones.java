/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deberdimensiones;

/**
 *
 * @author angelo aulestia
 */
public class dimensiones {
    private int lados=5;
    private int base=10;
    private int altura=15;

    public dimensiones(int lados, int base, int altura) {
        this.lados = lados;
        this.base = base;
        this.altura = altura;
    }

    public dimensiones() {
    }

    public int getLados() {
        return lados;
    }

    public void setLados(int lados) {
        this.lados = lados;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
}
