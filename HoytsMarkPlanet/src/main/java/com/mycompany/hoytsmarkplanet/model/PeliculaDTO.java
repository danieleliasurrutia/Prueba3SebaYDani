/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hoytsmarkplanet.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author sjeld
 */
public class PeliculaDTO {
    public boolean agregarPelicula(PeliculaDAO peliculaNueva, Connection conexion) throws SQLException{
    
        String queryStatement = "INSERT INTO "+conexion.getSchema()+".PELICULA (ID, TITULO,DIRECTOR,AÑO,DURACION,GENERO) VALUES (?,?,?)";
        
        System.out.println(queryStatement);
        
        PreparedStatement ps = conexion.prepareStatement(queryStatement);
        
        ps.setInt(1, peliculaNueva.getId());
        ps.setString(2, peliculaNueva.getTitulo());
        ps.setString(3, peliculaNueva.getDirector());
        ps.setInt(4, peliculaNueva.getAño());
        ps.setInt(5, peliculaNueva.getDuracion());
        ps.setString(6, peliculaNueva.getGenero());
        
        int cantidad = ps.executeUpdate();
        
        System.out.println("Cantidad de filas insertadas: "+cantidad);
        
        return true;
    }
}
