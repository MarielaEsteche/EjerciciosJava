/*
Leer la altura de N personas y determinar el promedio de 
estaturas que se encuentran por debajo de 1.60 mts.
y el promedio de estaturas en general.
 */
package ejerciciosextras;

import java.util.Scanner;

/**
 *
 * @author TKBio
 */
public class Ejercicio06 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero de personas: ");
        int n = leer.nextInt();
        double[] altura = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese las alturas en metros (1,58) " + (i + 1) + ":");
            altura[i] = leer.nextDouble();
        }

        double sum160 = 0;
        int cont160 = 0;
        double sumaT = 0;

        for (int i = 0; i < altura.length; i++) {
            if (altura[i] < 1.60) {
                sum160 += altura[i];
                cont160++;
            }
            sumaT += altura[i];
        }
        if (cont160 > 0) {
            double promedio160 = sum160 / cont160;
            System.out.println("El promedio de estaturas por debajo de 1.60 mts es: " + promedio160);
        } else {
            System.out.println("No hay estaturas por debajo de 1.60 mts.");
        }
        double promedioT = sumaT / altura.length;

        System.out.println("El promedio de estaturas en general es: " + promedioT);
    }
}
