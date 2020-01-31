/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias;

/**
 *
 * @author angelo aulestia
 */
public class perro extends animal {
    //protect sirve solo para las herencias
    private float estatura;

    public float getEstatura() {
        return estatura;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }

    public perro(float estatura, String especie, String genero, String nombre, int edad) {
        super(especie, genero, nombre, edad);
        this.estatura = estatura;
    }

    public perro(float estatura) {
        this.estatura = estatura;
    }
    
    public void datosPerro(){
        System.out.println(suma(10, 5));
        System.out.println("Nombre: "+getNombre()+" Edad: "+getEdad()+" Estatura: "+getEstatura());
    }
    
    
}
