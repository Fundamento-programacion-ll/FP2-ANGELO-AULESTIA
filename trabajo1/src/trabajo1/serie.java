/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajo1;

/**
 *
 * @author angelo aulestia
 */
public class serie {
    int n;

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public serie() {
    }
    
    public int resul(){
        int base=2;
        int resultado=1;
        for(int i=1;i<=n;i++){
            resultado=resultado*base;
        }
        return resultado;
    }
}