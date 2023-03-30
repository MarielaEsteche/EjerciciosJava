/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosDeAprendizaje;

import java.util.Scanner;

/**
 *
 * @author TKBio
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduce un número entero: ");
        int num = leer.nextInt();

        if (esPrimo(num)) {
            System.out.println("El número es primo.");
        } else {
            System.out.println("El número no es primo.");
        }
    }

    public static boolean esPrimo(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
