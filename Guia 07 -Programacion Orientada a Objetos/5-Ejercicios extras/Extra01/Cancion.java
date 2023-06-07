package extra01;

/**
 *
 * @author TKBio
 */
public class Cancion {
//Esta clase tiene 2 atributos privados
    private String titulo;
    private String autor;
//constructor vacio
    public Cancion() {
        this.titulo = "";
        this.autor = "";
    }
//Constructor con parametros
    public Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
//metodos Setter y Getters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

}
