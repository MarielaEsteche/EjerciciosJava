package service;

import entidades.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author TKBio
 */
public class PeliculaService {

    private List<Pelicula> peliculas;

    public PeliculaService() {
        peliculas = new ArrayList<>();
    }

    public void agregarPelicula(Pelicula pelicula) {
        peliculas.add(pelicula);
    }

    public void mostrarPeliculas() {
        System.out.println("======================= * PELICULAS * =======================");
        peliculas.forEach((pelicula) -> {
            System.out.println(pelicula);
        });
        System.out.println("--------------------------------------------------------");
    }

    public void mostrarPeliculasMas1Hora() {
        System.out.println("=========== * PELICULAS QUE DUREN MAS DE 1 HORA * ===========");
        peliculas.stream().filter((pelicula) -> (pelicula.getDuracion() > 1.0)).forEachOrdered((pelicula) -> {
            System.out.println(pelicula);
        });
        System.out.println("--------------------------------------------------------");
    }

    public void odenadasDurMayorAMenor() {
        Collections.sort(peliculas, Comparator.comparingDouble(Pelicula::getDuracion).reversed());
        System.out.println("===== PELICULAS ORDENADAS POR DURACION DE MAYOR A MENOR =====");
        peliculas.forEach((pelicula) -> {
            System.out.println(pelicula);
        });
        System.out.println("-------------------------------------------------------------");
    }

    public void odenadasDurMenorAMayor() {
        Collections.sort(peliculas, Comparator.comparingDouble(Pelicula::getDuracion));
        System.out.println("===== PELICULAS ORDENADAS POR DURACION DE MENOR A MAYOR =====");
        peliculas.forEach((pelicula) -> {
            System.out.println(pelicula);
        });
        System.out.println("--------------------------------------------------------");
    }

    public void ordenarPorTitulo() {
        Collections.sort(peliculas, Comparator.comparing(Pelicula::getTitulo));
        System.out.println("============ * PELICULAS ORDENADAS POR TITULO * =============");
        peliculas.forEach((pelicula) -> {
            System.out.println(pelicula);
        });
        System.out.println("--------------------------------------------------------");
    }

    public void ordenarPorDirector() {
        Collections.sort(peliculas, Comparator.comparing(Pelicula::getDirector));
        System.out.println("============ * PELICULAS ORDENDAS POR DIRECTOR * ============");
        peliculas.forEach((pelicula) -> {
            System.out.println(pelicula);
        });
        System.out.println("=============================================================");
    }
}
