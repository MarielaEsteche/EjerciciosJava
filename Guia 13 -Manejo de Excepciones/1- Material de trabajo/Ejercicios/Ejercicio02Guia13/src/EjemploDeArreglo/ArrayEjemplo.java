/*
 * Definir una Clase que contenga algún tipo de dato de tipo array y agregue el
 * código para generar y capturar una excepción "ArrayIndexOutOfBoundsException"
 * (índice de arreglo fuera de rango).
 */
package EjemploDeArreglo;

/**
 *
 * @author TKBio
 */
//En este ejemplo, la clase "ArrayEjemplo" tiene un constructor que recibe el 
//tamaño del arreglo y lo inicializa
public class ArrayEjemplo {

    private int[] array;

    public ArrayEjemplo(int size) {
        array = new int[size];
    }
    //Creo un metodo que establece el valor de un elemento del arreglo en la 
    //posicion generada por "index" dentro del "try", luego se intentara asignar
    //el valor correspondiente al elemento. Si el indice esta fuera del rango 
    //del arreglo, inicia la excepcion"ArrayIndexOutOfBoundsExeption" que sera
    //Capturada por "catch" mostreando el msj de error

    public void setElemento(int index, int value) {
        try {
            array[index] = value;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ERROR!! indice de arreglo fuera de rango");
        }
    }

    //Creare otro metodo que obtiene el valor de un elemento del arreglo como
    //el metodo anterior, una vez lanzada la excepcion se muestra un erro y se
    //muestra el valor predeterminado( en este caso -1)
    public int getElemento(int index) {
        try {
            return array[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ERROR!! indice de arreglo fuera de rango");
            return -1;
        }
    }

}
