/*
Clase Jugador: esta clase posee los siguientes atributos: 
id (representa el número del jugador)
nombre (Empezara con Jugador más su ID, “Jugador 1” por ejemplo)
mojado (indica si está mojado o no el jugador).
El número de jugadores será decidido por el usuario, pero
debe ser entre 1 y 6. 
Si no está en este rango, por defecto será 6.
Métodos:
• disparo(Revolver r): el método, recibe el revolver de agua y
llama a los métodos de mojar() y siguienteChorro() de Revolver.
El jugador se apunta, aprieta el gatillo y si el
revolver tira el agua, el jugador se moja. 
El atributo mojado pasa a false y el método devuelve true, sino
false.
 */
package RuletaDeAgua;

/**
 *
 * @author TKBio
 */
public class Jugador {

    private int id;
    private String nombre;
    private boolean mojado;

    public Jugador(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.mojado = false;

    }

    public boolean disparo(RevolverDeAgua r) {
        r.siguienteChorro();
        if (r.mojar()) {
            this.mojado = true;
            return true;
        } else {
            return false;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public boolean estaMojado() {
        return this.mojado;
    }
}
