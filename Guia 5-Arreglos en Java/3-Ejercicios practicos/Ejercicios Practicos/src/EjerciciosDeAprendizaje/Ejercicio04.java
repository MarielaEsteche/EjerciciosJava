/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosDeAprendizaje;

import java.util.Random;

/**
 *
 * @author TKBio
 */
public class Ejercicio04 {

    public static void main(String[] args) {
        int[][] matrizA = new int[4][4];
        Random random = new Random();

        // Rellena matrizA con valores aleatorios
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrizA[i][j] = random.nextInt(10);
            }
        }

        // Muestra matrizA
        System.out.println("**MATRIZ A**");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("[%d]", matrizA[i][j]);
            }
            System.out.println();
        }

        int[][] matrizB = new int[4][4];

        // Calcula la traspuesta de matrizA y la guarda en matrizB
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrizB[i][j] = matrizA[j][i];
            }
        }

        // Muestra matrizB
        System.out.println();
        System.out.println("**MATRIZ B**");
        System.out.println("traspuesta de A");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("[%d]", matrizB[i][j]);
            }
            System.out.println();
        }
    }
}
