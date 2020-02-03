/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tokens;

import java.util.Arrays;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 *
 * @author angelo aulestia
 */
public class vector {
    
    private int vector[];

    public int[] getVector() {
        return vector;
    }

    public void setVector() {
        //this.vector = vector;
        String datosVector;
        datosVector=JOptionPane.showInputDialog(null,"Ingrese los valores separados por coma");
        //se untiliza para dividir los datos 
        StringTokenizer tokkens=new StringTokenizer(datosVector, ","); //datos, separador
        
        for (int i = 0; i < this.vector.length&&tokkens.hasMoreTokens(); i++) {
            
            this.vector[i]=Integer.parseInt(tokkens.nextToken());
        }
    }
    
    //se puede tener infinidad de costructores 
    public vector(int[] vector) {
        //se pone esta clase siempre que tenemos mas de un constructor
        super(); //clase para saber que el constructor esta super cargado
        this.vector = vector;
    }
    
    public vector(int dimension) {
        super();
        this.vector=new int[dimension];
        this.setVector();
    }
    
    public vector() {
    }
    @Override
    public String toString() {
        return "vector: "+Arrays.toString(vector);
    }
    
    public boolean esPrimo(){
        int contador=2;
        boolean primo=true;
        for (int i = 0; i < this.vector.length; i++) {
            if(vector[i]!=contador&&vector[i]%contador==0){
                contador++;
            }else{
                System.err.println(vector[i]);
            }
        }
        return primo;
    }
    
}
