/*
En el paquete Servicios crear PersonaServicio con los siguientes
3 métodos:
Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve un booleano.
Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al usuario y después se le asignan a sus respectivos atributos para llenar el objeto Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O. Si no es correcto se deberá mostrar un mensaje
Método calcularIMC(): calculara si la persona está en su peso ideal (peso en kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la función devuelve un 1.
 */
package Servicios;

import entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author TKBio
 */
public class PersonaServicio {

    /*
    Este método indica si la persona es mayor de 18. 
    La función devuelve un booleano.
     */
    public boolean esMayorDeEdad(Persona persona) {
        return persona.getEdad() >= 18;
    }

    /*
    El método crear persona, le pide los valores de los atributos
    al usuario y después se le asignan a sus respectivos atributos 
    para llenar el objeto Persona. Además, comprueba que el sexo 
    introducido sea correcto, es decir, H, M o O. Si no es correcto
    se deberá mostrar un mensaje
     */
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

    /*
    Método calcularIMC(): calculara si la persona está en su 
    peso ideal (peso en kg/(altura^2 en mt2)). Si esta fórmula 
    da por resultado un valor menor que 20, significa que la 
    persona está por debajo de su peso ideal y la función devuelve
    un -1. Si la fórmula da por resultado un número entre 20 y 25 
    (incluidos), significa que la persona está en su peso ideal y 
    la función devuelve un 0. Finalmente, si el resultado de la 
    fórmula es un valor mayor que 25 significa que la persona tiene
    sobrepeso, y la función devuelve un 1.
     */
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
