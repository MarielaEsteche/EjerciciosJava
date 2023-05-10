/*
Ejercicio 10
Realizar un programa que lea 4 números 
(comprendidos entre 1 y 20) e imprima el número ingresado 
seguido de tantos asteriscos como indique su valor. 
Por ejemplo:
5 *****
3 ***
11 ***********
2 **

 */
package ManosALaObra;

import java.util.Scanner;

/**
 *
 * @author TKBio
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        int[] nums = new int[4];
        for (int i = 0; i < 4; i++) {
            System.out.println("Ingrese un numero entre 1 y 20: ");
            nums[i] = Leer.nextInt();
        }

        for (int num : nums) {
            System.out.print(num + " ");
            for (int i = 0; i < num; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
