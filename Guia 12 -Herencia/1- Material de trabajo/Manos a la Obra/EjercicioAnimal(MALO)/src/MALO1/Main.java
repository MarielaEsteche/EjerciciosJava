package MALO1;

import java.util.ArrayList;

/**
 *
 * @author TKBio
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<Animal> animales = new ArrayList<>();

        Animal QueHabla = new Animal();
        Animal perro = new Perro();
        Animal gato = new Gato();

        animales.add(QueHabla);
        animales.add(perro);
        animales.add(gato);

        animales.forEach((animal) -> {
            System.out.println(animal.hacerRuido());
        });
    }

}
