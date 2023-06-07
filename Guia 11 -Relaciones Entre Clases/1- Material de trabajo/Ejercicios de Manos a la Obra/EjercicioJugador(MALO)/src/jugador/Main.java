package jugador;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author TKBio
 */
public class Main {

    public static void main(String[] args) {
        //Crearemos los jugadores
        Jugador J1 = new Jugador("Lionel", "Messi", "Delantero", 10);
        Jugador J2 = new Jugador("Sergio", "Aguero", "Delantero", 9);
        Jugador J3 = new Jugador("Gonzalo", "Higuain", "Delantero", 11);
        Jugador J4 = new Jugador("Paulo", "Dybala", "Delantero", 21);
        Jugador J5 = new Jugador("Angel", "Di Maria", "Mediocampista", 7);
        Jugador J6 = new Jugador("Rodrigo", "De Paul", "Mediocampista", 16);
        Jugador J7 = new Jugador("Leandro", "Paredes", "Mediocampista", 5);
        Jugador J8 = new Jugador("Nicolas", "Tagliafico", "Defensor", 3);
        Jugador J9 = new Jugador("German", "Pezzella", "Defensor", 2);
        Jugador J10 = new Jugador("Juan", "Foyth", "Defensor", 17);
        Jugador J11 = new Jugador("Emiliano", "Martinez", "Arquero", 1);

        //Ahora los combertimos en Lista
        List<Jugador> LaSeleccion = new ArrayList<>();
        LaSeleccion.add(J9);
        LaSeleccion.add(J1);
        LaSeleccion.add(J2);
        LaSeleccion.add(J3);
        LaSeleccion.add(J4);
        LaSeleccion.add(J5);
        LaSeleccion.add(J6);
        LaSeleccion.add(J7);
        LaSeleccion.add(J8);
        LaSeleccion.add(J9);
        LaSeleccion.add(J10);
        LaSeleccion.add(J11);

        //Ahora lo mostramo por pantalla
        LaSeleccion.stream().map((jugador) -> {
            System.out.println("●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●");
            return jugador;
        }).map((jugador) -> {
            System.out.println("Nombre: " + jugador.getNombre());
            return jugador;
        }).map((jugador) -> {
            System.out.println("Apellido : " + jugador.getApellido());
            return jugador;
        }).map((jugador) -> {
            System.out.println("Posicion: " + jugador.getPosicion());
            return jugador;
        }).map((jugador) -> {
            System.out.println("Numero: " + jugador.getNumero());
            return jugador;
        }).forEachOrdered((_item) -> {
            System.out.println();
        });

    }
}
