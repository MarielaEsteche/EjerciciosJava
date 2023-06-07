package JuegoDeCartas;

/**
 *
 * @author TKBio
 */
enum Palo {
    ESPADAS, BASTOS, OROS, COPAS
}

public class Carta {

    private int numero;
    private Palo palo;

    public Carta(int numero, Palo palo) {
        this.numero = numero;
        this.palo = palo;
    }

    @Override
    public String toString() {
        return numero + " de " + palo;
    }
}
