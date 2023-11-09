/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hoytsmarkplanet.controller;

import com.mycompany.hoytsmarkplanet.model.PeliculaDAO;
import com.mycompany.hoytsmarkplanet.model.PeliculaDTO;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author sjeld
 */
public class PeliculaController {

    public boolean agregarPeliculaController(PeliculaDAO peliculaNueva, Connection conexion) throws SQLException {

        PeliculaDTO pelicula = new PeliculaDTO();

        pelicula.agregarPelicula(peliculaNueva, conexion);

        return true;
    }
}
