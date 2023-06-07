/*
Realice un programa que calcule y visualice el valor máximo, el 
valor mínimo y el promedio de n números (n>0). El valor de n se 
solicitará al principio del programa y los números serán 
introducidos por el usuario. Realice dos versiones del programa, 
una usando el bucle “while” y otra con el bucle “do - while”.
 */
package ejerciciosextras;

import java.util.Scanner;

/**
 *
 * @author TKBio
 */
public class Ejercicio07v1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("----** CON WHILE **----");
        System.out.println("Ingrese la cantidad de numeros a introducir: ");
        int n = leer.nextInt();

        int cont = 0;
        int sum = 0;
        int max = 0;
        int min = 0;

        while (cont < n) {
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
        }
        double prom = (double) sum / n;

        System.out.println("Valor maximo: " + max);
        System.out.println("Valor minimo: " + min);
        System.out.println("Promedio: " + prom);
    }
}
