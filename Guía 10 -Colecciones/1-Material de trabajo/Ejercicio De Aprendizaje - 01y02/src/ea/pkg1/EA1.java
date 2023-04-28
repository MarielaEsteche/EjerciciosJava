/*
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.
 */
package ea.pkg1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author TKBio
 */
public class EA1 {

    public static void main(String[] args) {
        // Creamos el ArrayList

        ArrayList<String> razasPerros = new ArrayList<>();
        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);
        String razaPerro;
        System.out.println("================ Razas de Perros ===============");
        do {

            System.out.println("Ingresa una raza de perro (o 'ok' para terminar): ");
            System.out.println("--------------------------------------------------");
            razaPerro = sc.nextLine();
            // Si el usuario no desea salir, agregamos la raza al ArrayList
            if (!razaPerro.equalsIgnoreCase("ok")) {
                razasPerros.add(razaPerro);
                System.out.println("-------------------------------------");
                System.out.println("Raza de perro agregada.");
                System.out.println("-------------------------------------");
            }
            // Repetimos el ciclo mientras el usuario no escriba "salir"
        } while (!razaPerro.equalsIgnoreCase("ok"));
        // Iteramos el ArrayList para mostrar las razas guardadas
        System.out.println("____________________________");
        System.out.println("\nRazas de perros guardadas: ");
        System.out.println("____________________________");
        razasPerros.forEach((raza) -> {
            System.out.println(raza);
            System.out.println("________________________");
        });
        System.out.println("\nIngresa una raza de perro para eliminar:      ");
        String razaEliminar = sc.nextLine();

        /* Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
            un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
            está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
            ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
            la lista ordenada.
         */
        // Creamos un Iterator para recorrer el ArrayList
        Iterator<String> it = razasPerros.iterator();
        boolean encontrado = false;
        // Recorremos el ArrayList
        while (it.hasNext()) {
            String raza = it.next();
            // Si encontramos la raza de perro ingresada por el usuario
            if (raza.equalsIgnoreCase(razaEliminar)) {
                // La eliminamos utilizando el método remove() del Iterator
                it.remove();
                encontrado = true;
                break;
            }
        }
        // Si se encontró y eliminó la raza de perro
        if (encontrado) {
            System.out.println("---------------------------------------------------");
            System.out.println("La raza de perro ( " + razaEliminar + " ) ha sido eliminada.");
            // Si no se encontró la raza de perro
        } else {
            System.out.println("---------------------------------------------------");
            System.out.println("La raza de perro ( " + razaEliminar + " ) no está en la lista.");
        }
        System.out.println("---------------------------------------------------------");
        System.out.println("\nRazas de perros guardadas (ordenadas alfabéticamente): ");
        System.out.println("---------------------------------------------------------");
        // Ordenamos la lista alfabéticamente
        Collections.sort(razasPerros);
        // Iteramos el ArrayList para mostrar las razas guardadas
        razasPerros.forEach((raza) -> {
            System.out.println(raza);
        });
    }
}
