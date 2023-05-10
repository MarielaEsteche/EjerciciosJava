/*
Ejercicio 9
Escriba un programa que lea 20 números. 
Si el número leído es igual a cero se debe salir del bucle y 
mostrar el mensaje "Se capturó el numero cero".  
El programa deberá calcular y mostrar el resultado de la suma 
de los números leídos, pero si el número es negativo no debe 
sumarse. Nota: recordar el uso de la sentencia break.
 */
package ManosALaObra;

import java.util.Scanner;

/**
 *
 * @author TKBio
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        int suma = 0;
        for (int n = 1; n <= 20; n++) {
            System.out.println("Ingrese un numero: ");
            int numero = Leer.nextInt();
            if (numero == 0) {
                System.out.println("Se capturo el numero cero.");
                break;
            }
            if (numero > 0) {
                suma += numero;
            }
        }
        System.out.println("La suma de los numeros leidos es: " + suma);
    }
}
