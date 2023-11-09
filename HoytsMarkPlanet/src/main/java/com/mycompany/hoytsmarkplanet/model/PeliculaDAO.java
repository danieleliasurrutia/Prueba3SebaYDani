/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hoytsmarkplanet.model;

/**
 *
 * @author sjeld
 */
public class PeliculaDAO {
    private int Id;
    private String Titulo;
    private String Director;
    private int Año;
    private int Duracion;
    private String Genero;

    public PeliculaDAO() {
    }

    public PeliculaDAO(int Id, String Titulo, String Director, int Año, int Duracion, String Genero) {
        this.Id = Id;
        this.Titulo = Titulo;
        this.Director = Director;
        this.Año = Año;
        this.Duracion = Duracion;
        this.Genero = Genero;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getDirector() {
        return Director;
    }

    public void setDirector(String Director) {
        this.Director = Director;
    }

    public int getAño() {
        return Año;
    }

    public void setAño(int Año) {
        this.Año = Año;
    }

    public int getDuracion() {
        return Duracion;
    }

    public void setDuracion(int Duracion) {
        this.Duracion = Duracion;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    @Override
    public String toString() {
        return "PeliculaDAO{" + "Id=" + Id + ", Titulo=" + Titulo + ", Director=" + Director + ", A\u00f1o=" + Año + ", Duracion=" + Duracion + ", Genero=" + Genero + '}';
    }
    
    
}
