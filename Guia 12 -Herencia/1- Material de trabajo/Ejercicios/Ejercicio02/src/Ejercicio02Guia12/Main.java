package Ejercicio02Guia12;

/**
 *
 * @author TKBio
 */
public class Main {

    public static void main(String[] args) {
        //Creamos la lavadora de la siguiente manera
        Lavadora lavadora = new Lavadora();
        lavadora.crearLavadora();
        double precioFinalLavadora = lavadora.precioFinal();

        System.out.println("\nInformación completa de la lavadora:");
        System.out.println(lavadora);
        System.out.println("Precio final: $" + precioFinalLavadora);

        System.out.println();

        //Creamos el televisor
        Televisor televisor = new Televisor();
        televisor.crearTelevisor();
        double precioFinalTele = televisor.precioFinal();
        System.out.println("\nInformación completa del televisor:");
        System.out.println(televisor);
        System.out.println("Precio final: $" + precioFinalTele);
    }
}
