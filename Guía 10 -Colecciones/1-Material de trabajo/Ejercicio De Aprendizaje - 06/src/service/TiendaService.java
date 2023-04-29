package service;

import entidades.Tienda;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author TKBio
 */
public class TiendaService {

    private Map<String, Double> productos;

    public TiendaService() {
        productos = new HashMap<>();
    }

    public void agregarProducto(Tienda producto) {
        productos.put(producto.getNombre(), producto.getPrecio());
    }

    public void modificarPrecio(String nombreProducto, double nuevoPrecio) {
        if (productos.containsKey(nombreProducto)) {
            productos.put(nombreProducto, nuevoPrecio);
        } else {
            System.out.println("Este producto no existe en la tienda");
        }
    }

    public void eliminarProducto(String nombreProducto) {
        if (productos.containsKey(nombreProducto)) {
            productos.remove(nombreProducto);
        } else {
            System.out.println("Este producto no existe en la tienda");
        }
    }

    public void mostrarProductos() {
        productos.entrySet().forEach((entry) -> {
            System.out.println("Producto : " + entry.getKey()); 
            System.out.println("Precio : " + entry.getValue());
            System.out.println();
        });
    }
}
