/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jeisongarcia.proyecto.modelo;

/**
 *
 * @author Jeison Teobaldo Garcia Arreaga
 */
public class Actividad {
    
    private String titulo;
    private String descripcion;

    public Actividad(String titulo, String descripcion) {
        this.titulo = titulo;
        this.descripcion = descripcion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public String toString() {
        return titulo + " - " + descripcion;
    }
}