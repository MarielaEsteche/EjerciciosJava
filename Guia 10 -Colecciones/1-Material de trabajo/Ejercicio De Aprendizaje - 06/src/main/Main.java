package main;

import entidades.Tienda;
import java.util.Scanner;
import service.TiendaService;

/**
 *
 * @author TKBio
 */
public class Main {

    public static void main(String[] args) {
        TiendaService DrInkTattoO = new TiendaService();
        try (Scanner leer = new Scanner(System.in)) {
            int opcion;
            do {
                System.out.println("========== *** Bienvenidos a DrInk TattoO *** ==========");
                System.out.println("1. Agregar producto");
                System.out.println("2. Modificar precio de un producto");
                System.out.println("3. Eliminar producto");
                System.out.println("4. Mostrar productos");
                System.out.println("5. Salir");
                System.out.println("========================================================");
                System.out.print("Ingrese una opción: ");
                opcion = leer.nextInt();
                System.out.println("--------------------------------------------------------");

                switch (opcion) {
                    case 1:
                        leer.nextLine();
                        System.out.print("Ingrese el nombre del producto : ");
                        String nombreProducto = leer.nextLine();
                        System.out.print("Ingrese el precio del producto : ");
                        double precioProducto = leer.nextDouble();
                        Tienda nuevoProducto = new Tienda(nombreProducto, precioProducto);
                        DrInkTattoO.agregarProducto(nuevoProducto);
                        System.out.println("Tu producto fue agregado con exito!!");
                        break;
                    case 2:
                        System.out.print("Ingrese el nombre del producto para cambiarle el precio: ");
                        nombreProducto = leer.next();
                        System.out.print("Ingrese el nuevo precio del producto ingresado : ");
                        double nuevoPrecio = leer.nextDouble();
                        DrInkTattoO.modificarPrecio(nombreProducto, nuevoPrecio);
                        System.out.println("El precio se modifico con exito");
                        break;
                    case 3:
                        System.out.print("Ingrese el nombre del producto a eliminar: ");
                        nombreProducto = leer.next();
                        DrInkTattoO.eliminarProducto(nombreProducto);
                        System.out.println("El producto se elimino exitosamente");
                        break;
                    case 4:
                        DrInkTattoO.mostrarProductos();
                        break;
                    case 5:
                        System.out.println("============ GRACIAS POR SU VISITA ============");
                        break;
                    default:
                        System.out.println("Ingrese una opcion valida");
                        break;
                }
            } while (opcion != 5);
        }
    }
}
