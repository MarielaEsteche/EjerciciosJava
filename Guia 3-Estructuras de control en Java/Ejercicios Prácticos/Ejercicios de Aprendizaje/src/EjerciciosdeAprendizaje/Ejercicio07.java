/*
Realizar un programa que simule el funcionamiento de un dispositivo
RS232, este tipo de dispositivo lee cadenas enviadas por el usuario
Las cadenas deben llegar con un formato fijo: tienen que ser de 
un máximo de 5 caracteres de largo, el primer carácter tiene que 
ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran 
correctas, la secuencia especial “&&&&&” marca el final de los 
envíos (llamémosla FDE), y toda secuencia distinta de FDE, que no
respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la 
cantidad de lecturas correctas e incorrectas recibidas. 
Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().
 */
package Ejercicios.de.aprendizaje;

import java.util.Scanner;

/**
 *
 * @author TKBio
 */
public class Ejercicio07 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int secCorr = 0;
        int secInco = 0;
        String ultimaCad = "";
        boolean FDE = false;

        while (!FDE) {
            System.out.println("Ingrese una cadena de caracteres de 5 digitos con x al principio y O al final: ");
            ultimaCad = leer.next().toUpperCase();

            if (ultimaCad.equals("&&&&&")) {
                FDE = true;
            } else if (ultimaCad.length() == 5 && ultimaCad.charAt(0) == 'X' && ultimaCad.charAt(4) == 'O') {
                secCorr++;
            } else {
                secInco++;
            }
        }
        System.out.println("Secuencia Correcta :" + secCorr);
        System.out.println("Secuencia Incorrecta: " + secInco);
    }
}
