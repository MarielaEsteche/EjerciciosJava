package Servicios;

import Entidades.Cafetera;
import javax.swing.JOptionPane;

/**
 *
 * @author TKBio
 */
public class CafeteraServicio {

    private Cafetera cafetera;
    //hace que la cantidad actual sea igual a la capacidad máxima. 

    public CafeteraServicio() {
        this.cafetera = new Cafetera();
    }

    public CafeteraServicio(int capacidadMaxima, int cantidadActual) {
        this.cafetera = new Cafetera(capacidadMaxima, cantidadActual);
    }

    public Cafetera getCafetera() {
        return cafetera;
    }

    public void setCafetera(Cafetera cafetera) {
        this.cafetera = cafetera;
    }

    public void llenarCafetera() {
        this.cafetera.setCantidadActual(this.cafetera.getCapacidadMaxima());
    }

    //se pide el tamaño de una taza vacía, el método recibe el tamaño
    //de la taza y simula la acción de servir la taza con la capacidad
    //indicada. Si la cantidad actual de café “no alcanza” para llenar
    //la taza, se sirve lo que quede.
    //El método le informará al usuario si se llenó o no la taza, y de
    //no haberse llenado en cuanto quedó la taza.
    public void servirTaza(int tamanioTaza) {
        if (cafetera.getCantidadActual() >= tamanioTaza) {
            cafetera.setCantidadActual(cafetera.getCantidadActual() - tamanioTaza);
            JOptionPane.showMessageDialog(null, "Ud sirvio " + tamanioTaza + "ml de cafe.");
        } else {
            int cantidadServida = cafetera.getCantidadActual();
            cafetera.setCantidadActual(0);
            JOptionPane.showMessageDialog(null, "El cafe en la maquina no alcanza, se han servido " + cantidadServida + "ml de cafe. ");
        }
    }

    //pone la cantidad de café actual en cero. 
    public void vaciarCafetera() {
        this.cafetera.setCantidadActual(0);
    }

    //se le pide al usuario una cantidad de café, el método lo recibe
    //y se añade a la cafetera la cantidad de café indicada.
    public void agregarCafe(int cantidadCafe) {
        int cantidadTotal = cafetera.getCantidadActual() + cantidadCafe;
        if (cantidadTotal <= cafetera.getCapacidadMaxima()) {
            cafetera.setCantidadActual(cantidadTotal);
        } else {
            cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
            JOptionPane.showMessageDialog(null, "No se puede superar la capacidad maxima, la cafetera se ha llenado con " + cafetera.getCapacidadMaxima() + " ml de café.");
        }
    }
}
