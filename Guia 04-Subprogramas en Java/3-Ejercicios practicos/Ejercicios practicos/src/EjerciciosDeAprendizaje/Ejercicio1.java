/*
Crea una aplicación que le pida dos números al usuario y este 
pueda elegir entre sumar, restar, multiplicar y dividir. 
La aplicación debe tener una función para cada operación 
matemática y deben devolver sus resultados para imprimirlos en el
main. 
 */
package EjerciciosDeAprendizaje;

import java.util.Scanner;

/**
 *
 * @author TKBio
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // Pedir los números al usuario
        System.out.println("Ingrese el primer número: ");
        double num1 = leer.nextDouble();

        System.out.println("Ingrese el segundo número: ");
        double num2 = leer.nextDouble();

        // Pedir la operación al usuario
        System.out.println("Ingrese la operación que desea realizar (+,-,*,/): ");
        String operacion = leer.next();

        // Realizar la operación correspondiente
        double resultado = 0;
        switch (operacion) {
            case "+":
                resultado = sumar(num1, num2);
                break;
            case "-":
                resultado = restar(num1, num2);
                break;
            case "*":
                resultado = multiplicar(num1, num2);
                break;
            case "/":
                resultado = dividir(num1, num2);
                break;
            default:
                System.out.println("Operación no válida.");
                return;
        }

        // Imprimir el resultado
        System.out.println("El resultado de la operación es: " + resultado);

    }

    public static double sumar(double num1, double num2) {
        return num1 + num2;
    }

    public static double restar(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    public static double dividir(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("No se puede dividir entre cero.");
            return 0;
        }
        return num1 / num2;
    }

}
