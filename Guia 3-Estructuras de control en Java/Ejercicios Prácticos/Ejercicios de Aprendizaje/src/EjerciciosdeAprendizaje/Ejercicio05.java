/*
Escriba un programa en el cual se ingrese un valor límite positivo
y a continuación solicite números al usuario hasta que 
la suma de los números introducidos supere el límite inicial.
 */
package Ejercicios.de.aprendizaje;

import java.util.Scanner;

/**
 *
 * @author TKBio
 */
public class Ejercicio05 {

    public static void main(String[] args) {
        //le pedimos al usuario un numero limite
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un valor limite: ");
        int numLimite = leer.nextInt();
        //ahora iniciamos el contador y la suma
        int suma = 0;
        int cont = 0;
        //ahora le pedimos numeros al usuario hasta que de con el limite y lo supere
        while (suma < numLimite) {
            System.out.println("Ingrese otro numero: ");
            int num = leer.nextInt();
            suma += num;
            cont++;
        }
        //ahora se muestra el resultado
        System.out.println("La suma de los " + cont + " numeros ingresados es " + suma + " ,que supera el limite de " + numLimite + ".");
    }
}
