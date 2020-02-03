/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajoherencias;

/**
 *
 * @author angelo aulestia
 */
public class TrabajoHerencias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        empleadosalario datos=new empleadosalario(-12, "Angelo", "Aulestia", 171);
        System.out.println(datos);
        empleadoporcomision o=new empleadoporcomision(145, 36, "Angelo", "Aulestia", 171);
        System.out.println(o);
        empleadoporhoras a=new empleadoporhoras(180, 145, "Angelo", "Aulestia", 171);
        System.out.println(a);
        empleadobasemascomision b=new empleadobasemascomision(356,180, 145, "Angelo", "Aulestia", 171);
        System.out.println(b);
        
    }
    
}
