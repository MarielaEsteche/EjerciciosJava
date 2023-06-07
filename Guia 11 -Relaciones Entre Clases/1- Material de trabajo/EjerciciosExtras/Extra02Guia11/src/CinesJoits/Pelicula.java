/*
 La clase Pelicula representará una película con su información
 */
package CinesJoits;

/**
 *
 * @author TKBio
 */
public class Pelicula {

    private String titulo;
    private int duracion;
    private int edadMinima;
    private String director;

    public Pelicula(String titulo, int duracion, int edadMinima, String director) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.edadMinima = edadMinima;
        this.director = director;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public int getEdadMinima() {
        return edadMinima;
    }

    public String getDirector() {
        return director;
    }

    public void mostrarPelicula() {
        System.out.println("Título: " + titulo);
        System.out.println("Duración: " + duracion + " minutos");
        System.out.println("Edad mínima: " + edadMinima + "+");
        System.out.println("Director: " + director);
        System.out.println();
    }
}
