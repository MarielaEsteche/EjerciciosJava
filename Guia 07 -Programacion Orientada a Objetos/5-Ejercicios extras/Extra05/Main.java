/*
Crea una clase "Cuenta" que tenga atributos como "saldo" y 
"titular". Luego, crea un método "retirar_dinero" que permita
retirar una cantidad de dinero del saldo de la cuenta. 
Asegúrate de que el saldo nunca sea negativo después de 
realizar una transacción de retiro.
 */
package extra05;

import java.util.Scanner;

/**
 *
 * @author TKBio
 */
public class Main {

    public static void main(String[] args) {

        // Crear una instancia de Scanner para leer la entrada del usuario
        Scanner leer = new Scanner(System.in);

        // Pedir al usuario que ingrese un numero de cuenta
        System.out.println("=====================================================");
        System.out.println("================ ** CAJERO DE MEL ** ================");
        System.out.println("=====================================================");
        System.out.print("Ingrese su numero de cuenta: ");
        String identificador = leer.nextLine();

        // Crear una instancia de Cuenta con un saldo inicial
        Cuenta cuenta = new Cuenta(100000, "1234");

        // Verificar si el identificador ingresado coincide con el titular
        if (identificador.equals(cuenta.getTitular())) {
            // Si el identificador coincide con el titular, mostrar el saldo actual y permitir al usuario realizar operaciones
            double saldoActual = cuenta.getSaldo();
            System.out.println("-----------------------------------------------------");
            System.out.println("El saldo actual de la cuenta es de $" + saldoActual);

            // Pedir al usuario que ingrese la cantidad a retirar
            System.out.println("-----------------------------------------------------");
            System.out.print("Ingrese la cantidad a retirar: ");
            double cantidad = leer.nextDouble();

            // Retirar dinero de la cuenta
            cuenta.retirarDinero(cantidad);

            // Mostrar el saldo actual después de la operación de retiro
            saldoActual = cuenta.getSaldo();
            System.out.println("-----------------------------------------------------");
            System.out.println("Su saldo actual es de $" + saldoActual);

        } else {
            // Si el identificador no coincide con el titular, mostrar un mensaje de error
            System.out.println("-----------------------------------------------------");
            System.out.println("El numero de cuenta ingresada, NO EXISTE.");
        }
        System.out.println("=====================================================");
        System.out.println("                ¡ Gracias por su visita !");
        System.out.println("=====================================================");
    }
}
