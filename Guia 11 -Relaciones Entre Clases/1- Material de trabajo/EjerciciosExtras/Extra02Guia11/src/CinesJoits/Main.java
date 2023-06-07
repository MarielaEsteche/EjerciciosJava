/*
Aqui viene la magia señoooreees!! :P
 */
package CinesJoits;

/**
 *
 * @author TKBio
 */
public class Main {

    public static void main(String[] args) {
        Pelicula pelicula = new Pelicula("Unfriended 2", 88, 16, "Stephen Susco");
        Cine cine = new Cine(pelicula, 10.0);

        cine.simularEspectadores(50);
        cine.mostrarTablaDeAsientos();
        pelicula.mostrarPelicula();
    }
}
