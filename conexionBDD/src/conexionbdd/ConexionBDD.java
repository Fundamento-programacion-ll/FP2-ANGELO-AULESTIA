/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexionbdd;

import conexion.conector;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author angelo aulestia
 */
public class ConexionBDD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PreparedStatement ps=null;
        ResultSet rs=null;
        conector stringConexion=new conector();
        stringConexion.getConxion();
        
        //insert
        String insert="insert into "+"articulos(nombre,descripcion,precio) "+"calies(?,?,?) ";
        String select="select *"+"from articulos"+" where Articulo=?";
        try {
            ps=stringConexion.getConxion().prepareStatement(select);
            rs=ps.executeQuery();
            while(rs.next()){
                //es para mostrar los datos
                //la 1 siempre tendra el id
                System.out.println(rs.getString(2));
                System.out.println(rs.getString(3));
                System.out.println(rs.getString(4));
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConexionBDD.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
