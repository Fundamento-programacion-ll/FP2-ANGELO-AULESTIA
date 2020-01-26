/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparacion;

/**
 *
 * @author angelo aulestia
 */
public class fecha {
    empleado nums=new empleado();
    private int dia;
    private int mes;
    private int anio;

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public fecha(int dia, int mes, int anio) {
        super();
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public fecha() {
        super();
    }
    
    public String comprobacion() {
        int nummenor=0;
        String n[] = null;
        for (int i = 1; i <= 5; i++) {
           dia=nums.getFecha_inicio().length();
           mes=nums.getFecha_inicio().length();
           anio=nums.getFecha_inicio().length();
           int completo=anio+mes+dia;
           if(nummenor>completo){
               nummenor=completo;
               
           }
            System.out.println(n[i]);
           
        }
        return "";
    }
    
    
    
    
}
