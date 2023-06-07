package ejercico04;

import java.util.Scanner;

/**
 *
 * @author TKBio
 */
public class Rectangulo {

    public static void main(String[] args) {

    }

    private int base;
    private int altura;

    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int calcularSuperficie() {
        return base * altura;
    }

    public int calcularPerimetro() {
        return 2 * (base + altura);
    }

    public void dibujarRectangulo() {
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    // Método para crear un rectángulo con datos ingresados por el usuario

    public void crearRectangulo() {
        Scanner leer = new Scanner(System.in);
        System.out.println("-----** RECTANGULO DE ASTERISCOS **-----");
        System.out.println("Ingrese la base del rectángulo: ");
        int base = leer.nextInt();
        System.out.println("Ahora ingrese la altura: ");
        int altura = leer.nextInt();
        this.setBase(base);
        this.setAltura(altura);
    }
}
