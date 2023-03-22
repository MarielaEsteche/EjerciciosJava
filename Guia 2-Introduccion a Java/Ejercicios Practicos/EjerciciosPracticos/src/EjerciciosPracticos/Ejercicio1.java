/*
Escribir un programa que pida dos números enteros por teclado
y calcule la suma de los dos. El programa deberá después 
mostrar el resultado de la suma
 */
package EjerciciosPracticos;

import java.util.Scanner;

/**
 *
 * @author TKBio
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //se define la variable
        int num1, num2, suma;
        //se pregunta al usuario con Scanner**poner import java.util.Scanner;
        Scanner leer = new Scanner(System.in);
        //Se imprime las preguntas al usuario
        System.out.println("Introduce un número:");
        num1 = leer.nextInt();

        System.out.println("Introduce otro número:");
        num2 = leer.nextInt();
        //se le asigna un resultado a la variable 'suma'
        suma = num1 + num2;
        //se imprime el resultado concatenando la impresion
        System.out.println("El resultado de " + num1 + " + " + num2 + " es: " + suma);
    }
}
