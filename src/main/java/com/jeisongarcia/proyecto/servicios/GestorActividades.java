package com.jeisongarcia.proyecto.servicios;

import com.jeisongarcia.proyecto.modelo.Actividad;
import java.util.ArrayList;
import java.util.List;

public class GestorActividades {
    private List<Actividad> actividades;

    public GestorActividades() {
        actividades = new ArrayList<>();
    }

    public void agregarActividad(String titulo, String descripcion) {
        actividades.add(new Actividad(titulo, descripcion));
    }

    public void mostrarActividades() {
        if (actividades.isEmpty()) {
            System.out.println("No hay actividades registradas.");
        } else {
            System.out.println("\nLista de actividades:");
            for (int i = 0; i < actividades.size(); i++) {
                System.out.println((i + 1) + ". " + actividades.get(i));
            }
        }
    }
}

