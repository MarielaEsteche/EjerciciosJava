package extra04;

import java.util.Arrays;

/**
 *
 * @author TKBio
 */
public class Main {

    public static void main(String[] args) {
        //Creamos una instancia de la clase cocina
        Cocina cocina = new Cocina();

        //Creamos algunas recetas y las agregamos a la lista de recetas
        Receta r1 = new Receta("\t -----------> ** Sopa de pollo ** <----------", Arrays.asList("pollo", "zanahoria", "apio", "cebolla"));
        Receta r2 = new Receta("\t -----------> ** Vainillas By Mel ** <-------", Arrays.asList("galletitas vainillas", "Flan", "duraznos"));

        cocina.agregarReceta(r1);
        cocina.agregarReceta(r2);

        //Buscamos una receta por nombre
        System.out.println("----------------------------------------------------------------");
        System.out.println("Recetas disponibles con : pollo, zanahoria, apio, cebolla");
        cocina.recetasDisponibles(Arrays.asList("pollo", "zanahoria", "apio", "cebolla")).forEach((receta) -> {
            System.out.println(receta.getNombre());
        });
        System.out.println("----------------------------------------------------------------");
        System.out.println("Recetas disponibles con : galletitas vainillas, Flan, duraznos");
        cocina.recetasDisponibles(Arrays.asList("galletitas vainillas", "Flan", "duraznos")).forEach((receta) -> {
            System.out.println(receta.getNombre());
        });
        System.out.println("----------------------------------------------------------------");
    }
}
