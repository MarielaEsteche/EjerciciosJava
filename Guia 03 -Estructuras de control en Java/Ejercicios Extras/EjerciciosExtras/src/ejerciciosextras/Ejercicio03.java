/*
Elaborar un algoritmo en el cuál se ingrese una letra y se 
detecte si se trata de una vocal. Caso contrario mostrar un 
mensaje. Nota: investigar la función equals() de la clase String.
 */
package ejerciciosextras;

import java.util.Scanner;

/**
 *
 * @author TKBio
 */
public class Ejercicio03 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String letra;

        System.out.println("Ingrese una letra");
        letra = leer.next().toLowerCase();

        if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")) {
            System.out.println("La letra [" + letra + "] es una VOCAL !!");
        } else {
            System.out.println("La letra [" + letra + "] es una CONSONANTE!!");
        }
    }
}
