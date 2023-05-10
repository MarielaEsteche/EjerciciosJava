package main;

import entidades.Cadena;
import java.util.Scanner;
import service.CadenaServicio;

/**
 *
 * @author TKBio
 */
public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //le pido al usuario que ingrese la frase
        System.out.println("===============================");
        System.out.println("Ingrese una frase");
        String frase = leer.nextLine();

        Cadena cadena = new Cadena(frase);

        CadenaServicio servicio = new CadenaServicio();

        // Mostrar cantidad de vocales
        servicio.mostrarVocales(cadena);

        // Invertir la frase
        servicio.invertirFrase(cadena);

        // Contar veces que se repite una letra
        System.out.println("===============================");
        System.out.print("Ingrese una letra para contar su cantidad de repeticiones: ");
        String letra = leer.nextLine();
        servicio.vecesRepetido(cadena, letra);

        // Comparar longitud con otra frase
        System.out.println("===============================");
        System.out.print("Ingrese otra frase para comparar su longitud: ");
        frase = leer.nextLine();
        servicio.compararLongitud(cadena, frase);

        // Unir frases
        System.out.println("===============================");
        System.out.print("Ingrese otra frase para unir con la original: ");
        frase = leer.nextLine();
        servicio.unirFrases(cadena, frase);

        // Reemplazar letras
        System.out.println("===============================");
        System.out.print("Ingrese una letra para reemplazar en la frase: ");
        letra = leer.nextLine();
        System.out.print("Ingrese el caracter que reemplazará a la letra ingresada: ");
        String reemplazo = leer.nextLine();
        servicio.reemplazar(cadena, letra, reemplazo);

        // Comprobar si la frase contiene una letra
        System.out.println("===============================");
        System.out.print("Ingrese una letra para comprobar si la frase la contiene: ");
        letra = leer.nextLine();
        boolean contiene = servicio.contiene(cadena, letra);
        if (contiene) {
            System.out.println("La frase contiene la letra " + letra);
        } else {
            System.out.println("La frase NO contiene la letra " + letra);
            System.out.println("===============================");
        }
    }
}
