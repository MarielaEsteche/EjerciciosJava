/*
Ejercicio 7 con Do While
 */
package ejerciciosextras;

import java.util.Scanner;

/**
 *
 * @author TKBio
 */
public class Ejercicio07v2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println(
                "----** CON DO WHILE **----");
        System.out.println(
                "Ingrese la cantidad de numeros a introducir: ");
        int n = leer.nextInt();

        int cont = 0;
        int sum = 0;
        int max = 0;
        int min = 0;

        do {
            System.out.println("Ingrese un numero: ");
            int num = leer.nextInt();
            sum += num;
            if (cont == 0) {
                max = num;
                min = num;
            } else {
                max = Math.max(max, num);
                min = Math.min(min, num);
            }
            cont++;
        } while (cont < n);

        double prom = (double) sum / n;

        System.out.println("Valor maximo: " + max);
        System.out.println("Valor minimo: " + min);
        System.out.println("Promedio: " + prom);
    }
}
