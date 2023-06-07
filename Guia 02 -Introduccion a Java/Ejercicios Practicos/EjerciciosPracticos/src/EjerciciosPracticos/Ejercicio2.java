/*
Escribir un programa que pida tu nombre, 
lo guarde en una variable y lo muestre por pantalla.
 */
package EjerciciosPracticos;

import java.util.Scanner;

/**
 *
 * @author TKBio
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        //creamos una instancia leer con Scanner
        Scanner leer = new Scanner(System.in);
        //pedimos al usuario su nombre
        System.out.println("Como te llamas?");
        String nombre = leer.nextLine();
        //se imprime el nombre en consola
        System.out.println("Hola, " + nombre + "!");
    }
}
