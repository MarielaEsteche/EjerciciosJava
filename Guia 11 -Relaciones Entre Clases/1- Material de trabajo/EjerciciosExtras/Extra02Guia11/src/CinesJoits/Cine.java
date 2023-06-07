/*
La clase Cine va a tener toda la info del cine y será la
que gestione la sala y los espectadores
 */
package CinesJoits;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author TKBio
 */
public class Cine {

    private Pelicula pelicula;
    private Asiento[][] sala;
    private double precioDeEntrada;

    public Cine(Pelicula pelicula, double precioDeEntrada) {
        this.pelicula = pelicula;
        this.precioDeEntrada = precioDeEntrada;
        this.sala = new Asiento[8][6];

        //creamos la sala con los asientos vacios
        for (char fila = 0; fila < 8; fila++) {
            for (int columna = 0; columna < 6; columna++) {
                sala[fila][columna] = new Asiento(fila, columna);
            }
        }

    }

    public void simularEspectadores(int cantidadEspectadores) {
        Random random = new Random();

        for (int i = 0; i < cantidadEspectadores; i++) {
            String nombre = "Espectador " + (i + 1);
            //ponemos un rango de edad
            int edad = random.nextInt(100) + 1;
            //Tambien uno de dinero 
            double dinero = random.nextDouble() * 5000;

            Espectador espectador = new Espectador(nombre, edad, dinero);

            if (puedeVerla(espectador)) {
                Asiento asiento = buscarAsientoLibre();
                if (asiento != null) {
                    asiento.setEspectador(espectador);
                }
            }
        }
    }

    private boolean puedeVerla(Espectador espectador) {
        return espectador.getEdad() >= pelicula.getEdadMinima() && espectador.getDinero() >= precioDeEntrada;
    }

    private Asiento buscarAsientoLibre() {
        Random random = new Random();
        List<Asiento> asientosLibres = new ArrayList<>();

        for (int fila = 0; fila < 8; fila++) {
            for (int columna = 0; columna < 6; columna++) {
                Asiento asiento = sala[fila][columna];
                if (!asiento.estaOcupado()) {
                    asientosLibres.add(asiento);
                }
            }
        }

        if (!asientosLibres.isEmpty()) {
            int index = random.nextInt(asientosLibres.size());
            return asientosLibres.get(index);
        }

        return null;

    }

    public void mostrarTablaDeAsientos() {
        System.out.println("             ** Cine Joits **   ");
        System.out.println();

        for (int fila = 7; fila >= 0; fila--) {
            for (int columna = 0; columna < 6; columna++) {
                Asiento asiento = sala[fila][columna];
                if (asiento.estaOcupado()) {
                    int numeroFila = asiento.getFila();
                    char letraColumna = asiento.getColumna();
                    System.out.print(numeroFila + " " + letraColumna + " X |");
                    //char letraFila = (char) (fila + 'A');
                    //System.out.print(asiento.getFila() + " " + letraFila + " X |");
                } else {
                    int numeroFila = asiento.getFila();
                    char letraColumna = asiento.getColumna();
                    System.out.print(numeroFila + " " + letraColumna + "   |");

                    //char letraFila = (char) (fila + 'A');
                    //System.out.print(asiento.getFila() + " " + letraFila + "   |");
                }

            }
            System.out.println();
        }
        System.out.println();
    }
}
