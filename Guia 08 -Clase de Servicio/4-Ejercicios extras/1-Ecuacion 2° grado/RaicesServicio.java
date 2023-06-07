package extra01;

import java.util.Scanner;

/**
 *
 * @author TKBio
 */
public class RaicesServicio {

    public static void main(String[] args) {
        Scanner leer
                = new Scanner(System.in);
        System.out.println("----------** ECUACION EN 2° Grado **------------");
        System.out.println("Ingrese el valor de a:");
        double a = leer.nextDouble();
        System.out.println("------------------------------------------------");
        System.out.println("Ingrese el valor de b:");
        double b = leer.nextDouble();
        System.out.println("------------------------------------------------");
        System.out.println("Ingrese el valor de c:");
        double c = leer.nextDouble();
        System.out.println("================================================");
        Raices ecuacion = new Raices(a, b, c);
        ecuacion.calcular();
    }
}
