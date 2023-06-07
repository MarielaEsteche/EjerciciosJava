/*
Ejercicio 7
Considera que estás desarrollando una web para una empresa 
que fabrica motores (suponemos que se trata del tipo de motor 
de una bomba para mover fluidos). 
Definir una variable tipoMotor y permitir que el usuario 
ingrese un valor entre 1 y 4. 
El programa debe mostrar lo siguiente:
*Si el tipo de motor es 1, 
mostrar un mensaje indicando “La bomba es una bomba de agua”.
*Si el tipo de motor es 2, 
mostrar “La bomba es una bomba de gasolina”.
*Si el tipo de motor es 3, 
mostrar “La bomba es una bomba de hormigón”.
*Si el tipo de motor es 4, 
mostrar“La bomba es una bomba de pasta alimenticia”.
*Si no se cumple ninguno de los valores anteriores 
mostrar “No existe un valor válido para tipo de bomba”
 */
package ManosALaObra;

import java.util.Scanner;

/**
 *
 * @author TKBio
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        System.out.println("Que numero de motor del 1 al 4 necesita?");
        int tipoMotor = Leer.nextInt();
        switch (tipoMotor) {
            case 1:
                System.out.println("La bomba es una bomba de agua");
                break;
            case 2:
                System.out.println("La bomba es una bomba de gasolina");
                break;
            case 3:
                System.out.println("La bomba es una bomba de hormigon");
                break;
            case 4:
                System.out.println("La bomba es una bomba de pasta alimenticia");
                break;
            default:
                System.out.println("No existe un valor valido para el tipo de bomba");
        }
    }
}
