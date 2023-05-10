/*
Realice un programa que compruebe si una matriz dada es 
antisimétrica. Se dice que una matriz A es antisimétrica cuando 
ésta es igual a su propia traspuesta, pero cambiada de signo. 
Es decir, A es antisimétrica si A = -AT. La matriz traspuesta 
de una matriz A se denota por AT y se obtiene cambiando sus 
filas por columnas (o viceversa).
 */
package EjerciciosDeAprendizaje;

import java.util.Random;

/**
 *
 * @author TKBio
 */
public class Ejercicio05 {

    public static void main(String[] args) {
        Random rand = new Random();
        int[][] matriz = new int[4][4];
        for (int[] matriz1 : matriz) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz1[j] = rand.nextInt(21) - 10; // valores entre -10 y 10
            }
        }
        int[][] traspuesta = obtenerTraspuesta(matriz);

        System.out.println("Matriz original:");
        mostrarMatriz(matriz);
        System.out.println("Matriz traspuesta:");
        mostrarMatriz(traspuesta);

        if (esAntisimetrica(matriz, traspuesta)) {
            System.out.println("La matriz es antisimétrica");
        } else {
            System.out.println("La matriz no es antisimétrica");
        }
    }

    public static boolean esAntisimetrica(int[][] matriz, int[][] traspuesta) {
        if (matriz.length != traspuesta.length || matriz[0].length != traspuesta[0].length) {
            return false;
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] != -traspuesta[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int[][] obtenerTraspuesta(int[][] matriz) {
        int[][] traspuesta = new int[matriz[0].length][matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                traspuesta[j][i] = matriz[i][j];
            }
        }
        return traspuesta;
    }

    public static void mostrarMatriz(int[][] matriz) {
        for (int[] matriz1 : matriz) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("[" + matriz1[j] + "]");
            }
            System.out.println();
        }
    }
}
