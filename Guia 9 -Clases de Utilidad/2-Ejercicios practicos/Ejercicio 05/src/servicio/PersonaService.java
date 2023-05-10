package servicio;

import entidades.Persona;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author TKBio
 */

public class PersonaService {

    private Scanner scanner = new Scanner(System.in);

    public Persona crearPersona() {
        System.out.print("Ingrese el nombre de la persona: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese la fecha de nacimiento (en formato dd/mm/yyyy): ");
        String fechaNacimientoStr = scanner.nextLine();

        Date fechaNacimiento = null;
        try {
            fechaNacimiento = new Date(fechaNacimientoStr);
        } catch (Exception e) {
            System.out.println("Error al ingresar la fecha de nacimiento.");
        }

        return new Persona(nombre, fechaNacimiento);
    }

    public int calcularEdad(Date fechaNacimiento) {
        Calendar fechaNac = Calendar.getInstance();
        fechaNac.setTime(fechaNacimiento);

        Calendar fechaActual = Calendar.getInstance();

        int edad = fechaActual.get(Calendar.YEAR) - fechaNac.get(Calendar.YEAR);

        if (fechaActual.get(Calendar.DAY_OF_YEAR) < fechaNac.get(Calendar.DAY_OF_YEAR)) {
            edad--;
        }

        return edad;
    }

    public boolean menorQue(Persona persona, int edad) {
        int edadPersona = calcularEdad(persona.getFechaNacimiento());
        return edadPersona < edad;
    }

    public void mostrarPersona(Persona persona) {
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Fecha de nacimiento: " + persona.getFechaNacimiento());
        System.out.println("Edad: " + calcularEdad(persona.getFechaNacimiento()));
    }
}
