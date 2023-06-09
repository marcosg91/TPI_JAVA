package org.info.javajedi.servicio.menu;

import org.info.javajedi.domain.Equipo;

import java.util.List;
import java.util.Scanner;

public class MenuBuscarEquipos {
    public void buscarEquipoPorNombre(List<Equipo> equipos, Scanner scanner) {
        System.out.println("Búsqueda de equipo por nombre, entrenador y capitán");
        System.out.println("-----------------------------------------------");

        System.out.println("Ingrese el nombre del equipo:");
        String nombreEquipo = scanner.nextLine();

        System.out.println("Ingrese el nombre del entrenador:");
        String nombreEntrenador = scanner.nextLine();

        System.out.println("Ingrese el nombre del capitán:");
        String nombreCapitan = scanner.nextLine();

        boolean encontrado = false;

        for (Equipo equipo : equipos) {
            if (equipo.getNombre().equalsIgnoreCase(nombreEquipo)
                    && equipo.getEntrenador().getNombre().equalsIgnoreCase(nombreEntrenador)
                    && equipo.getCapitan().getNombre().equalsIgnoreCase(nombreCapitan)) {
                System.out.println("Equipo encontrado:");
                System.out.println(equipo);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontró ningún equipo con los criterios de búsqueda especificados.");
        }

        System.out.println();
    }
}
