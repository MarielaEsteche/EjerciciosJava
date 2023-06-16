package Servicios;

import entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author TKBio
 */
public class PersonaServicio {
    //En la clase "PersonaServicio", actualizo el metodo esMayorDeEdad() para capturar y lanzar
    //la excepcion "NullPointerException". 
    //Primero, verifico si el objeto persona es null. Si es asi, lanzo la excepcion. 
    //si NO lo contrario, continuamos con la verificacion normal de la edad.

    public boolean esMayorDeEdad(Persona persona) {
        if (persona == null) {
            throw new NullPointerException("Objeto Persona no inicializado");
        }

        return persona.getEdad() >= 18;
    }

    public Persona crearPersona() {
        Scanner scanner = new Scanner(System.in);
        Persona persona = new Persona();

        System.out.print("Ingrese el nombre: ");
        String nombre = scanner.nextLine();
        persona.setNombre(nombre);

        System.out.print("Ingrese la edad: ");
        int edad = scanner.nextInt();
        persona.setEdad(edad);

        System.out.print("Ingrese el sexo (H, M, O): ");
        char sexo = scanner.next().charAt(0);

        while (sexo != 'H' && sexo != 'M' && sexo != 'O') {
            System.out.println("Sexo incorrecto. Inténtelo de nuevo.");
            System.out.print("Ingrese el sexo (H, M, O): ");
            sexo = scanner.next().charAt(0);
        }

        persona.setSexo(sexo);

        System.out.print("Ingrese el peso: ");
        double peso = scanner.nextDouble();
        persona.setPeso(peso);

        System.out.print("Ingrese la altura: ");
        double altura = scanner.nextDouble();
        persona.setAltura(altura);

        return persona;
    }

    public int calcularIMC(Persona persona) {
        double alturaEnMetros = persona.getAltura() / 100.0; // Convertir altura de cm a m
        double imc = persona.getPeso() / (alturaEnMetros * alturaEnMetros);

        if (imc < 20) {
            return -1; // persona está por debajo de su peso ideal
        } else if (imc >= 20 && imc <= 25) {
            return 0; // persona está en su peso ideal
        } else {
            return 1; // persona tiene sobrepeso
        }
    }

    public int[] calcularIMCPersonas(Persona[] personas) {
        int[] resultadoIMC = new int[3]; // [0]: por debajo del peso ideal, [1]: en el peso ideal, [2]: con sobrepeso
        for (Persona persona : personas) {
            int resultado = calcularIMC(persona);
            switch (resultado) {
                case -1:
                    resultadoIMC[0]++;
                    break;
                case 0:
                    resultadoIMC[1]++;
                    break;
                default:
                    resultadoIMC[2]++;
                    break;
            }
        }

        return resultadoIMC;
    }

    public double[] calcularPorcentajeIMC(int[] resultadoIMC) {
        double[] porcentajeIMC = new double[3];

        int totalPersonas = resultadoIMC[0] + resultadoIMC[1] + resultadoIMC[2];

        porcentajeIMC[0] = ((double) resultadoIMC[0] / totalPersonas) * 100.0;
        porcentajeIMC[1] = ((double) resultadoIMC[1] / totalPersonas) * 100.0;
        porcentajeIMC[2] = ((double) resultadoIMC[2] / totalPersonas) * 100.0;

        return porcentajeIMC;
    }

    public double calcularPorcentajeMayoresDeEdad(Persona[] personas) {
        int totalPersonas = personas.length;
        int contadorMayoresDeEdad = 0;

        for (Persona persona : personas) {
            if (esMayorDeEdad(persona)) {
                contadorMayoresDeEdad++;
            }
        }

        return ((double) contadorMayoresDeEdad / totalPersonas) * 100.0;
    }
}
