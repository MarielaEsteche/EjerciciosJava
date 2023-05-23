package Adopcion;

/**
 *
 * @author TKBio
 */
public class Main {

    public static void main(String[] args) {

        Gato G1 = new Gato("Copo", "Angora Turco", 4, "Grande");
        Gato G2 = new Gato("Norah", "Siberiano", 5, "Mediano");
        Gato G3 = new Gato("Lenore", "Azul Ruso", 9, "Grande");
        Gato G4 = new Gato("Moon", "Mixta", 1 , "Meses");

        Persona P1 = new Persona("Mel", "Esteche", 40, 12345678);
        Persona P2 = new Persona("Maria", "Gomez", 24, 23456789);

        P1.adoptarGato(G3);
        P1.adoptarGato(G2);
        P2.adoptarGato(G1);
        P2.adoptarGato(G4);
        

        System.out.println("--------------- DATOS DE LA PERSONA ---------------");
        System.out.println(P1.getInfoPersona());
        System.out.println("--------------- DATOS DE LA PERSONA ---------------");
        System.out.println(P2.getInfoPersona());
    }
}
