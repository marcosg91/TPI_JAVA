package org.info.javajedi.domain;

import java.util.UUID;

public class Jugador {
    private UUID id;
    private String nombre;
    private String apellido;
    private double altura;
    private Posicion posicion;
    private int goles;
    private int partidos;
    private boolean esCapitan;
    private int numCamiseta;
    private Equipo equipoPerteneciente;

    public Jugador(String nombre, String apellido, double altura, Posicion posicion, int goles, int partidos, boolean esCapitan, int numCamiseta, Equipo equipoPerteneciente) {
        this.id = UUID.randomUUID();
        this.nombre = nombre;
        this.apellido = apellido;
        this.altura = altura;
        this.posicion = posicion;
        this.goles = goles;
        this.partidos = partidos;
        this.esCapitan = esCapitan;
        this.numCamiseta = numCamiseta;
        this.equipoPerteneciente = equipoPerteneciente;
    }

    public Jugador() {}

    public Jugador(String nombreJugador, String apellidoJugador, double alturaJugador, Object o, int golesJugador, int partidosJugadosJugador) {
    }

    public UUID getId() {
        return id;
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

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

    public int getPartidos() {
        return partidos;
    }

    public void setPartidos(int partidos) {
        this.partidos = partidos;
    }

    public boolean isEsCapitan() {
        return esCapitan;
    }

    public void setEsCapitan(boolean esCapitan) {
        this.esCapitan = esCapitan;
    }

    public int getNumCamiseta() {
        return numCamiseta;
    }

    public void setNumCamiseta(int numCamiseta) {
        this.numCamiseta = numCamiseta;
    }

    public Equipo getEquipo() {
        return equipoPerteneciente;
    }

    public void setEquipo(Equipo equipo) {
        this.equipoPerteneciente = equipo;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "id=" + id.toString() +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", altura=" + altura +
                ", posicion=" + posicion +
                ", goles=" + goles +
                ", partidos=" + partidos +
                ", esCapitan=" + esCapitan +
                ", numCamiseta=" + numCamiseta +
                ", equipo=" + equipoPerteneciente +
                '}';
    }

    public boolean esCapitan() {
        return false;
    }
}
