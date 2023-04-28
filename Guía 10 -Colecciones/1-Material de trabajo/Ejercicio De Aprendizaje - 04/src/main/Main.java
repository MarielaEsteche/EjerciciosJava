package main;

import entidades.Pelicula;
import java.util.Scanner;
import service.PeliculaService;

/**
 *
 * @author TKBio
 */
public class Main {

    public static void main(String[] args) {
        PeliculaService peli = new PeliculaService();
        try (Scanner leer = new Scanner(System.in)) {
            System.out.println("================*** INFORMACION DE PELICULAS ***================");
            String opcion;
            do {
                System.out.print("Ingrese el nombre de la pelicula: ");
                String titulo = leer.nextLine();
                System.out.println("--------------------------------------------------------");
                System.out.print("Ingrese quien la dirigio: ");
                String director = leer.nextLine();
                System.out.println("--------------------------------------------------------");

                System.out.print("Cuanto dura?: ");
                int duracionMinutos = leer.nextInt();
                leer.nextLine();
                System.out.println("--------------------------------------------------------");

                Pelicula peliInfo = new Pelicula(titulo, director, duracionMinutos);
                peli.agregarPelicula(peliInfo);

                System.out.print("¿Queres agregar otra pelicula? (S/N) : ");
                opcion = leer.nextLine();
                System.out.println();

            } while (opcion.equalsIgnoreCase("S"));

            peli.mostrarPeliculas();
            peli.mostrarPeliculasMas1Hora();
            peli.odenadasDurMayorAMenor();
            peli.odenadasDurMenorAMayor();
            peli.ordenarPorTitulo();
            peli.ordenarPorDirector();
        }
    }
}
