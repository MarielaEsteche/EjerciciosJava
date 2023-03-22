/*
Ejercicio 8
Escriba un programa que valide si una nota está entre 0 y 10, 
sino está entre 0 y 10 la nota se pedirá de nuevo hasta que 
la nota sea correcta.
 */
package ManosALaObra;

import java.util.Scanner;

/**
 *
 * @author TKBio
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        double nota = 11;
        while (nota < 0 || nota > 10) {
            System.out.println("Escribe una nota entre 0 y 10: ");
            nota = Leer.nextDouble();
        }
        System.out.println("La nota ingresada es :" + nota);
    }
}
