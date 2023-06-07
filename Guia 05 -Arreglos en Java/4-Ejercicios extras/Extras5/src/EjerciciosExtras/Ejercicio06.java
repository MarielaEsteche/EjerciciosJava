/*
Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 
caracteres y, a medida que el usuario las va ingresando, 
construya una “sopa de letras para niños” de tamaño de 20 x 20 
caracteres. Las palabras se ubicarán todas en orden horizontal 
en una fila que será seleccionada de manera aleatoria. 
Una vez concluida la ubicación de las palabras, rellene los 
espacios no utilizados con un número aleatorio del 0 al 9. 
Finalmente imprima por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se 
utilizan las siguientes funciones de Java substring(), Length() 
y Math.random().
 */
package EjerciciosExtras;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author TKBio
 */
public class Ejercicio06 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random random = new Random();

        // Tamaño de la sopa de letras
        int tam = 20;

        // Número de palabras a ingresar
        int numPal = 5;

        // Crear la sopa de letras vacía
        char[][] sopaDeLetras = new char[tam][tam];

        // Ingresa las palabras
        for (int i = 0; i < numPal; i++) {
            System.out.print("Ingrese la palabra " + (i + 1) + ": ");
            String palabra = leer.nextLine();

            // Validar que la palabra tenga entre 3 y 5 caracteres
            if (palabra.length() < 3 || palabra.length() > 5) {
                System.out.println("La palabra debe tener entre 3 y 5 caracteres.");
                i--;
                continue;
            }

            // Seleccionar una fila aleatoria para ubicar la palabra
            int numFilas = random.nextInt(tam);

            // Ubicar la palabra en la fila seleccionada
            for (int j = 0; j < palabra.length(); j++) {
                sopaDeLetras[numFilas][j] = palabra.charAt(j);
            }
        }

        // Rellenar los espacios vacíos con números aleatorios del 0 al 9
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                if (sopaDeLetras[i][j] == '\u0000') { // Si el espacio está vacío
                    sopaDeLetras[i][j] = (char) (random.nextInt(10) + '0');
                }
            }
        }

        // Imprimir la sopa de letras resultante
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                System.out.print(sopaDeLetras[i][j] + " ");
            }
            System.out.println();
        }
    }
}
