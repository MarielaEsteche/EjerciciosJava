/*
Dibujar un cuadrado de N elementos por lado utilizando el carácter
“*”. Por ejemplo, si el cuadrado tiene 4 elementos por lado se 
deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *

 */
package Ejercicios.de.aprendizaje;

import java.util.Scanner;

/**
 *
 * @author TKBio
 */
public class Ejercicio08 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del cuadrado : ");
        int n = leer.nextInt();
        //imprimimos la primera fila
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
        //Imprimimos las filas del medio
        for (int i = 0; i < n - 2; i++) {
            System.out.print("*");
            for (int j = 0; j < n - 2; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        //imprimimos la ultima fila
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
