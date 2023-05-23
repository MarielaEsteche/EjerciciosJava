package JuegoDeCartas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author TKBio
 */
public class Baraja {

    private List<Carta> cartas;
    private List<Carta> monton;

    public Baraja() {
        cartas = new ArrayList<>();
        monton = new ArrayList<>();

        for (Palo palo : Palo.values()) {
            for (int numero = 1; numero <= 12; numero++) {
                if (numero != 8 && numero != 9) {
                    cartas.add(new Carta(numero, palo));
                }
            }
        }
    }

    public void barajar() {
        Collections.shuffle(cartas);
    }

    public Carta siguienteCarta() {
        if (cartas.isEmpty()) {
            System.out.println("No hay mas cartas");
            return null;
        }

        Carta carta = cartas.remove(0);
        monton.add(carta);
        return carta;
    }

    public int cartasDisponibles() {
        return cartas.size();
    }

    public List<Carta> darCartas(int cantidad) {
        if (cantidad > cartas.size()) {
            System.out.println("Las cartas no son suficientes");
            return null;
        }

        List<Carta> cartasPerdidas = new ArrayList<>();
        for (int i = 0; i < cantidad; i++) {
            Carta carta = siguienteCarta();
            if (carta != null) {
                cartasPerdidas.add(carta);
            }
        }
        return cartasPerdidas;
    }

    public void cartasMonton() {
        if (monton.isEmpty()) {
            System.out.println("No se repartio ninguna carta");
            return;
        }
        System.out.println("\n[[[ Cartas en el mazo ]]]\n");
        monton.forEach((carta) -> {
            System.out.println(carta);
        });
    }

    public void mostrarBaraja() {
        if (cartas.isEmpty()) {
            System.out.println("No quedan mas cartas en el mazo");
        }
    }
}
