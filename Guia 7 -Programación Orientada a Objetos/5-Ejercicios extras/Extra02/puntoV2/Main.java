package punto;

/**
 *
 * @author TKBio
 */
public class Main {

    public static void main(String[] args) {
        Punto uno = new Punto();
        uno.crearPuntos();
        double distancia = uno.calcularDistancia();
        System.out.println(uno.toString());
        System.out.println("------------------------------------------");
        System.out.printf("La distancia entre los puntos es: %.2f", distancia);
        System.out.println("");
        System.out.println("------------------------------------------");
        
    }
}
