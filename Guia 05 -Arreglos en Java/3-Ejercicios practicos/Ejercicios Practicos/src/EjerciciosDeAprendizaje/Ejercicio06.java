/*
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por 
números del 1 al 9 donde la suma de sus filas, sus columnas 
y sus diagonales son idénticas. Crear un programa que 
permita introducir un cuadrado por teclado y determine si 
este cuadrado es mágico o no. El programa deberá comprobar 
que los números introducidos son correctos, es decir, están 
entre el 1 y el 9.
 */
package EjerciciosDeAprendizaje;

import java.util.Scanner;

/**
 *
 * @author TKBio
 */
public class Ejercicio06 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][] cuadrado = new int[3][3];
        System.out.println("\t ----** CUADRADO MAGICO **----");
        for (int i = 0; i < cuadrado.length; i++) {
            for (int j = 0; j < cuadrado.length; j++) {
                System.out.print("Introduce los valores de la fila " + (i + 1) + ", columna " + (j + 1) + ": ");
                //String[] nums = leer.nextLine().split(".");

                int num = leer.nextInt();
                if (num >= 1 && num <= 9) {
                    cuadrado[i][j] = num;
                } else {
                    System.out.println("Error, digite numeros del 1 al 9 ");
                    j--;
                }

            }
        }
        System.out.println("El cuadrado resultante es:");
        System.out.println("--------------------------");
        for (int[] cuadrado1 : cuadrado) {
            for (int j = 0; j < cuadrado1.length; j++) {
                System.out.printf("[" + cuadrado1[j] + "]");
            }
            System.out.println();
        }
        if (esMagico(cuadrado)) {
            System.out.println("---------------------------");
            System.out.println("El cuadrado es mágico!");
        } else {
            System.out.println("---------------------------");
            System.out.println("El cuadrado NO es mágico.");
        }
    }

    public static boolean esMagico(int[][] Cuadrado) {
        int sum = Cuadrado[0][0] + Cuadrado[0][1] + Cuadrado[0][2];
        for (int i = 0; i < Cuadrado.length; i++) {
            int sumVF = 0;
            int sumVC = 0;
            for (int j = 0; j < Cuadrado[i].length; j++) {
                sumVF += Cuadrado[i][j];
                sumVC += Cuadrado[j][i];
                if (Cuadrado[i][j] < 1 || Cuadrado[i][j] > 9) {
                    return false;
                }
            }
            if (sumVF != sum || sumVC != sum) {
                return false;
            }
        }
        if (Cuadrado[0][0] + Cuadrado[1][1] + Cuadrado[2][2] != sum) {
            return false;
        }
        return Cuadrado[2][0] + Cuadrado[1][1] + Cuadrado[0][2] == sum;
    }
}
