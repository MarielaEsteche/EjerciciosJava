/*
Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10
y se muestre su equivalente en romano.
 */
package ejerciciosextras;

import java.util.Scanner;

/**
 *
 * @author TKBio
 */
public class Ejercicio04 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        System.out.println("Ingrese un numero entre 1 y 10 :");
        String[] romanos = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        num = leer.nextInt();

        if (num < 1 || num > 10) {
            System.out.println("El numero ingresado no es valido! ingrese un numero del 1 al 10 ");
        } else {
            System.out.println("El numero " + num + " en romanos es :" + romanos[num] + ".");
        }
    }
}
