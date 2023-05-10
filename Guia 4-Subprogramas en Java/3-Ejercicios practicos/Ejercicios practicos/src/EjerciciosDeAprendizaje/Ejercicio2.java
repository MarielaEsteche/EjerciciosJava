/*
Diseñe una función que pida el nombre y la edad de N personas e 
imprima los datos de las personas ingresadas por teclado e 
indique si son mayores o menores de edad. Después de cada persona
el programa debe preguntarle al usuario si quiere seguir mostrando
personas y frenar cuando el usuario ingrese la palabra “No”.
 */
package EjerciciosDeAprendizaje;

import java.util.Scanner;

/**
 *
 * @author TKBio
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n = 1; // contador para llevar la cuenta de la persona que se está ingresando
        String opcion = "Si"; // inicializamos la variable opcion para entrar al ciclo while
        while (opcion.equalsIgnoreCase("Si")) {
            System.out.println("Ingrese el nombre de la persona " + n + ": ");
            String nombre = leer.next();

            System.out.println("Ingrese la edad de la persona " + n + ": ");
            int edad = leer.nextInt();

            String mayorEdad = (edad >= 18) ? "mayor" : "menor"; // operador ternario para definir si es mayor o menor de edad

            System.out.println(nombre + " tiene " + edad + " años y es " + mayorEdad + " de edad.");

            System.out.println("¿Desea seguir mostrando personas? (Si/No)");
            opcion = leer.next();
            n++; // aumentamos el contador de persona
        }
    }
}
