/*
Crear un programa que dado un número 
determine si es par o impar.
 */
package Ejercicios.de.aprendizaje;

import java.util.Scanner;

/**
 *
 * @author TKBio
 */
public class Ejercicio01 {

    public static void main(String[] args) {
        //le pido un numero al usuario y lo leo con leer.nextInt
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero:");
        int num = leer.nextInt();
        //ahora vemos si es Par o Impar
        if (num % 2 == 0) {
            System.out.println(num + " es PAR ");
        } else {
            System.out.println(num + " es IMPAR ");
        }
    }
}
