/*
Escribir un programa que pida una frase
y la muestre toda en mayúsculas
y después toda en minúsculas. 
 */
package EjerciciosPracticos;

import java.util.Scanner;

/**
 *
 * @author TKBio
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        //se pide la frase al usuario
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase: ");
        String fraC = leer.nextLine();
        //se convierte en mayusculas usando el toUpperCase
        String FRASE = fraC.toUpperCase();
        System.out.println("La frase en mayusculas es: " + FRASE);
        //ahora en minusculas usando el toLowerCase
        String frase = fraC.toLowerCase();
        System.out.println("La frase en minusculas es: " + frase);
    }
}
