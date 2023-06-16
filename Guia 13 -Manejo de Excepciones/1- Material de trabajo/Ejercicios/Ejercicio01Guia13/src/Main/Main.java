package Main;

import Servicios.PersonaServicio;
import entidades.Persona;

/**
 *
 * @author TKBio
 */
public class Main {

    public static void main(String[] args) {
        try {
            //Creo una instancia de PersonaServicio
            PersonaServicio personaServicio = new PersonaServicio();

            //Ahora un objeto Persona inicializado como null
            Persona miPersona = null;

            //Intento llamar al metodo "esMayorDeEdad" en el objeto miPersona
            boolean esMayor = personaServicio.esMayorDeEdad(miPersona);
            System.out.println("Es mayor de edad: " + esMayor);
        } catch (NullPointerException e) {
            //Capturo la exepcion "NullPointerExeption
            System.out.println("Error: Objeto Persona no inicializado");
        }
    }
}
