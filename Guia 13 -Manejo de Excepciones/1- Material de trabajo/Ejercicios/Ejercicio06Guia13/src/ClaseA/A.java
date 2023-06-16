/*
 *Dado el método metodoA de la clase A, indique:
a) ¿Qué sentencias y en qué orden se ejecutan si se produce la excepción 
MioException?
b) ¿Qué sentencias y en qué orden se ejecutan si no se produce la excepción
MioException?
 */
package ClaseA;

/**
 *
 * @author TKBio
 */
public class A {

    public void metodoA() {
        System.out.println("La \"sentencia_a1\" se ejecuta primero.");
        System.out.println("Luego, la \"sentencia_a2\".");
        try {
            System.out.println("El programa ingresa al bloque try.");
            System.out.println("Las \"sentencia_a3\" y \"sentencia_a4\" se ejecutan en orden.");
            // Simulamos la ocurrencia de la excepción MioException
             throw new MioException();
        } catch (MioException e){
            System.out.println("Se produce la excepción MioException y el programa salta al bloque catch.");
            System.out.println("Dentro del bloque catch, se ejecuta la \"sentencia_a6\".");
        } finally {
            System.out.println("Finalmente, el programa continúa con la \"sentencia_a5\".");
        }
    }
}