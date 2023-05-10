/*
Realizar un algoritmo que llene un vector con los 100 primeros 
números enteros y los muestre por pantalla en orden descendente.
 */
package EjerciciosDeAprendizaje;

/**
 *
 * @author TKBio
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numeros = new int[100]; // Creamos un vector de tamaño 100

        // Llenamos el vector con los números del 1 al 100
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
        }

        // Recorremos el vector en orden descendente y mostramos cada elemento por pantalla
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
    }
}
