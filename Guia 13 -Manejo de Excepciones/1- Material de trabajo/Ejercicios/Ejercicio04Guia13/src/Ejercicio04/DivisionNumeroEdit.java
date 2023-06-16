/*
Todas estas operaciones puede tirar excepciones a manejar, el ingreso por teclado puede
causar una excepción de tipo InputMismatchException, el método Integer.parseInt() si la cadena
no puede convertirse a entero, arroja una NumberFormatException y además, al dividir un
número por cero surge una ArithmeticException. Manipule todas las posibles excepciones
utilizando bloques try/catch para las distintas excepciones
 */
package Ejercicio04;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author TKBio
 */
public class DivisionNumeroEdit {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //El bloque try envuelve la lectura de los numeros y las operaciones de la division
        try {
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
            //El bloque catch maneja 3 excepciones con sus respectivos mensajes y que hace cada uno
        } catch (InputMismatchException e) {
            System.out.println("ERROR!! Debe ingresar numeros enteros");
        } catch (NumberFormatException e) {
            System.out.println("ERROR!! imposible convertir a numero entero");
        } catch (ArithmeticException e) {
            System.out.println("ERROR!! No se puede dividir por cero");
        }
    }
}
