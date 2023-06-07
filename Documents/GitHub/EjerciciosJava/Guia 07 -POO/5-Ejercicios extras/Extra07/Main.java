/*
Crea una clase "Rectángulo" que tenga atributos "lado1" y 
"lado2" y un método "calcular_area" que calcule y devuelva 
el área del rectángulo. Luego crea un objeto "rectangulo1" 
de la clase "Rectángulo" con lados de 4 y 6 y imprime el área
del rectángulo.
 */
package extra07;

import java.util.Scanner;

/**
 *
 * @author TKBio
 */
public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese el valor de lado1: ");
        double lado1 = leer.nextDouble();

        System.out.print("Ingrese el valor de lado2: ");
        double lado2 = leer.nextDouble();

        Rectangulo r1 = new Rectangulo(lado1, lado2);

        System.out.println(r1.toString());
    }
}
