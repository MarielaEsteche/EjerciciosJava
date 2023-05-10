package service;

import entidades.Pais;
import java.util.*;

/**
 *
 * @author TKBio
 */
public class PaisService {

    private Set<Pais> paises;

    public PaisService() {
        paises = new HashSet<>();
    }

    public void preguntarPais() {
        Scanner leer = new Scanner(System.in);
        String pais;
        System.out.println("================= LISTA DE PAISES =================");
        do {
            System.out.print("Ingresa un pais: ");
            pais = leer.nextLine();

            guardarPais(pais);

            System.out.print("¿Queres guardar otro pais? (S/N) : ");
            String respuesta = leer.nextLine();

            if (!respuesta.equalsIgnoreCase("s")) {
                break;
            }
        } while (true);

        mostrarPaises();
        paisesOrdenados();
        eliminarPais();

    }

    private void guardarPais(String nombre) {
        Pais nombrePais = new Pais(nombre);
        paises.add(nombrePais);
    }

    public void mostrarPaises() {
        System.out.println("============ ESTOS SON LOS PAISES LISTADOS ============");
        paises.forEach((nombrePais) -> {
            System.out.println(nombrePais.getNombre());
        });
    }

    public void paisesOrdenados() {
        List<Pais> paisesOrdenados = new ArrayList<>(paises);
        Collections.sort(paisesOrdenados, Comparator.comparing(Pais::getNombre));

        System.out.println("=========== PAISES ORDENADOS ALFABETICAMENTE ===========");
        paisesOrdenados.forEach((nombrePais) -> {
            System.out.println(nombrePais.getNombre());
        });
    }

    public void eliminarPais() {
        Scanner leer = new Scanner(System.in);
        System.out.println("--------------------------------------------------------");
        System.out.print("¿Que pais queres eliminar? ");
        String nombre = leer.nextLine();

        Iterator<Pais> iterator = paises.iterator();
        boolean encontrado = false;

        while (iterator.hasNext()) {
            Pais nombrePais = iterator.next();
            if (nombrePais.getNombre().equalsIgnoreCase(nombre));
            iterator.remove();
            encontrado = true;
            break;
        }

        if (encontrado) {
            System.out.println("--------------------------------------------------------");
            System.out.println("[" + nombre + "] FUE ELIMINADO!!");
        } else {
            System.out.println("El pais que elegiste no se encuentra en la lista!");
        }
        mostrarPaises();
        System.out.println();
    }

}
