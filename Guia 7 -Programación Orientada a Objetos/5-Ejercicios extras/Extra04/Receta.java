package extra04;

import java.util.List;

/**
 *
 * @author TKBio
 */
class Receta {

    private String nombre;
    private List<String> ingredientes;

    public Receta(String nombre, List<String> ingredientes) {
        this.nombre = nombre;
        this.ingredientes = ingredientes;
    }

    public String getNombre() {
        return nombre;

    }

    public boolean sePuedePrepararCon(List<String> ingredientesDisponibles) {
        return ingredientesDisponibles.containsAll(this.ingredientes);
    }
}
