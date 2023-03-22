/*
Los profesores del curso de programación de Egg necesitan llevar
un registro de las notas adquiridas por sus 10 alumnos para 
luego obtener una cantidad de aprobados y desaprobados. 
Durante el período de cursado cada alumno obtiene 4 notas, 
2 por trabajos prácticos evaluativos y 2 por parciales. 
Las ponderaciones de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda 
en el arreglo. Al final del programa los profesores necesitan 
obtener por pantalla la cantidad de aprobados y desaprobados, 
teniendo en cuenta que solo aprueban los alumnos con promedio
mayor o igual al 7 de sus notas del curso.

 */
package EjerciciosExtras;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author TKBio
 */
public class Ejercicio04 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //a ver con el random
        Random rnd = new Random();

        // Creamos un arreglo bidimensional para almacenar las notas de los alumnos
        double[][] notas = new double[10][4];

        // Llenamos el arreglo con notas aleatorias entre 0 y 10
        for (double[] nota : notas) {
            for (int j = 0; j < nota.length; j++) {
                nota[j] = rnd.nextDouble() * 10;
            }
        }

        // Mostramos las notas por pantalla
        System.out.println("Notas de los alumnos:");
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Alumno " + (i + 1) + ": ");
            for (int j = 0; j < notas[i].length; j++) {
                System.out.print(String.format("[%.3f]", notas[i][j]) + " ");
            }
            System.out.println();
        }

        /*/Pedimos al usuario que ingrese las notas de cada alumno
      for (int i = 0; i < notas.length; i++) {
         System.out.println("Ingrese las notas del alumno " + (i+1));
         System.out.print("Primer trabajo práctico evaluativo: ");
         notas[i][0] = leer.nextDouble();
         System.out.print("Segundo trabajo práctico evaluativo: ");
         notas[i][1] = leer.nextDouble();
         System.out.print("Primer integrador: ");
         notas[i][2] = leer.nextDouble();
         System.out.print("Segundo integrador: ");
         notas[i][3] = leer.nextDouble();
      }*/
        //calculamos el promedio de cada alumno y contamos la cantidad de aprobados y desaprobados
        int aprobados = 0;
        int desaprobados = 0;

        for (double[] nota : notas) {
            double promedio = (nota[0] * 0.1) + (nota[1] * 0.15) + (nota[2] * 0.25) + (nota[3] * 0.5);
            if (promedio >= 7) {
                aprobados++;
            } else {
                desaprobados++;
            }
        }

        // Mostramos los resultados por pantalla
        System.out.println("Cantidad de aprobados: " + aprobados);
        System.out.println("Cantidad de desaprobados: " + desaprobados);

    }
}
