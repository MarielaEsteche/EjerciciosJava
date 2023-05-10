/*
Escribir un programa que lea un número entero y devuelva el número
de dígitos que componen ese número. Por ejemplo, si introducimos
el número 12345, el programa deberá devolver 5. Calcular la 
cantidad de dígitos matemáticamente utilizando el operador de 
división. Nota: recordar que las variables de tipo entero truncan 
los números o resultados.
 */
package ejerciciosextras;

import java.util.Scanner;

/**
 *
 * @author TKBio
 */
public class Ejercicio11 {

    public static void main(String[] args) {
        // Pedir al usuario que ingrese un número entero
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número entero: ");
        int num = leer.nextInt();

        // Calcular la cantidad de dígitos utilizando el operador de división
        int cantidadDigitos = 0;
        while (num != 0) {
            num /= 10;
            cantidadDigitos++;
        }

        // Imprimir la cantidad de dígitos
        System.out.println("El número tiene " + cantidadDigitos + " dígitos.");
    }
}
