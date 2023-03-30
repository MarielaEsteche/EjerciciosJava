/*
Realice un programa para que el usuario adivine el resultado de 
una multiplicación entre dos números generados aleatoriamente 
entre 0 y 10. El programa debe indicar al usuario si su respuesta 
es o no correcta. En caso que la respuesta sea incorrecta se debe
permitir al usuario ingresar su respuesta nuevamente. 
Para realizar este ejercicio investigue como utilizar la función 
Math.random() de Java.
 */
package ejerciciosextras;

import java.util.Scanner;

/**
 *
 * @author TKBio
 */
public class Ejercicio10 {

    public static void main(String[] args) {
        //generar dos numeros aleatorios con Math.ramdom
        int num1 = (int) (Math.random() * 11);
        int num2 = (int) (Math.random() * 11);
        //calcular el resultado de la multiplicacion
        int resu = num1 * num2;
        //pedir al usuario que adivine el resultado
        Scanner leer = new Scanner(System.in);
        int resp = -1;
        while (resp != resu) {
            System.out.println("Adivina el resultado de " + num1 + " * " + num2 + ": ");
            resp = leer.nextInt();
            if (resp == resu) {
                System.out.println("CORRECTO!!!");
            } else {
                System.out.println(" Casi!! intentalo de nuevo!!");
            }
        }
    }
}
