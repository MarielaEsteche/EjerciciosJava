/*
Ejercicio 13
Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de 
compañeros de equipo y define su tipo de dato de tal manera que te
permita alojar sus nombres más adelante.
 */
package ManosALaObra;

import java.util.Scanner;

/**
 *
 * @author TKBio
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de compañeros de equipo: ");
        int cantidad = leer.nextInt();
        // definimos un vector tipo String con tamaño 'cantidad'
        String[] equipo = new String[cantidad];

        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese el nombre del compañero " + (i + 1) + ": ");
            equipo[i] = leer.next(); // guardamos el nombre en la posición i del vector
        }
    }
}
