package jugador;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author TKBio
 */
public class Equipo {

    private List<Jugador> jugadores;

    public Equipo() {
        jugadores = new ArrayList<>();
    }

    public void nuevoJugador(Jugador jugador) {
        jugadores.add(jugador);
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

}
