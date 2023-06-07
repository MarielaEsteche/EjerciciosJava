/*
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a 
continuación, llamaremos todos los métodos para cada objeto, 
deberá comprobar si la persona está en su peso ideal, tiene 
sobrepeso o está por debajo de su peso ideal e indicar para cada
objeto si la persona es mayor de edad.

 */
package Main;

import Servicios.PersonaServicio;
import entidades.Persona;

/**
 *
 * @author TKBio
 */
public class Main {

    public static void main(String[] args) {
        PersonaServicio personaServicio = new PersonaServicio();
        //ponemos una persona ingresada por usuario y las otras predefinidas
        Persona miPersona = personaServicio.crearPersona();
        Persona PP1 = new Persona("Juan", 25, 'H', 75.0, 180.0);
        Persona PP2 = new Persona("Ana", 18, 'M', 55.0, 160.0);
        Persona PP3 = new Persona("Pedro", 45, 'H', 90.0, 175.0);
        

        Persona[] personas = {miPersona, PP1, PP2, PP3};

        for (int i = 0; i < personas.length; i++) {
            Persona persona = personas[i];

            System.out.println("Persona " + (i + 1) + ": " + persona.getNombre());
            System.out.println("Es mayor de edad: " + personaServicio.esMayorDeEdad(persona));

            int resultadoIMC = personaServicio.calcularIMC(persona);

            switch (resultadoIMC) {
                case -1:
                    System.out.println("Está por debajo de su peso ideal");
                    break;
                case 0:
                    System.out.println("Está en su peso ideal");
                    break;
                default:
                    System.out.println("Tiene sobrepeso");
                    break;
            }

            System.out.println("-----------------------------------");
        }
    }
}
