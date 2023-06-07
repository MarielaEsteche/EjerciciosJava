/*
Recorrer un vector de N enteros contabilizando cuántos números 
son de 1 dígito, cuántos de 2 dígitos, etcétera 
(hasta 5 dígitos).
 */
package EjerciciosDeAprendizaje;

/**
 *
 * @author TKBio
 */
public class Ejercicio03 {

    public static void main(String[] args) {
        int[] numeros = {12, 345, 67, 8901, 23, 4567, 8, 9};
        int[] contador = new int[6]; // 0 posición no se usa, las otras representan los digitos

        for (int i = 0; i < numeros.length; i++) {
            int numDigitos = String.valueOf(numeros[i]).length();
            contador[numDigitos]++;
        }

        for (int i = 1; i <= 5; i++) {
            System.out.println("Cantidad de numeros de " + i + " digitos: " + contador[i]);
        }
    }
}
