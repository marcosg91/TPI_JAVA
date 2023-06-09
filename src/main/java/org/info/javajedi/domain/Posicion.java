package org.info.javajedi.domain;

public class Posicion {
    private final String nombre;

    public Posicion(String nombre) {
        this.nombre = nombre;
    }

    public static Object valueOf(String posicionJugador) {
        return null;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Posicion{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
