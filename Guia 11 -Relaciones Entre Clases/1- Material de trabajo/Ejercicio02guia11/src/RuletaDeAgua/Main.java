package RuletaDeAgua;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author TKBio
 */
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Pido la cantidad de jugadores
        int cantidadJugadores = 0;
        while (cantidadJugadores < 1 || cantidadJugadores > 6) {
            System.out.println("Ingrese la cantidad de jugadores (entre 1 y 6): ");
            cantidadJugadores = scan.nextInt();
            scan.nextLine();

            if (cantidadJugadores < 1 || cantidadJugadores > 6) {
                System.out.println("Ingrese una opción válida.");
            }
        }

        // Crear jugadores
        ArrayList<Jugador> jugadores = new ArrayList<>();
        for (int i = 1; i <= cantidadJugadores; i++) {
            Jugador jugador = new Jugador(i, "Jugador " + i);
            jugadores.add(jugador);
        }

        // Crear y llenar el revolver
        RevolverDeAgua revolver = new RevolverDeAgua();
        revolver.llenarRevolver();

        // Creamos el juego
        Juego juego = new Juego(jugadores, revolver);

        // Comenzar ronda
        boolean alguienSeMojo;
        int rondaActual = 1;
        do {
            System.out.println("Ronda " + rondaActual + ":");
            alguienSeMojo = juego.ronda();
            rondaActual++;
        } while (!alguienSeMojo);

        System.out.println("---------- GAME OVER xD ----------");
        jugadores.stream().filter((jugador) -> (jugador.estaMojado())).forEachOrdered((jugador) -> {
            System.out.println("El " + jugador.getNombre() + " ha perdido!");
        });
    }
}
