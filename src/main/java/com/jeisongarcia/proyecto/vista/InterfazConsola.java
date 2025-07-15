package com.jeisongarcia.proyecto.vista;

import java.util.Scanner;

/**
 * Clase que gestiona la interacción con el usuario mediante consola.
 */
public class InterfazConsola {
    private Scanner scanner;

    public InterfazConsola() {
        scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        System.out.println("\n===== MENÚ PRINCIPAL =====");
        System.out.println("1. Agregar nueva actividad");
        System.out.println("2. Ver actividades registradas");
        System.out.println("0. Salir del sistema");
        System.out.print("Seleccione una opción: ");
    }

    public int leerOpcion() {
        return scanner.nextInt();
    }

    public String leerTexto(String mensaje) {
        scanner.nextLine(); // limpiar buffer
        System.out.print(mensaje);
        return scanner.nextLine();
    }
}
