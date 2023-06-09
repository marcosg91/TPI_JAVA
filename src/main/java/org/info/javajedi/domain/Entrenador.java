package org.info.javajedi.domain;

import java.time.LocalDate;

public class Entrenador {
    private String nombre;
    private String apellido;
    private int edad;

    public Entrenador(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public Entrenador() {

    }

    public Entrenador(String nombreEntrenador, String apellidoEntrenador, LocalDate parse) {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Entrenador{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                '}';
    }

    public void setEquipo(Equipo equipo) {
        // Implementar la lógica para establecer el equipo del entrenador
    }
}
