/*
Escribir un programa que lea un número entero por teclado 
y muestre por pantalla el doble, el triple y la raíz cuadrada 
de ese número. 
Nota: investigar la función Math.sqrt().
 */
package EjerciciosPracticos;

import java.util.Scanner;

/**
 *
 * @author TKBio
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        // TODO code application logic here
        // Creamos un objeto de la clase Scanner para leer la entrada del usuario
        Scanner leer = new Scanner(System.in);

        // Pedimos al usuario que ingrese un número entero y lo almacenamos en una variable llamada "numero"
        System.out.println("Dame un numero: ");
        int num = leer.nextInt();

        // Calculamos el doble, el triple y la raíz cuadrada del número ingresado usando las funciones correspondientes
        int doble = num * 2;
        int triple = num * 3;
        double raizCuadrada = Math.sqrt(num);

        // Mostramos los resultados por pantalla
        System.out.println("El doble de " + num + " es: " + doble);
        System.out.println("El triple de " + num + " es: " + triple);
        System.out.println("La raíz cuadrada de " + num + " es: " + raizCuadrada);
    }
}
