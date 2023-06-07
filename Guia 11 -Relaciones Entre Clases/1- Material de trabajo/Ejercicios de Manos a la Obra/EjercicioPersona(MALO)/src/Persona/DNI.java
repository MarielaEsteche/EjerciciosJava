package Persona;

/**
 *
 * @author TKBio
 */
public class DNI {

    private char serie;
    private int numero;

    public DNI(char serie, int numero) {
        this.serie = serie;
        this.numero = numero;
    }

    public char getSerie() {
        return serie;
    }

    public int getNumero() {
        return numero;
    }

}
