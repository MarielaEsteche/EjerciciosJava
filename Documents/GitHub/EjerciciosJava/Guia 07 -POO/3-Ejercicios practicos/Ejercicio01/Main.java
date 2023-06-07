package Libro;

/**
 *
 * @author TKBio
 */
public class Main {
    public static void main(String[] args) {
        
        // Crear un objeto Libro
        Libro libro1 = new Libro();

        // Cargar los datos del libro
        libro1.cargarLibro();

        // Imprimir los datos del libro
        libro1.imprimirLibro();
    }
}