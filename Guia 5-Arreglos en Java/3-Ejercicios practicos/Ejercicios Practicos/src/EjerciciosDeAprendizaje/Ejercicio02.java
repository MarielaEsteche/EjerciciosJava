/*
Realizar un algoritmo que llene un vector de tamaño N con valores
aleatorios y le pida al usuario un número a buscar en el vector. 
El programa mostrará dónde se encuentra el numero y si se 
encuentra repetido
 */
package EjerciciosDeAprendizaje;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author TKBio
 */
public class Ejercicio02 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // Pedimos al usuario el tamaño del vector
        System.out.println("Ingrese el tamaño del vector:");
        int N = leer.nextInt();

        int[] vector = new int[N]; // Creamos un vector de tamaño N

        // Llenamos el vector con valores aleatorios
        Random random = new Random();
        for (int i = 0; i < N; i++) {
            vector[i] = random.nextInt(100); // Generamos valores aleatorios entre 0 y 99
        }

        // Solicitamos al usuario el número a buscar
        System.out.println("Ingrese un número a buscar:");
        int numero = leer.nextInt();

        // Buscamos el número en el vector
        boolean encontrado = false;
        int posicion = -1;
        int contador = 0;
        for (int i = 0; i < N; i++) {
            if (vector[i] == numero) {
                encontrado = true;
                posicion = i;
                contador++; // Incrementamos el contador si encontramos el número
            }
        }

        // Mostramos el resultado de la búsqueda
        if (encontrado) {
            System.out.println("El número " + numero + " se encuentra en la posición " + posicion + " del vector.");
            if (contador > 1) {
                System.out.println("El número " + numero + " se encuentra repetido " + contador + " veces en el vector.");
            } else {
                System.out.println("El número " + numero + " se encuentra una vez en el vector.");
            }
        } else {
            System.out.println("El número " + numero + " no se encuentra en el vector.");
        }
    }
}
