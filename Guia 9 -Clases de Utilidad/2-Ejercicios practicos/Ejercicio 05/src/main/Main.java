package main;

import entidades.Persona;
import servicio.PersonaService;

/**
 *
 * @author TKBio
 */
public class Main {

    public static void main(String[] args) {
        PersonaService PS = new PersonaService();

        Persona P1 = PS.crearPersona();
        PS.mostrarPersona(P1);

        int edad = 18;
        boolean esMenor = PS.menorQue(P1, edad);
        if (esMenor) {
            System.out.println("La persona es menor de " + edad + " años.");
        } else {
            System.out.println("La persona No es menor de " + edad + " años.");
        }
    }
}
