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
public class Ejecutable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        solicitudSaldo a=new solicitudSaldo(356, 1719608604);
        System.out.println(a);
        retiros b=new retiros(55.69, 1719608604);
        System.out.println(b);
         deposito c=new  deposito(15.25, 1719608604);
         System.out.println(c);
    }
    
}
