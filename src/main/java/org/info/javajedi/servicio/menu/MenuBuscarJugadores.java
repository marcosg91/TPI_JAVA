package org.info.javajedi.servicio.menu;

import org.info.javajedi.domain.Equipo;
import org.info.javajedi.domain.Jugador;

import java.util.List;
import java.util.Scanner;

public class MenuBuscarJugadores {
    public void buscarJugadorPorNombre(List<Equipo> equipos, Scanner scanner) {
        System.out.println("Búsqueda de jugador por nombre");
        System.out.println("Ingrese el nombre del jugador a buscar:");
        String nombreJugador = scanner.nextLine();

        boolean encontrado = false;

        for (Equipo equipo : equipos) {
            List<Jugador> jugadores = equipo.getJugadores();
            for (Jugador jugador : jugadores) {
                if (jugador.getNombre().equalsIgnoreCase(nombreJugador)) {
                    System.out.println("Jugador encontrado:");
                    mostrarInformacionJugador(jugador, equipo.getNombre());
                    encontrado = true;
                    break;
                }
            }
        }

        if (!encontrado) {
            System.out.println("Jugador no encontrado.");
        }

        System.out.println();
    }

    private void mostrarInformacionJugador(Jugador jugador, String nombreEquipo) {
        System.out.println("Nombre: " + jugador.getNombre());
        System.out.println("Apellido: " + jugador.getApellido());
        System.out.println("Posición: " + jugador.getPosicion());
        System.out.println("Capitán: " + (jugador.esCapitan() ? "Sí" : "No"));
        System.out.println("Equipo: " + nombreEquipo);
    }
}
