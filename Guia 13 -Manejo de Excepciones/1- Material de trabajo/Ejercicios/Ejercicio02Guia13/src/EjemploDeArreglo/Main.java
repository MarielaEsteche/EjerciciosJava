/*
 * En este main se hace una instancia de "ArrayEjemplo" despúes se usa el metodo
 * stElemento para establecer valores del 0 al 4
 * Despues con un for se intentara acceder a los elementos del metodo getElemento
 * luego el bucle intenta acceder del 0 al 5 a un elemento fuera de rango
 * El resultado sera que se termina capturando "ArrayIndexOutOfBoundsException" mostrando
 * el error predefinido en el sout
 */
package EjemploDeArreglo;

/**
 *
 * @author TKBio
 */
public class Main {

    public static void main(String[] args) {
        //Creare una instancia de la clase ArrayEjemplo con un arreglo de 5
        ArrayEjemplo arrayEjemplo = new ArrayEjemplo(5);

        // Establecere valores en el arreglo
        arrayEjemplo.setElemento(0, 10);
        arrayEjemplo.setElemento(1, 20);
        arrayEjemplo.setElemento(2, 30);
        arrayEjemplo.setElemento(3, 40);
        arrayEjemplo.setElemento(4, 50);

        // Accedere a los elementos del arreglo
        for (int i = 0; i < 6; i++) {
            int elemento = arrayEjemplo.getElemento(i);
            System.out.println("Elemento " + i + ": " + elemento);
        }
    }
}
