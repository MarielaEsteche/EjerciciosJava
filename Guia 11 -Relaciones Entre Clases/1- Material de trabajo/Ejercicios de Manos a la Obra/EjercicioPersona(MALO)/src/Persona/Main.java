package Persona;

/**
 *
 * @author TKBio
 */
public class Main {

    public static void main(String[] args) {
        DNI D1 = new DNI('A', 4282336);
        Persona P1 = new Persona("Pepe", "Argento", D1);

        System.out.println("Nombre: " + P1.getNombre());
        System.out.println("Apellido: " + P1.getApellido());
        System.out.println("Serie:  " + D1.getSerie());
        System.out.println("DNI: " + D1.getNumero());
    }
}
