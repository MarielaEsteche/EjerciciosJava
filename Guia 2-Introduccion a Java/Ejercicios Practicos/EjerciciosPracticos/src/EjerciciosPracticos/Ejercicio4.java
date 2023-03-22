/*
Dada una cantidad de grados centígrados se debe mostrar 
su equivalente en grados Fahrenheit. 
La fórmula correspondiente es: F = 32 + (9 * C / 5)
 */
package EjerciciosPracticos;

import java.util.Scanner;

/**
 *
 * @author TKBio
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        // Pedimos la temperatura en Celsius
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos grados Celsius hace?");
        double C = sc.nextDouble();
        //Comvertimos en Fahrenheits
        double F = 32 + (9 * C / 5);
        System.out.println("En Fahrenheits es :" + F);
    }
}
