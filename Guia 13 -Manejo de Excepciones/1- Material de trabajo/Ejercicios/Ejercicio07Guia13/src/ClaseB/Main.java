package ClaseB;

/**
 *
 * @author TKBio
 */
public class Main {

    public static void main(String[] args) {
        B objetoB = new B();
        System.out.println("///////////////////////////////////////////////////");
        System.out.println("a)////////// Si se produce la MioException: ///////");
        System.out.println("///////////////////////////////////////////////////\n");
        objetoB.metodoB();
        System.out.println("\n///////////////////////////////////////////////////");
        System.out.println("b)//////// Si NO se produce la MioException: //////");
        System.out.println("///////////////////////////////////////////////////\n");
        objetoB.metodoB();
        System.out.println();
    }
}
/*
SALIDA DEL PROGRAMA

run:
///////////////////////////////////////////////////
a)////////// Si se produce la MioException: ///////
///////////////////////////////////////////////////

La "sentencia_b1" se ejecuta primero.
El programa ingresa al bloque try.
La "sentencia_b2" se ejecuta.
Se produce la excepción MioException y el programa salta al bloque catch.
Dentro del bloque catch, se ejecuta la "sentencia_b3".
Finalmente, se ejecuta el bloque finally y se ejecuta la sentencia "sentencia_b4".

///////////////////////////////////////////////////
b)//////// Si NO se produce la MioException: //////
///////////////////////////////////////////////////

La "sentencia_b1" se ejecuta primero.
El programa ingresa al bloque try.
La "sentencia_b2" se ejecuta.
Se produce la excepción MioException y el programa salta al bloque catch.
Dentro del bloque catch, se ejecuta la "sentencia_b3".
Finalmente, se ejecuta el bloque finally y se ejecuta la sentencia "sentencia_b4".

BUILD SUCCESSFUL (total time: 0 seconds)

*/