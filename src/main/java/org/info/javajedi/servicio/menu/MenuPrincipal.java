package org.info.javajedi.servicio.menu;

import org.info.javajedi.domain.Equipo;
import org.info.javajedi.domain.Jugador;
import org.info.javajedi.domain.Entrenador;
import org.info.javajedi.domain.Posicion;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuPrincipal {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Equipo> equipos = new ArrayList<>();
    private static MenuBuscarEquipos menuBuscarEquipos = new MenuBuscarEquipos();
    private static MenuBuscarJugadores menuBuscarJugadores = new MenuBuscarJugadores();

    public static void main(String[] args) {
        boolean cargarEquipos = true;

        do {
            System.out.println("Bienvenido al Menú Principal");
            System.out.println("Seleccione una opción:");
            System.out.println("1. Crear equipo");
            System.out.println("2. Buscar equipo");
            System.out.println("3. Buscar jugadores");
            System.out.println("4. Salir");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    crearEquipo();
                    break;
                case 2:
                    menuBuscarEquipos.buscarEquipoPorNombre(equipos, scanner);
                    break;
                case 3:
                    menuBuscarJugadores.buscarJugadorPorNombre(equipos, scanner);
                    break;
                case 4:
                    cargarEquipos = false;
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                    break;
            }
        } while (cargarEquipos);

        System.out.println("¡Gracias por usar la aplicación!");
    }

    public static void crearEquipo() {
        System.out.println("Creación de equipo");
        System.out.println("Ingrese el nombre del equipo:");
        String nombreEquipo = scanner.nextLine();

        System.out.println("Ingrese la fecha de creación del equipo (en formato yyyy-mm-dd):");
        String fechaCreacion = scanner.nextLine();

        // Crear instancia de Equipo con el nombre y fecha de creación proporcionados
        Equipo equipo = new Equipo(nombreEquipo, LocalDate.parse(fechaCreacion));

        // Crear jugadores y entrenador
        crearJugadores(equipo);
        crearEntrenador(equipo);

        // Agregar el equipo creado a la lista de equipos
        equipos.add(equipo);

        System.out.println("Equipo creado exitosamente.");
        System.out.println();
    }

    public static void crearJugadores(Equipo equipo) {
        boolean cargarJugadores = true;

        do {
            System.out.println("Creación de jugador");
            System.out.println("Ingrese el nombre del jugador:");
            String nombreJugador = scanner.nextLine();

            System.out.println("Ingrese el apellido del jugador:");
            String apellidoJugador = scanner.nextLine();

            System.out.println("Ingrese la altura del jugador:");
            double alturaJugador = scanner.nextDouble();
            scanner.nextLine();

            System.out.println("Ingrese la posición del jugador:");
            String posicionJugador = scanner.nextLine();

            System.out.println("Ingrese el número de goles del jugador:");
            int golesJugador = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Ingrese el número de partidos jugados del jugador:");
            int partidosJugadosJugador = scanner.nextInt();
            scanner.nextLine();

            // Crear instancia de Jugador con los datos proporcionados
            Jugador jugador = new Jugador(nombreJugador, apellidoJugador, alturaJugador, Posicion.valueOf(posicionJugador), golesJugador, partidosJugadosJugador);

            // Agregar el jugador al equipo
            equipo.agregarJugador(jugador);

            System.out.println("¿Desea cargar otro jugador? (S/N)");
            String opcion = scanner.nextLine();

            if (opcion.equalsIgnoreCase("N")) {
                cargarJugadores = false;
            }
        } while (cargarJugadores);
    }

    public static void crearEntrenador(Equipo equipo) {
        System.out.println("Creación de entrenador");
        System.out.println("Ingrese el nombre del entrenador:");
        String nombreEntrenador = scanner.nextLine();

        System.out.println("Ingrese el apellido del entrenador:");
        String apellidoEntrenador = scanner.nextLine();

        System.out.println("Ingrese la fecha de nacimiento del entrenador (en formato yyyy-mm-dd):");
        String fechaNacimientoEntrenador = scanner.nextLine();

        // Crear instancia de Entrenador con los datos proporcionados
        Entrenador entrenador = new Entrenador(nombreEntrenador, apellidoEntrenador, LocalDate.parse(fechaNacimientoEntrenador));

        // Asignar el entrenador al equipo
        equipo.setEntrenador(entrenador);
    }
}
