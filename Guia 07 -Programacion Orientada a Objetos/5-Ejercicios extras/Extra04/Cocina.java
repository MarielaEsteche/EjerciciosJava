/*
Crea una clase "Cocina" que tenga una lista de objetos 
"Receta". Luego, crea métodos para agregar nuevas recetas a 
la lista, para buscar una receta por nombre y para obtener 
la lista de recetas que se pueden preparar con los 
ingredientes disponibles en la cocina.
 */
package extra04;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author TKBio
 */
public class Cocina {

    //Intentare hacer una lista de objetos "Receta" con tres metodos:
    private List<Receta> recetas;

    public Cocina() {
        this.recetas = new ArrayList<>();
    }

    //Este metodo recibe una instancia de "Receta" y la pone en la lista de recetas de cocina:
    public void agregarReceta(Receta receta) {
        this.recetas.add(receta);
    }

    //Este metodo busca la receta que coincida con el nombre y devuelva "Receta" sino devuelve "null"
    public Receta buscarReceta(String nombre) {
        for (Receta receta : this.recetas) {
            if (receta.getNombre().equalsIgnoreCase(nombre)) {
                return receta;
            }
        }
        return null;
    }

    //Este metodo recibe los ingredientes disponibles de la cocina y devuelve una lista de lo que se puede preparar con ellos
    public List<Receta> recetasDisponibles(List<String> ingredientesDisponibles) {
        List<Receta> recetasDisponibles = new ArrayList<>();
        for (Receta receta : recetas) {
            if (receta.sePuedePrepararCon(ingredientesDisponibles)) {
                recetasDisponibles.add(receta);
            }
        }

        return recetasDisponibles;
    }
}
