/*
Ejercicio 12
Crea un procedimiento EsMultiplo que reciba los dos números pasados
por el usuario, validando que el primer número múltiplo del 
segundo e imprima si el primer número es múltiplo del segundo, 
sino informe que no lo son.
 */
package manos.a.la.obra;

import java.util.Scanner;

/**
 *
 * @author TKBio
 */
public class Ejercicio12 {

    public static void EsMultiplo(int num1, int num2) {
        if (num1 % num2 == 0) {
            System.out.println(num1 + " es múltiplo de " + num2);
        } else {
            System.out.println(num1 + " no es múltiplo de " + num2);
        }
    }

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa un numero: ");
        int num1 = leer.nextInt();
        System.out.println("Ingresa otro numero: ");
        int num2 = leer.nextInt();
        EsMultiplo(num1, num2);
    }
}
