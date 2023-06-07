package entidades;

/**
 *
 * @author TKBio
 */
public class Pelicula {

    private String titulo;
    private String director;
    private double duracion;

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, int duracionMinutos) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracionMinutos / 60.0;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }
// Este metodo me permitira colocar una cadena de texto discriptiva

    @Override
    public String toString() {
        return "[Título] " + titulo + ", [Director] " + director + ", [Duración] " + String.format("%.2f", duracion) + " horas.";
    }
}
