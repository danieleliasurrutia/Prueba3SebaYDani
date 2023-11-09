/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hoytsmarkplanet;

import com.mycompany.hoytsmarkplanet.view.AgregarPelicula;
import java.sql.SQLException;

/**
 *
 * @author sjeld
 */
public class HoytsMarkPlanet {

    public static void main(String[] args) throws SQLException{
        
        AgregarPelicula pantallaPelicula = new AgregarPelicula();
        pantallaPelicula.setVisible(true);
    }
}
