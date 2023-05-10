/*
Programa Nespresso. Desarrolle una clase Cafetera en el paquete 
Entidades con los atributos capacidadMáxima (la cantidad máxima 
de café que puede contener la cafetera) y cantidadActual 
(la cantidad actual de café que hay en la cafetera). Agregar 
constructor vacío y con parámetros así como setters y getters. 
Crear clase CafeteraServicio en el paquete Servicios con los 
siguiente:
1-Método llenarCafetera(): hace que la cantidad actual sea 
igual a la capacidad máxima. 
2-Método servirTaza(int): se pide el tamaño de una taza vacía, 
el método recibe el tamaño de la taza y simula la acción de 
servir la taza con la capacidad indicada. Si la cantidad actual 
de café “no alcanza” para llenar la taza, se sirve lo que quede.
El método le informará al usuario si se llenó o no la taza, y de
no haberse llenado en cuanto quedó la taza.
3-Método vaciarCafetera(): pone la cantidad de café actual en 
cero. 
4-Método agregarCafe(int): se le pide al usuario una cantidad 
de café, el método lo recibe y se añade a la cafetera la 
cantidad de café indicada.

 */
package ejercicio02;

import javax.swing.JOptionPane;
import Servicios.CafeteraServicio;

/**
 *
 * @author TKBio
 */
public class Main {

    public static void main(String[] args) {
        CafeteraServicio cafeteraServicio = new CafeteraServicio();
        int opcion;
        do {
            String menu = " ---- Menu ----\n"
                    + "1. Llenar la cafetra\n"
                    + "2. Servir taza\n"
                    + "3. Vaciar la cafetera\n"
                    + "4. Agregar mas cafe\n"
                    + "5. Salir\n"
                    + "Por favor, ingrese una opcion:";
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, menu));
            switch (opcion) {
                case 1:
                    cafeteraServicio.llenarCafetera();
                    JOptionPane.showMessageDialog(null, "Su cafetera se ha llenado con " + cafeteraServicio.getCafetera().getCantidadActual() + " ml de cafe");
                    break;
                case 2:
                    int tamanoTaza = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el tamaño de la taza en ml: "));
                    cafeteraServicio.servirTaza(tamanoTaza);
                    JOptionPane.showMessageDialog(null, "La cantidad actual de café en la cafetera es de " + cafeteraServicio.getCafetera().getCantidadActual() + " ml");
                    break;
                case 3:
                    cafeteraServicio.vaciarCafetera();
                    JOptionPane.showMessageDialog(null, "La cafetera se ha vaciado.");
                    break;
                case 4:
                    int cantidadCafe = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de café en ml a agregar:"));
                    cafeteraServicio.agregarCafe(cantidadCafe);
                    JOptionPane.showMessageDialog(null, "La cantidad actual de cafe es de " + cafeteraServicio.getCafetera().getCantidadActual() + " ml");
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Gracias por elegir NesPresso");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida, por favor intente de nuevo.");
            }
        } while (opcion != 5);
    }
}
