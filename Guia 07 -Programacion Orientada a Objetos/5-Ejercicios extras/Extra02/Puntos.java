package extra02;

import java.util.Scanner;

/**
 *
 * @author TKBio
 */
public class Puntos {
//Atribitos privados

    private double x1, y1, x2, y2;
//Metodo que pide las coordenadas al usuario

    public void crearPuntos() {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la coordenada de x del punto 1: ");
        x1 = leer.nextDouble();
        System.out.println("Ingrese la coordenada de y del punto 1: ");
        y1 = leer.nextDouble();
        System.out.println("Ingrese la coordenada de x del punto 2: ");
        x2 = leer.nextDouble();
        System.out.println("Ingrese la coordenada de y del punto 2: ");
        y2 = leer.nextDouble();

    }
//Metodo que calcula la distancia entre puntos 

    public Double calcularDistancia() {
        return Math.sqrt(Math.pow(this.x2 - this.x1, 2) + Math.pow(this.y2 - this.y1, 2));
    }
}
