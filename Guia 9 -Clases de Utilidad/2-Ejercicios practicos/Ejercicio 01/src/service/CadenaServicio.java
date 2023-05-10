/*
Crear una clase CadenaServicio en el paquete servicios que 
implemente los siguientes métodos:
*Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase ingresada.
*Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
*Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
*Método compararLongitud(String frase), deberá comparar la longitud de la frase que compone la clase con otra nueva frase ingresada por el usuario.
*Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con una nueva frase ingresada por el usuario y mostrar la frase resultante.
*Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la frase resultante.
*Método contiene(String letra), deberá comprobar si la frase contiene una letra que ingresa el usuario y devuelve verdadero si la contiene y falso si no
 */
package service;

import entidades.Cadena;

/**
 *
 * @author TKBio
 */
public class CadenaServicio {

    public void mostrarVocales(Cadena cadena) {
        //voy a obtener la frase de cadena y la pongo en minusculas
        String frase = cadena.getFrase().toLowerCase();
        int contador = 0;
        //Con este for recorro cada caracter de la frase
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            //aca voy aumentando un contador por cada vocal
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contador++;
            }
        }
        //Aca muestro la cantidad de vocales que se encontraron en la frase
        System.out.println("-------------------------------");
        System.out.println("La frase tiene " + contador + " vocales.");
    }

    public void invertirFrase(Cadena cadena) {
        String frase = cadena.getFrase();
        StringBuilder sb = new StringBuilder(frase);
        System.out.println("-------------------------------");
        System.out.println("La frase invertida es: " + sb.reverse().toString());
    }

    public void vecesRepetido(Cadena cadena, String letra) {
        String frase = cadena.getFrase().toLowerCase();
        char ch = letra.toLowerCase().charAt(0);
        int count = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == ch) {
                count++;
            }
        }
        System.out.println("-------------------------------");
        System.out.println("El carácter '" + letra + "' se repite " + count + " veces.");
    }

    public void compararLongitud(Cadena cadena, String frase) {
        if (cadena.getLongitud() == frase.length()) {
            System.out.println("Las frases tienen la misma longitud.");
        } else if (cadena.getLongitud() > frase.length()) {
            System.out.println("La frase ingresada es más corta que la frase contenida en la clase.");
        } else {
            System.out.println("La frase ingresada es más larga que la frase contenida en la clase.");
        }
    }

    public void unirFrases(Cadena cadena, String frase) {
        System.out.println("La frase resultante es: " + cadena.getFrase() + " " + frase);
    }

    public void reemplazar(Cadena cadena, String letra, String reemplazo) {
        String frase = cadena.getFrase().replace(letra, reemplazo);
        System.out.println("-------------------------------");
        System.out.println("La frase resultante es: " + frase);
    }

    public boolean contiene(Cadena cadena, String letra) {
        return cadena.getFrase().toLowerCase().contains(letra.toLowerCase());
    }
}
