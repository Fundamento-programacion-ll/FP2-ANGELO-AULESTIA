/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejecutable;

import javax.swing.JOptionPane;

/**
 *
 * @author angelo aulestia
 */
public class Ejecutable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        solicitudSaldo a=new solicitudSaldo();
        retiros b=new retiros();
        deposito c=new deposito();
        String usuario;
        float total;
        int op;
        int cuenta;
        float saldoInicial;
        usuario=JOptionPane.showInputDialog("Coloque el nombre de usuario");
        cuenta=Integer.parseInt(JOptionPane.showInputDialog("Coloque su numero de cuenta"));
        do{
          saldoInicial=Float.parseFloat(JOptionPane.showInputDialog("Coloque su saldo incial"));
        if(saldoInicial<=0){
            JOptionPane.showMessageDialog(null, "solo pudes poner numeros mayores a cero");
        }  
        }while(saldoInicial<=0);
        a.setDinero(saldoInicial);
        total=saldoInicial;
        do{
            op=Integer.parseInt(JOptionPane.showInputDialog("colocque lo que desea realizar\n"+"1.-consula saldo\n"+"2.-Deposito\n"+"3.-Retiro\n"+"4.-Salir"));
        switch(op){
            case 1:
                JOptionPane.showMessageDialog(null, "señor/a:  "+usuario+" Dueño/a de la cuenta: "+cuenta+"\n"+"su saldo ahora es: "+total);
            break;
            
            case 2:
                float depo;
                do{
                depo=Float.parseFloat(JOptionPane.showInputDialog("Cuanto desea depositar?"));
                        if(depo<=0){
                            JOptionPane.showMessageDialog(null, "solo pudes poner numeros mayores a cero");
                           }
                    
                  }while(depo<=0);
                c.setMontoDeposito(depo);
                total=total+depo;
                JOptionPane.showMessageDialog(null, "señor/a:  "+usuario+" Dueño/a de la cuenta: "+cuenta+"\n"+"su saldo ahora es: "+total);
            break;
            case 3:
                float reti;
                do{
                reti=Float.parseFloat(JOptionPane.showInputDialog("Cuanto desea retirar?"));
                        if(reti<=0){
                            JOptionPane.showMessageDialog(null, "solo pudes poner numeros mayores a cero");
                           }
                    
                  }while(reti<=0);
                b.setMonto(reti);
                total=total-reti;
                JOptionPane.showMessageDialog(null, "señor/a:  "+usuario+" Dueño/a de la cuenta: "+cuenta+"\n"+"su saldo ahora es: "+total);
            break;
            case 4:
                break;
            default: 
                JOptionPane.showMessageDialog(null, "coloque la opciones que se les muestra");
        }
        }while(op!=4);     
    }
        
    
}
