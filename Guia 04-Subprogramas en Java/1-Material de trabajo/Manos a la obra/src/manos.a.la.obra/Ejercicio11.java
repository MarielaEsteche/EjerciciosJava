/*
Escribir un programa que procese una secuencia de caracteres 
ingresada por teclado y terminada en punto, y luego codifique la
palabra o frase ingresada de la siguiente manera: 
cada vocal se reemplaza por el carácter que se indica en la tabla
y el resto de los caracteres (incluyendo a las vocales acentuadas)
se mantienen sin cambios.
aeiou
@#$%*

Realice un subprograma que reciba una secuencia de caracteres y
retorne la codificación correspondiente. Utilice la estructura
“según” para la transformación. 
Por ejemplo, si el usuario ingresa:     
Ayer, lunes, salimos a las once y 10.La salida debería ser:
@y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.

 */
package manos.a.la.obra;

import java.util.Scanner;

/**
 *
 * @author TKBio
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa una palabra o frase para codificar: ");
        String palabra = leer.nextLine();
        String codificada = codificar(palabra);
        System.out.println("Palabra codificada: " + codificada);
    }

    public static String codificar(String palabra) {
        String codificada = "";
        for (char c : palabra.toCharArray()) {
            switch (c) {
                case 'a':
                    codificada += '@';
                    break;
                case 'e':
                    codificada += '#';
                    break;
                case 'i':
                    codificada += '$';
                    break;
                case 'o':
                    codificada += '%';
                    break;
                case 'u':
                    codificada += '*';
                    break;
                case 'A':
                    codificada += '@';
                    break;
                case 'E':
                    codificada += '#';
                    break;
                case 'I':
                    codificada += '$';
                    break;
                case 'O':
                    codificada += '%';
                    break;
                case 'U':
                    codificada += '*';
                    break;
                default:
                    codificada += c;
                    break;
            }
        }
        return codificada;
    }
}
