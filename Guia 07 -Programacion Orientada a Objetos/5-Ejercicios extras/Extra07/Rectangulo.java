package extra07;

/**
 *
 * @author TKBio
 */
public class Rectangulo {

    private double lado1;
    private double lado2;

    public Rectangulo(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double calcular_area() {
        return lado1 * lado2;
    }

    @Override
    public String toString() {
        return "-------------------------------------------" + "\n"
                + "\t    " + lado1 + " x " + lado2 + "\n"
                + "Da como resultado un AREA de " + calcular_area() + "\n"
                + "-------------------------------------------" + "\n";
    }
}
