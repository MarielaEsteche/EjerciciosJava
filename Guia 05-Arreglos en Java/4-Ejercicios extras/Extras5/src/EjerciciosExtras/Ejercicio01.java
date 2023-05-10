/*
Realizar un algoritmo que calcule la suma de todos los elementos
de un vector de tamaño N, con los valores ingresados por el 
usuario.
 */
package EjerciciosExtras;

import java.util.Scanner;

/**
 *
 * @author TKBio
 */
public class Ejercicio01 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de elementos del vector: ");
        int n = leer.nextInt();

        int[] vector = new int[n];
        int suma = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el valor del elemento " + (i + 1) + ": ");
            vector[i] = leer.nextInt();
            suma += vector[i];
        }

        System.out.println("La suma de todos los elementos del vector es: " + suma);
    }
}
