/*
Una obra social tiene tres clases de socios:
Los socios tipo ‘A’ abonan una cuota mayor, 
pero tienen un 50% de descuento en todos los tipos de tratamientos.
Los socios tipo ‘B’ abonan una cuota moderada y 
tienen un 35% de descuento para los mismos tratamientos
Los socios que menos aportan, los de tipo ‘C’, 
no reciben descuentos sobre dichos tratamientos.
Solicite una letra (carácter) que representa la clase de un socio,
y luego un valor real que represente el costo del trat 
(previo al descuento) y determine el importe en efectivo a pagar 
por dicho socio.

 */
package ejerciciosextras;

import java.util.Scanner;

/**
 *
 * @author TKBio
 */
public class Ejercicio05 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        char tipo;
        double trat, pago;

        System.out.println("Ingrese el tipo de socio (A,B,C o D): ");
        tipo = leer.next().toUpperCase().charAt(0);
        System.out.println("Ingresa el costo del tratamiento: ");
        trat = leer.nextDouble();

        switch (tipo) {
            case 'A':
                pago = trat / 2.0;
                break;
            case 'B':
                pago = trat * 0.65;
                break;
            case 'C':
                pago = trat;
                break;
            default:
                System.out.println("El tipo se socio no es valido.");
                return;
        }
        System.out.printf("El importe a pagar por el socio tipo %c es $%.2f.\n", tipo, pago);
    }
}
