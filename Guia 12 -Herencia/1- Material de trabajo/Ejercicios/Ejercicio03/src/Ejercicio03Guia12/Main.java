package Ejercicio03Guia12;

import java.util.ArrayList;

/**
 *
 * @author TKBio
 */
public class Main {

    public static void main(String[] args) {
        //Vamos a Crear un ArrayList de electrodomesticos
        ArrayList<Electrodomestico> electrodomesticos = new ArrayList<>();
        
        //Sumamos los electrodomesticos al ArrayList
        electrodomesticos.add(new Lavadora(15, 15000, "Blanco", 'A', 10));
        electrodomesticos.add(new Televisor(45, true, 30000, "Negro", 'B', 60));
        electrodomesticos.add(new Lavadora(12, 18000, "Gris", 'C', 8));
        electrodomesticos.add(new Televisor(50, false, 25000, "Azul", 'D', 32));
        
        //Vamos recorriendo el ArrayList y ejecutamos el PrecioFinal() de cada electrodomestico
        double precioTotalElectrodomesticos = 0;
        double precioTotalLavadoras = 0;
        double precioTotalTelevisores = 0;

        for (Electrodomestico electrodomestico : electrodomesticos) {
            double precioFinal = electrodomestico.precioFinal();
            precioTotalElectrodomesticos += precioFinal;

            if (electrodomestico instanceof Lavadora) {
                precioTotalLavadoras += precioFinal;
            } else if (electrodomestico instanceof Televisor) {
                precioTotalTelevisores += precioFinal;
            }

            //Mostramos el precio de cada tipo de objeto con el precio despues de agregarle
            //los costos segun consumo etc que aumentan el valor de los mismos segun el ejercicio 2
            System.out.println(electrodomestico);
            System.out.println("Precio final: $" + precioFinal);
            System.out.println("-------------------------------------------");
        }

        //Muestro el precio total de todos los electrodomesticos como pedia el ejercicio 3
        System.out.println("Precio total de electrodomésticos: $" + precioTotalElectrodomesticos);
        System.out.println("Precio total de lavadoras: $" + precioTotalLavadoras);
        System.out.println("Precio total de televisores: $" + precioTotalTelevisores + "\n");
    }
}
