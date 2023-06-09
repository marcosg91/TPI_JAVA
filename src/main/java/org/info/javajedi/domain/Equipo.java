package org.info.javajedi.domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Equipo {
    private UUID id;
    private String nombre;
    private LocalDate fechaCreacion;
    private List<Jugador> listJugadores;
    private Entrenador entrenador;
    private Jugador capitan;

    public Equipo(String nombre, LocalDate fechaCreacion) {
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
        this.listJugadores = new ArrayList<>();
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public List<Jugador> getListJugadores() {
        return listJugadores;
    }

    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }

    public Entrenador getEntrenador() {
        return entrenador;
    }

    public void setCapitan(Jugador capitan) {
        this.capitan = capitan;
    }

    public Jugador getCapitan() {
        return capitan;
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", fechaCreacion=" + fechaCreacion +
                '}';
    }

    public void agregarJugador(Jugador jugador) {
    }

    public List<Jugador> getJugadores() {
        return null;
    }
}
