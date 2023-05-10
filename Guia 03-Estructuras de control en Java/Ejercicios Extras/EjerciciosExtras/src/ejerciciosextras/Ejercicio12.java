/*
Necesitamos mostrar un contador con 3 dígitos (X-X-X), que 
muestre los números del 0-0-0 al 9-9-9, con la particularidad 
que cada vez que aparezca un 3 lo sustituya por una E. 
Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
0-1-2
0-1-E
Nota: investigar función equals() y como convertir números a String.
 */
package ejerciciosextras;

/**
 *
 * @author TKBio
 */
public class Ejercicio12 {

    public static void main(String[] args) {
        String contador = "000";
        System.out.println(contador);
        for (int i = 1; i <= 1000; i++) {
            contador = String.format("%03d", i - 1);
            if (contador.charAt(0) == '3') {
                contador = "E" + contador.substring(1);
            }
            if (contador.charAt(1) == '3') {
                contador = contador.substring(0, 1) + "E" + contador.substring(2);
            }
            if (contador.charAt(2) == '3') {
                contador = contador.substring(0, 2) + "E";
            }
            System.out.println(contador.replace("", "-").substring(1));
        }
    }
}
