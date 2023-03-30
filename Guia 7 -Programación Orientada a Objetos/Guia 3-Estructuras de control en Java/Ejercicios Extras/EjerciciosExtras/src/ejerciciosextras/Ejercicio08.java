/*
Escriba un programa que lea números enteros. Si el número es 
múltiplo de cinco debe detener la lectura y mostrar la cantidad 
de números leídos, la cantidad de números pares y la cantidad de 
números impares. Al igual que en el ejercicio anterior los números
negativos no deben sumarse. Nota: recordar el uso de la sentencia
break.
 */
package ejerciciosextras;

import java.util.Scanner;

/**
 *
 * @author TKBio
 */
public class Ejercicio08 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int cantNum = 0;
        int pares = 0;
        int imp = 0;

        while (true) {
            System.out.println("Ingrese un numero entero : ");
            int num = leer.nextInt();

            if (num < 0) {
                continue;
            }
            cantNum++;

            if (num % 2 == 0) {
                pares++;
            } else {
                imp++;
            }
            if (num % 5 == 0) {
                System.out.println("Se leyeron " + cantNum + " numeros");
                System.out.println("Hay " + pares + " numeros pares ");
                System.out.println("Hay " + imp + " numeros impares ");
                break;
            }
        }
    }
}
