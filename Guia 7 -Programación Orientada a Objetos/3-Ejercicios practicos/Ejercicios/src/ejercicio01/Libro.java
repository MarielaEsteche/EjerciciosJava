/*
Crear una clase llamada Libro que contenga los 
siguientes atributos: 
ISBN, Título, Autor, Número de páginas, 
y un constructor con todos los atributos pasados por 
parámetro y un constructor vacío. 
Crear un método para cargar un libro pidiendo los datos
al usuario y luego informar mediante otro método el 
número de ISBN, el título, el autor del libro y el 
número de páginas.
 */
package Libro;

import java.util.Scanner;

/**
 *
 * @author TKBio
 */
public class Libro {

    public static void main(String[] args) {

    }
    /**
     * Pongo los atributos
     */
    public String ISBN;
    public String Titulo;
    public String Autor;
    public int numPag;

    //Constructor vacio
    public Libro() {

    }

    // Ahora un constructor con los parametros
    public Libro(String ISBN, String Titulo, String Autor, int numPag) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.numPag = numPag;
    }

    // Método para cargar los datos del libro
    public void cargarLibro() {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese el número de ISBN: ");
        this.ISBN = leer.nextLine();

        System.out.print("Ingrese el título del libro: ");
        this.Titulo = leer.nextLine();

        System.out.print("Ingrese el nombre del autor: ");
        this.Autor = leer.nextLine();

        System.out.print("Ingrese el número de páginas: ");
        this.numPag = leer.nextInt();
    }

    // Método para imprimir los datos del libro
    public void imprimirLibro() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Título: " + Titulo);
        System.out.println("Autor: " + Autor);
        System.out.println("Número de páginas: " + numPag);
    }
}
