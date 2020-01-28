/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import conexion.conector;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.articulo;

/**
 *
 * @author angelo aulestia
 */
public class controladorArticulo {
    PreparedStatement ps=null;
    conector conexion=new conector();
    public void ingresarArticulos(articulo nuevoArticulo){
        String sqlInsert="insert into articulos  (nombre,descripcion,precio) values(?,?,?)";
        try {
            ps=conexion.getConxion().prepareStatement(sqlInsert);
            ps.setString(1, nuevoArticulo.getNombre());
            ps.setString(2, nuevoArticulo.getDescripcion());
            ps.setFloat(3, nuevoArticulo.getPrecio());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos ingresados correctamente");
        } catch (SQLException ex) {
            System.err.println("error: "+ex);
            //Logger.getLogger(controladorArticulo.class.getName()).log(Level.SEVsERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error al ingresar datos");
        }
        
    }
    public void mostrarDatos(articulo mostrarArticulo){
        String select="select *"+"from articulos"+" where ?";
        try {
            ps=conexion.getConxion().prepareStatement(select);
            ps.setString(1,mostrarArticulo.getNombre() );
            ps.setInt(1."");
            JOptionPane.showMessageDialog(null, "Datos encontrados con Exito");
            
        } catch (SQLException ex) {
            System.err.println("error: "+ex);
            //Logger.getLogger(controladorArticulo.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Datos no encontrados");
        }
        
        
    }
    
}
