package punto;

/**
 *
 * @author TKBio
 */
public class MainV2 {

    public static void main(String[] args) {
        PuntoV2 uno = new PuntoV2();
        uno.crearPuntos();
        double distancia = uno.calcularDistancia();
        System.out.println(uno.toString());
        System.out.println("------------------------------------------");
        System.out.printf("La distancia entre los puntos es: %.2f", distancia);
        System.out.println("");
        System.out.println("------------------------------------------");
        
    }
}
