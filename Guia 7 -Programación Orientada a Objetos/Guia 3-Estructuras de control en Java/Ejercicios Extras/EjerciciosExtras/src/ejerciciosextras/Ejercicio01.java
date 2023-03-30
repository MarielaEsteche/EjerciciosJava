/*
Dado un tiempo en minutos, calcular su equivalente en días y horas
Por ejemplo, si el usuario ingresa 1600 minutos, el sistema debe 
calcular su equivalente: 1 día, 2 horas.
 */
package ejerciciosextras;

import java.util.Scanner;

/**
 *
 * @author TKBio
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int min, horas, dia;
        System.out.println("Ingrese un valor en minutos ");
        min = leer.nextInt();

        horas = min / 60;
        dia = horas / 24;
        horas = horas % 24;
        System.out.println(min + " minutos equivalen a " + dia + " dia(s), " + horas + " Hs.");
    }
}
