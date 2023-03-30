/*
Se dispone de un conjunto de N familias, cada una de las cuales 
tiene una M cantidad de hijos. Escriba un programa que pida la 
cantidad de familias y para cada familia la cantidad de hijos 
para averiguar la media de edad de los hijos de todas las familias
 */
package ejerciciosextras;

import java.util.Scanner;

/**
 *
 * @author TKBio
 */
public class Ejercicio14 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de familias");
        int numF = leer.nextInt();

        int totalHijos = 0;
        double totalEdad = 0;
        for (int i = 1; i <= numF; i++) {
            System.out.print("Ingrese la cantidad de hijos de la familia " + i + ": ");
            int numHijos = leer.nextInt();
            totalHijos += numHijos;
            for (int j = 1; j <= numHijos; j++) {
                System.out.print("Ingrese la edad del hijo " + j + " de la familia " + i + ": ");
                int edadHijo = leer.nextInt();
                totalEdad += edadHijo;
            }
        }

        double mediaEdad = totalEdad / totalHijos;
        System.out.println("La media de edad de los hijos de todas las familias es: " + mediaEdad);
    }
}
