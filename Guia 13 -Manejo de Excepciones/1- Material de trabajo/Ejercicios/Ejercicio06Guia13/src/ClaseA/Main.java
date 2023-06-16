package ClaseA;

/**
 *
 * @author TKBio
 */
public class Main {

    public static void main(String[] args) {
        A objetoA = new A();
        System.out.println("///////////////////////////////////////////////////");
        System.out.println("a)////////// Si se produce la MioException: ///////");
        System.out.println("///////////////////////////////////////////////////\n");
        objetoA.metodoA();
        System.out.println("\n///////////////////////////////////////////////////");
        System.out.println("b)//////// Si NO se produce la MioException: //////");
        System.out.println("///////////////////////////////////////////////////\n");
        objetoA.metodoA();
        System.out.println();
    }
}

/*
esto es el run del programa

///////////////////////////////////////////////////
a)////////// Si se produce la MioException: ///////
///////////////////////////////////////////////////

La "sentencia_a1" se ejecuta primero.
Luego, la "sentencia_a2".
El programa ingresa al bloque try.
Las "sentencia_a3" y "sentencia_a4" se ejecutan en orden.
Se produce la excepción MioException y el programa salta al bloque catch.
Dentro del bloque catch, se ejecuta la "sentencia_a6".
Finalmente, el programa continúa con la "sentencia_a5".

///////////////////////////////////////////////////
b)//////// Si NO se produce la MioException: //////
///////////////////////////////////////////////////

La "sentencia_a1" se ejecuta primero.
Luego, la "sentencia_a2".
El programa ingresa al bloque try.
Las "sentencia_a3" y "sentencia_a4" se ejecutan en orden.
Se produce la excepción MioException y el programa salta al bloque catch.
Dentro del bloque catch, se ejecuta la "sentencia_a6".
Finalmente, el programa continúa con la "sentencia_a5".



 */
