/*
Ejercicio 6
Implementar un programa que le pida dos números enteros 
al usuario y determine si ambos o alguno de ellos es mayor a 25
 */
package ManosALaObra;

import java.util.Scanner;

/**
 *
 * @author TKBio
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numeros enteros: ");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();

        if (num1 > 25 && num2 > 25) {
            System.out.println("Los dos numeros son mayores a 25.");
        } else if (num1 > 25 || num2 > 25) {
            System.out.println("Solo un numero es mayor a 25.");
        } else {
            System.out.println("Ningun numero es mayor a 25. ");
        }
    }
}
