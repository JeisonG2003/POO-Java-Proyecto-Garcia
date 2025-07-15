package com.jeisongarcia.proyecto.dashboard;

import com.jeisongarcia.proyecto.servicios.GestorActividades;
import com.jeisongarcia.proyecto.vista.InterfazConsola;

public class Dashboard {

    public static void main(String[] args) {
        System.out.println(" Bienvenido al sistema de gestión de actividades - POO Java ");

        GestorActividades gestor = new GestorActividades();
        InterfazConsola vista = new InterfazConsola();

        int opcion;

        do {
            vista.mostrarMenu();
            opcion = vista.leerOpcion();

            switch (opcion) {
                case 1:
                    String titulo = vista.leerTexto("Ingrese el título de la actividad: ");
                    String descripcion = vista.leerTexto("Ingrese la descripción: ");
                    gestor.agregarActividad(titulo, descripcion);
                    System.out.println(" Actividad agregada correctamente.");
                    break;
                case 2:
                    gestor.mostrarActividades();
                    break;
                case 0:
                    System.out.println(" Cerrando el programa... ¡Hasta la próxima!");
                    break;
                default:
                    System.out.println(" Opción no válida. Intente de nuevo.");
            }

        } while (opcion != 0);
    }
}
