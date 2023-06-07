/*
Realizar un programa que pida dos números enteros positivos 
por teclado y muestre por pantalla el siguiente menú:
El usuario deberá elegir una opción y el programa deberá mostrar
el resultado por pantalla y luego volver al menú. 
El programa deberá ejecutarse hasta que se elija la opción 5. 
Tener en cuenta que, si el usuario selecciona la opción 5, 
en vez de salir del programa directamente, se debe mostrar 
el siguiente mensaje de confirmación: 
¿Está seguro que desea salir del programa (S/N)? 
Si el usuario selecciona el carácter ‘S’ se sale del programa,
caso contrario se vuelve a mostrar el menú.
 */
package Ejercicios.de.aprendizaje;

import java.util.Scanner;

/**
 *
 * @author TKBio
 */
public class Ejercicio06 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //se pide al usuario que ingrese los numeros
        System.out.println("Ingrese un numero: ");
        int num1 = leer.nextInt();
        System.out.println("Ingrese otro numero: ");
        int num2 = leer.nextInt();
        //iniciamos una variable <Opcion> elegida por el usuario
        int opcion = 0;
        //Ejecutamos el menu 
        while (opcion != 5) {
            //menu de opciones
            System.out.println("\n --- ** MENU DE OPCIONES ** ---");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Salir");
            //leemos la opcion que eligio el usuario
            System.out.println("Por favor, Elija una opcion: ");
            opcion = leer.nextInt();
            //ahora hacemos el Switch 
            switch (opcion) {
                case 1:
                    int suma = num1 + num2;
                    System.out.println("La suma de " + num1 + " + " + num2 + " es " + suma);
                    break;
                case 2:
                    int resta = num1 - num2;
                    System.out.println("La resta de " + num1 + " - " + num2 + " es " + resta);
                    break;
                case 3:
                    int multi = num1 * num2;
                    System.out.println("La multiplicacion de " + num1 + " x " + num2 + " es " + multi);
                    break;
                case 4://En la division cuando se divide por 0 me da error asi que ponemos un if/else
                    /*   int div = num1 / num2;
                     *System.out.println("La division de " + num1 + " / " + num2 + " es " + div);
                     *break;
                     */
                    if (num2 == 0) {
                        System.out.println("No se puede dividir por cero");
                    } else {
                        double div = (double) num1 / num2;
                        System.out.println("La division de " + num1 + " / " + num2 + " es " + div);
                    }
                    break;
                case 5:
                    //le pregunto al usuario si quiere salir del programa
                    System.out.println("¿ Quiere salir del programa? (S/N) ");
                    String resp = leer.next();
                    if (resp.equalsIgnoreCase("S")) {
                        System.out.println("Gracias por su visita! Hasta la proxima!");
                    } else {
                        opcion = 0;
                    }
                    break;
                default:
                    System.out.println("Por favor, ingrese una opcion valida!");
            }
        }
    }
}
