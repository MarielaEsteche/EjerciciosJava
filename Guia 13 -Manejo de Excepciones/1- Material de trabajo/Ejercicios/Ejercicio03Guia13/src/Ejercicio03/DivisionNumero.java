/*
Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos
números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer,
para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar
una división con los dos numeros y mostrar el resultado.
 */
package Ejercicio03;

import java.util.Scanner;

/**
 *
 * @author TKBio
 */
public class DivisionNumero {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        String numero1 = sc.nextLine();

        System.out.println("Ingrese otro numero");
        String numero2 = sc.nextLine();

        //Convertimos las cadenas a enteros
        int num1 = Integer.parseInt(numero1);
        int num2 = Integer.parseInt(numero2);

        //Realizar la division
        int resultado = num1 / num2;

        //Mostrarel resultado
        System.out.println(num1 + " dividido " + num2 + " = " + resultado);

    }
}
