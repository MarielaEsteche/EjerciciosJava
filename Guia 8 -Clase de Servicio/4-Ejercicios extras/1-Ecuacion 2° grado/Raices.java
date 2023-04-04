package extra01;

/**
 *
 * @author TKBio
 */
public class Raices {
    private double a;
    private double b;
    private double c;

    public Raices(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminante() {
        return (b * b) - (4 * a * c);
    }

    public boolean tieneRaices() {
        double discriminante = getDiscriminante();
        return discriminante >= 0;
    }

    public boolean tieneRaiz() {
        double discriminante = getDiscriminante();
        return discriminante == 0;
    }

    public void obtenerRaices() {
        if (tieneRaices()) {
            double x1 = (-b + Math.sqrt(getDiscriminante())) / (2 * a);
            double x2 = (-b - Math.sqrt(getDiscriminante())) / (2 * a);
            System.out.println("Las posibles soluciones son: " + x1 + " y " + x2);
        } else {
            System.out.println("No existen soluciones reales.");
        }
    }

    public void obtenerRaiz() {
        if (tieneRaiz()) {
            double x = -b / (2 * a);
            System.out.println("La única solución es: " + x);
        } else {
            System.out.println("No existe una única solución.");
        }
    }

    public void calcular() {
        if (tieneRaices()) {
            obtenerRaices();
        } else if (tieneRaiz()) {
            obtenerRaiz();
        } else {
            System.out.println("No existen soluciones reales.");
        }
        System.out.println("================================================");
    }
    
}
