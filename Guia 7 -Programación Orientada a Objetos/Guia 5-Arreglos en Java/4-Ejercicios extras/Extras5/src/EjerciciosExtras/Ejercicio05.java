/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosExtras;

import java.util.Random;

/**
 *
 * @author TKBio
 */
public class Ejercicio05 {

    public static void main(String[] args) {
        int N = 5; // Número de filas
        int M = 4; // Número de columnas

        // Crear una matriz de tamaño NxM
        int[][] matriz = new int[N][M];

        // Llenar la matriz con valores aleatorios
        Random rand = new Random();
        int sum = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matriz[i][j] = rand.nextInt(10); // Generar un número aleatorio entre 0 y 9
                sum += matriz[i][j];
            }
        }

        // Mostrar la matriz
        System.out.println("Matriz generada:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        // Mostrar la suma de los elementos
        System.out.println("La suma de los elementos es: " + sum);
    }

}
