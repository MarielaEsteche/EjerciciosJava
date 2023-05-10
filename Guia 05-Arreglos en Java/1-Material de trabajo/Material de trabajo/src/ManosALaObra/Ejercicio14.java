/*
Ejercicio 14
Utilizando un Bucle for, aloja en el vector Equipo, los nombres de
tus compañeros de equipo
 */
package ManosALaObra;

import java.util.Scanner;

/**
 *
 * @author TKBio
 */
public class Ejercicio14 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de compañeros de equipo: ");
        int cantidad = leer.nextInt();

        String[] equipo = new String[cantidad]; // definimos un vector de tipo String con tamaño 'cantidad'

        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese el nombre del compañero " + (i + 1) + ": ");
            equipo[i] = leer.next(); // guardamos el nombre en la posición i del vector
        }

        System.out.println("Los nombres de tus compañeros de equipo son:");

        for (int i = 0; i < cantidad; i++) {
            System.out.println(equipo[i]); // imprimimos el nombre en la posición i del vector
        }
    }
}
