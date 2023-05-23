/*
 Clase Revolver de agua: esta clase posee los siguientes atributos:
posición actual (posición del tambor que se dispara, puede que esté el agua o no)
posición agua (la posición del tambor donde se encuentra el agua).
Estas dos posiciones, se generarán aleatoriamente.
Métodos:
• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
deben ser aleatorios.
• mojar(): devuelve true si la posición del agua coincide con la posición actual
• siguienteChorro(): cambia a la siguiente posición del tambor
• toString(): muestra información del revolver (posición actual y donde está el agua)
 */
package RuletaDeAgua;

import java.util.Random;

/**
 *
 * @author TKBio
 */
public class RevolverDeAgua {

    private int posicionActual;
    private int posicionAgua;

    public void llenarRevolver() {
        Random rand = new Random();
        this.posicionActual = rand.nextInt(6);
        this.posicionAgua = rand.nextInt(6);
    }

    public boolean mojar() {
        return this.posicionActual == this.posicionAgua;
    }

    public void siguienteChorro() {
        this.posicionActual = (this.posicionActual + 1) % 6;
    }

    @Override
    public String toString() {
        return "Posicion actual : " + this.posicionActual + ", posicion del agua: " + this.posicionAgua;
    }
}
