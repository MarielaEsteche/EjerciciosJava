/*
Realiza un programa en donde exista una clase Jugador que 
contenga nombre, apellido, posición y número. 
Luego otra clase Equipo que contenga una colección de jugadores. 
Una vez hecho esto, desde el main recorreremos el equipo 
mostrando la información de cada jugador.
 */
package jugador;

/**
 *
 * @author TKBio
 */
public class Jugador {

    private String Nombre;
    private String Apellido;
    private String Posicion;
    private int numero;

    public Jugador(String Nombre, String Apellido, String Posicion, int numero) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Posicion = Posicion;
        this.numero = numero;

    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public String getPosicion() {
        return Posicion;
    }

    public int getNumero() {
        return numero;
    }

}
