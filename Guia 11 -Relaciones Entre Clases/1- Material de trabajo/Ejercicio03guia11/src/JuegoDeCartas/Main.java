package JuegoDeCartas;

import java.util.List;

/**
 *
 * @author TKBio
 */
public class Main {

    public static void main(String[] args) {
        Baraja baraja = new Baraja();
        baraja.barajar();

        System.out.println("   ** Cartas disponibles " + baraja.cartasDisponibles() + " **    \n");

        Carta carta1 = baraja.siguienteCarta();
        Carta carta2 = baraja.siguienteCarta();

        System.out.println("Siguiente carta " + carta1);
        System.out.println("Siguiente carta " + carta2);

        List<Carta> cartasPerdidas = baraja.darCartas(10);
        if (cartasPerdidas != null) {
            System.out.println("\n[[[ Cartas perdidas ]]]\n");
            cartasPerdidas.forEach((carta) -> {
                System.out.println(carta);
            });
        }

        baraja.cartasMonton();
        baraja.mostrarBaraja();
        System.out.println();
    }
}
