/*
Crea una clase "Juego" que tenga un método "iniciar_juego" 
que permita a dos jugadores jugar un juego de adivinanza de 
números. El primer jugador elige un número y el segundo 
jugador intenta adivinarlo. El segundo jugador tiene un 
número limitado de intentos y recibe una pista de "más alto" 
o "más bajo" después de cada intento. El juego termina cuando
el segundo jugador adivina el número o se queda sin intentos.
Registra el número de intentos necesarios para adivinar el 
número y el número de veces que cada jugador ha ganado.
 */
package extra03;

import java.util.Scanner;

/**
 *
 * @author TKBio
 */
public class Juego {

    private int numIntentos;
    private int jugador1;
    private int jugador2;

    public void iniciar_juego() {
        Scanner leer = new Scanner(System.in);
        System.out.println("-----------------** Bienbenidos a AdEN **-----------------");
        System.out.println("** Un juego de 2 jugadores, el primero elige un numero **\n ** el otro adivina antes de gastar sus 10 intentos **");
        System.out.println("----------------------------------------------------------");
        System.out.println("Jugador 1, elige un numero entre 1 y 100: ");
        int num = leer.nextInt();
        System.out.println("----------------------------------------------------------");
        System.out.println("Jugador 2, elige un numero entre 1 y 100");
        System.out.println("----------------------------------------------------------");
        boolean adivinado = false;
        while (numIntentos < 10 && !adivinado) {
            System.out.println("Intento " + (numIntentos + 1) + ": ");
            int intento = leer.nextInt();
            numIntentos++;
            if (intento == num) {
                System.out.println("----------------------------------------------------------");
                System.out.println("CORRECTO!! Adivinaste el numero en  " + numIntentos + " intentos.");
                System.out.println("----------------------------------------------------------");
                jugador2++;
                adivinado = true;
            } else if (intento < num) {
                System.out.println("Mas alto.");
            } else {
                System.out.println("Mas bajo.");
            }
        }
        if (!adivinado) {
            System.out.println("----------------------------------------------------------");
            System.out.println("LA PIFIASTE!! , Te quedaste sin intentos, al final era el [" + num + "]");
            System.out.println("----------------------------------------------------------");
            jugador1++;
        }
    }

    public int getJugador1() {
        return jugador1;
    }

    public int getJugador2() {
        return jugador2;
    }
}
