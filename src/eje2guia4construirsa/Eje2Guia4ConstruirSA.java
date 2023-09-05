/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje2guia4construirsa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Eje2Guia4ConstruirSA {

    public static void main(String[] args) {
        try {
            // TODO code application logic here
            Class.forName("org.mariadb.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mariadb://localhost/Eje2ConstruirSA","root","");
            
 //           String sql="insert into empleado(dni,apellido,nombre,acceso,estado)"
 //                   + "values(25789789,'Viñas','Alberto',2,true);";
 //           String sql="insert into empleado(dni,apellido,nombre,acceso,estado)"
 //                   + "values(26963963,'Montes','Marina',1,true);";
//            String sql="insert into empleado(dni,apellido,nombre,acceso,estado)"
//                    + "values(23741741,'Beltran','Jeronimo',3,true);";
//            PreparedStatement ps=conn.prepareStatement(sql);
//            int filas=ps.executeUpdate();
//            if(filas>0){
//            JOptionPane.showMessageDialog(null,"Empleado/a ingresado/a Exitosamente");
//            }
            
//            String sql="insert into herramienta(nombre,descripcion,stock,estado)"
//                    + "values('taladro','electrico',3,true);";
//            String sql="insert into herramienta(nombre,descripcion,stock,estado)"
//                    + "values('martillo','2k',5,true);";
//            PreparedStatement ps=conn.prepareStatement(sql);
//            int filas=ps.executeUpdate();
//            if(filas>0){
//            JOptionPane.showMessageDialog(null,"Herramienta ingresada Exitosamente");
//            }

//            String sql="select * from herramienta where stock>=10";
//            PreparedStatement ps=conn.prepareStatement(sql);
//            ResultSet resultado=ps.executeQuery();
//            while(resultado.next()){
//                System.out.println("Id "+resultado.getInt("id_herramienta"));
//                System.out.println("Nombre "+resultado.getString("nombre"));
//                System.out.println("Descripcion "+resultado.getString("descripcion"));
//                System.out.println("Stock "+resultado.getInt("stock"));
//                System.out.println("Estado "+resultado.getBoolean("estado"));
//            }
            
            String sql="update empleado set estado=false  where id_empleado=1";
            PreparedStatement ps=conn.prepareStatement(sql);
            int filas=ps.executeUpdate();
            if(filas>0){
            JOptionPane.showMessageDialog(null,"Empleado/a dado de baja Exitosamente");
            }        
            //comentario
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Debe agregarlos drivers al proyecto!!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error de conexion!");
        }
    }
    
}
