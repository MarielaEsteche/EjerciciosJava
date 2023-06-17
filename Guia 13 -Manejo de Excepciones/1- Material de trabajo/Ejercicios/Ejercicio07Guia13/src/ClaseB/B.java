/*
Dado el método metodoB de la clase B, indique:
a) ¿Qué sentencias y en qué orden se ejecutan si se produce la excepción MioException?
b) ¿Qué sentencias y en qué orden se ejecutan si no se produce la excepción MioException?
 */
package ClaseB;

/**
 *
 * @author TKBio
 */
public class B {

    public void metodoB() {
        System.out.println("La \"sentencia_b1\" se ejecuta primero.");
        try {
            System.out.println("El programa ingresa al bloque try.");
            System.out.println("La \"sentencia_b2\" se ejecuta.");
            throw new MioException(); // Simulamos la ocurrencia de la excepción MioException
        } catch (MioException e) {
            System.out.println("Se produce la excepción MioException y el programa salta al bloque catch.");
            System.out.println("Dentro del bloque catch, se ejecuta la \"sentencia_b3\".");
        } finally {
            System.out.println("Finalmente, se ejecuta el bloque finally y se ejecuta la sentencia \"sentencia_b4\".");
        }
    }
}
