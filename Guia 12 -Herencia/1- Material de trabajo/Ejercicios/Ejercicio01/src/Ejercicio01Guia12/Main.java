package Ejercicio01Guia12;

/**
 *
 * @author TKBio
 */
public class Main {
    // Luego de Heredar las clases Hija procedo a crear el main
    //solo copie lo que esta en la guia primero y en base a eso cree el codigo

    public static void main(String[] args) {
        // Declaración del objeto Perro
        Animal perro1 = new Perro("Stich", "carnívoro", 15, "Doberman");
        perro1.Alimentarse();

        // Declaración del otro objeto Perro
        Animal perro2 = new Perro("Teddy", "Croquetas", 10, "Chihuahua");
        perro2.Alimentarse();

        // Declaración del objeto Gato
        Animal gato1 = new Gato("Pelusa", "Galletas", 15, "Siames");
        gato1.Alimentarse();

        // Declaración del objeto Caballo
        Animal caballo1 = new Caballo("Spark", "Pasto", 25, "Fino");
        caballo1.Alimentarse();
    }
}
