package service;
/*
importaciones necesarias que fui agregando para que todo funcione
*/
import java.util.ArrayList;
import java.util.List;
import entidades.Ahorcado;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author TKBio(Meriela Esteche)
 */
public class AhorcadoService {
    /*
     Declaración de la clase AhorcadoService, que tiene los métodos que manejan la lógica del juego.
    */
    private Ahorcado ahorcado;
    private List<Character> letrasAdivinadas;
    /*
    El constructor inicializa la instancia de Ahorcado y la lista de letras adivinadas.
    */
    public AhorcadoService(Ahorcado ahorcado) {
        this.ahorcado = ahorcado;
        this.letrasAdivinadas = new ArrayList<>();
    }
    /*
    Este metodo recibe una letra y comprueba si ya fue adivinada. 
    Si la letra no fue adivinada antes, la agrega a una lista de letras 
    adivinadas. 
    Si la letra no esta en la palabra, se decrementa el número de intentos 
    restantes.
    */
    public void adivinarLetra(char letra) {
        if (letrasAdivinadas.contains(letra)) {
            return;
        }
        letrasAdivinadas.add(letra);
        if (!ahorcado.getPalabra().contains(String.valueOf(letra))) {
            ahorcado.setIntentosRealizados(ahorcado.getIntentosRealizados() - 1);
        }
    }
    /*
     Este metodo verifica si el número de intentos restantes es menor que el 
    número de intentos permitidos.Si es así, devuelve verdadero. 
    De lo contrario, se comprueba si todas las letras de la palabra fueron 
    adivinadas y devuelve verdadero si es el caso, si no devuelve falso.
    */
    public boolean esJuegoTerminado() {
        if (ahorcado.getIntentosRealizados() >= ahorcado.getIntentosPermitidos()) {
            return true;
        }

        for (char letra : ahorcado.getPalabra().toCharArray()) {
            if (!letrasAdivinadas.contains(letra)) {
                return false;
            }
        }
        return true;
    }
    /*
     Este método dibuja el muñeco del ahorcado con la horca y muestra la palabra
    oculta, utilizando el método ocultarPalabra().
    */
    public void mostrarEstadoJuego() {
        System.out.println("================================");
        int intentosRestantes;
        intentosRestantes = ahorcado.getIntentosPermitidos() - ahorcado.getIntentosRealizados();
        System.out.println("\n|########|");
        if (ahorcado.getIntentosRealizados() >= 7) {
            System.out.println("|      _███_");
            System.out.println("|      (×̯ ×̯)");
            System.out.println("|       ᴿᴵᴾ ");
            System.out.println("|       /|\\");
            System.out.println("|       / \\");
        } else if (ahorcado.getIntentosRealizados() >= 6) {
            System.out.println("|      _███_");
            System.out.println("|      (°ᴗ°)");
            System.out.println("|       /|\\");
            System.out.println("|       / \\");
        } else if (ahorcado.getIntentosRealizados() >= 5) {
            System.out.println("|      _███_");
            System.out.println("|      (°ᴗ°)");
            System.out.println("|       /|\\");
            System.out.println("|       /   ");
        } else if (ahorcado.getIntentosRealizados() >= 4) {
            System.out.println("|      _███_");
            System.out.println("|      (°ᴗ°)");
            System.out.println("|       /|\\");
            System.out.println("|           ");
        } else if (ahorcado.getIntentosRealizados() >= 3) {
            System.out.println("|      _███_");
            System.out.println("|      (°ᴗ°)");
            System.out.println("|       /|  ");
            System.out.println("|           ");
        } else if (ahorcado.getIntentosRealizados() >= 2) {
            System.out.println("|      _███_");
            System.out.println("|      (°ᴗ°)");
            System.out.println("|       /   ");
            System.out.println("|           ");
        } else if (ahorcado.getIntentosRealizados() >= 1) {
            System.out.println("|      _███_");
            System.out.println("|      (°ᴗ°)");
            System.out.println("|           ");
            System.out.println("|           ");
        } else {
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
        }

        System.out.println("######");
        System.out.println("================================");

        System.out.println("\t " + ocultarPalabra());
        System.out.println("================================");
    }
    /*
     Este método devuelve una cadena que representa la palabra con las letras 
    adivinadas visibles y el resto oculto con guiones.
    */
    private String ocultarPalabra() {
        StringBuilder palabraOculta = new StringBuilder();
        for (char letra : ahorcado.getPalabra().toCharArray()) {
            if (letrasAdivinadas.contains(letra)) {
                palabraOculta.append(letra);
            } else {
                palabraOculta.append("-");
            }
        }
        return palabraOculta.toString();
    }
    private static List<String> palCreadasXRam = Arrays.asList("LIBRERIA", "COMPUTADORA", "FRAMEWORK", "MICROPROCESADOR", "APLICACION", "JOPTIONPANE", "PROGRAMACION", "PROCEDIMIENTO", "SOFTWARE", "DESARROLLADOR", "CONCATENACION");
    /*
    Este seria el Main, que crea una instancia de AhorcadoService y un objeto de
    Scanner para leer las entradas del usuario. El juego continúa hasta que se 
    completa o se pierde.
    */
    public static void main(String[] args) {
        Random palAleatoria = new Random();
        String palabra = palCreadasXRam.get(palAleatoria.nextInt(palCreadasXRam.size()));
        Ahorcado ahorcado = new Ahorcado(palabra, 7);
        AhorcadoService service = new AhorcadoService(ahorcado);

        Scanner leer = new Scanner(System.in);
        while (!service.esJuegoTerminado()) {
            service.mostrarEstadoJuego();
            System.out.println("Te quedan " + (ahorcado.getIntentosPermitidos() - service.ahorcado.getIntentosRealizados()) + " intentos.");
            System.out.print("Adivina una letra: ");
            String entrada = leer.nextLine();
            if (entrada.length() != 1) {
                System.out.println("No te pases! pone solo 1 letra");
                continue;
            }
            char letra = entrada.toUpperCase().charAt(0);
            if (!Character.isLetter(letra)) {
                System.out.println("Decime una letra");
                continue;
            } else if (!ahorcado.getPalabra().contains(String.valueOf(letra))) {
                System.out.println("Mno, no es esa Letra, ingresa otra");
                ahorcado.setIntentosRealizados(ahorcado.getIntentosRealizados() + 1);
                continue;
            }
            service.adivinarLetra(letra);
        }
        service.mostrarEstadoJuego();
        if (service.ocultarPalabra().equals(ahorcado.getPalabra())) {
            System.out.println("▄▀▄▀▄ᶠᵉˡⁱᶜⁱᵈᵃᵈᵉˢ, ᴳᵃⁿᵃˢᵗᵉ!!▀▄▀▄▀");
            System.out.println("================================");
        } else {
            System.out.println("La palabra correcta era " + ahorcado.getPalabra() + " Segui participando!");
            System.out.println("================================");
        }
    }
}
