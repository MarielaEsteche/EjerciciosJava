/*
Clase Juego: esta clase posee los siguientes atributos: 
Jugadores (conjunto de Jugadores) y 
Revolver
Métodos:
• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): 
este método recibe los jugadores
y el revolver para guardarlos en los atributos del juego.
• ronda(): cada ronda consiste en un jugador que se apunta con el
revolver de agua y aprieta el gatillo. Sí el revolver tira el agua
el jugador se moja y se termina el juego, sino se moja, se pasa al
siguiente jugador hasta que uno se moje.
Si o si alguien se tiene que mojar. Al final del juego, se debe 
mostrar que jugador se mojó.
Pensar la lógica necesaria para realizar esto, usando los
atributos de la clase Juego
 */
package RuletaDeAgua;

import java.util.ArrayList;

/**
 *
 * @author TKBio
 */
public class Juego {

    private ArrayList<Jugador> jugadores;
    private RevolverDeAgua revolver;

    public Juego(ArrayList<Jugador> jugadores, RevolverDeAgua revolver) {
        this.jugadores = jugadores;
        this.revolver = revolver;
    }

    public void llenarJuego(ArrayList<Jugador> jugadores, RevolverDeAgua revolver) {
        for (int i = 1; i <= this.jugadores.size(); i++) {
            this.jugadores.set(i - 1, new Jugador(i, "Jugador " + i));
        }

    }

    public boolean ronda() {
        System.out.println("Empezando ronda ... ");
        int i = 0;
        while (true) {
            Jugador jugador = jugadores.get(i);
            System.out.println("Es el turno de " + jugador.getNombre());
            if (jugador.disparo(revolver)) {
                System.out.println("El " + jugador.getNombre() + " Fue mojado");
                return true;
            } else {
                System.out.println(jugador.getNombre() + " se salvó!");
            }
            
            i++;
            if (i == jugadores.size()) {
                i = 0;
            }
        }

    }
}
