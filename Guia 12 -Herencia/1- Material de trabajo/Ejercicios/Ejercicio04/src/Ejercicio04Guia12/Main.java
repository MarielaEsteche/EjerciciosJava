package Ejercicio04Guia12;

import java.util.Scanner;

/**
 *
 * @author TKBio
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("-----------------------------\n");
        System.out.print("Ingrese el radio del círculo: ");
        double radioCirculo = sc.nextDouble();
        Circulo circulo = new Circulo(radioCirculo);

        System.out.print("Ingrese la base del rectángulo: ");
        double baseRectangulo = sc.nextDouble();
        System.out.print("Ingrese la altura del rectángulo:");
        double alturaRectangulo = sc.nextDouble();
        Rectangulo rectangulo = new Rectangulo(baseRectangulo, alturaRectangulo);

        //Calcular y mostrar el area y perimetro del circulo
        System.out.println("\n---------- CIRCULO ---------\n");
        System.out.println("Area: " + circulo.calcularArea());
        System.out.println("Perimetro: " + circulo.calcularPerimetro() + "\n");

        //Ahora lo mismo con el Rectangulo}
        System.out.println("----------RECTANGULO----------\n");
        System.out.println("Area: " + rectangulo.calcularArea());
        System.out.println("Perimetro: " + rectangulo.calcularPerimetro() + "\n");
    }

}
