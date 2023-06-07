/*
Crea una aplicación que a través de una función nos convierta
una cantidad de euros introducida por teclado a otra 
moneda, estas pueden ser a dólares, yenes o libras. 
La función tendrá como parámetros, la cantidad de euros 
y la moneda a convertir que será una cadena, 
este no devolverá ningún valor y mostrará un mensaje 
indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €

 */
package EjerciciosDeAprendizaje;

import java.util.Scanner;

/**
 *
 * @author TKBio
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Intruduce los euros: ");
        double euros = leer.nextDouble();
        System.out.println("introduce el tipo de cambio: ");
        String cambio = leer.next();

        Cambio(euros, cambio);
    }

    public static void Cambio(double euros, String cambio) {
        double res;
        String mensaje;

        switch (cambio) {
            case "dolares":
                res = euros * 1.28611;
                mensaje = euros + " euros son " + res + "dolares";
                break;
            case "libras":
                res = euros * 0.86;
                mensaje = euros + " euros son " + res + " libras.";
                break;
            case "yenes":
                res = euros * 129.852;
                mensaje = euros + " euros son " + res + " yenes.";
                break;
            default:
                mensaje = "el tipo de cambio no es valido. ";
                break;
        }
        System.out.println(mensaje);
    }
}
