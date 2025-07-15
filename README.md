# POO-Java-Proyecto-Garcia

Hola, soy Jeison Garcia y este es mi proyecto de Programación Orientada a Objetos en Java.  
Aquí desarrollé una aplicación sencilla para gestionar tareas usando consola, aplicando principios fundamentales de POO y buenas prácticas de programación.

---


## ¿Qué hace este proyecto?

Este programa permite registrar tareas o actividades con título y descripción, y luego mostrarlas en pantalla.  
Fue diseñado para practicar la organización del código en paquetes (`modelo`, `servicio`, `vista`, `dashboard`), uso de clases, y programación modular.

---


## ¿Cómo está organizado?

- **modelo:** contiene la clase `Actividad` que representa cada tarea.  
- **servicio:** contiene la clase `GestorActividades` que administra la lista de actividades.  
- **vista:** incluye `InterfazConsola` para interactuar con el usuario por consola.  
- **dashboard:** contiene la clase principal `Dashboard` que muestra el menú y coordina todo.

---


## ¿Cómo usarlo?

1. Clona este repositorio con:

```bash
git clone https://github.com/JeisonG2003/POO-Java-Proyecto-Garcia.git
```

2. Entra a la carpeta del proyecto:

```bash
cd POO-Java-Proyecto-Garcia
```

3. Compila y ejecuta con Maven:

```bash
mvn compile exec:java -Dexec.mainClass=com.jeisongarcia.proyecto.dashboard.Dashboard

```


**Autor**

Jeison Teobaldo Garcia Arreaga

Estudiante de la Universidad Estatal Amazónica


