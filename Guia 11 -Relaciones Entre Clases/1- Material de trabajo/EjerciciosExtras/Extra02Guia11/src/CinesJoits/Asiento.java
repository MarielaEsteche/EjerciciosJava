/*
La clase Asiento va a tener toda la info de los Asientos valga la redundancia
 */
package CinesJoits;

/**
 *
 * @author TKBio
 */
public class Asiento {

    private int fila;
    private int columna;
    private Espectador espectador;

    public Asiento(int fila, int columna) {
        this.fila = fila;
        this.columna = columna;
        this.espectador = null;

    }

    public int getFila() {
        return fila + 1;
    }

    public char getColumna() {
        //return columna;
          return (char) ('A' + columna);
    }

    public boolean estaOcupado() {
        return espectador != null;
    }

    public void setEspectador(Espectador espectador) {
        this.espectador = espectador;
    }

}
