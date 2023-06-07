/*
Realizar un programa para que una Persona pueda adoptar un Gatos
Vamos a contar de dos clases. 
Gatos, que tendrá como atributos: nombre, raza, edad y tamanio
la clase Persona con
atributos: nombre, apellido, edad, documento y Gatos.
Ahora deberemos en el main crear dos Personas y dos Gatos.
Después, vamos a tener que pensar la logica necesaria para 
asignarle a cada Persona un Gatos y por ultimo, mostrar desde
la clase Persona, la información del Gatos y de la Persona.
 */
package adopcionGatos;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author TKBio
 *
 * Este programa queria hacerlo un pelin mas complejo tomando en cuenta que en
 * el extra 1 pide que halla mas personas y mas "perros" yo uso gatos porque me
 * gustan mas y porque si :P como se me llego a ser algo complicado de poner
 * sacar jugar y demas con el codigo lo dejo asi. cumple su funcion solo que no
 * le asigna gatos a cada persona
 */
public class Main {

    public static void main(String[] args) {

        // Crear gatos
        Gatos G1 = new Gatos("Copo", "Angora Turco", 4, "Grande");
        Gatos G2 = new Gatos("Moon", "Mixta", 1, "Pequenio");
        Gatos G3 = new Gatos("Nora", "Siberiana", 5, "Mediano");
        Gatos G4 = new Gatos("Lenore", "Azul Ruso", 9, "Grande");

        // Crear lista de gatos disponibles
        List<Gatos> gatosDisponibles = new ArrayList<>();
        gatosDisponibles.add(G1);
        gatosDisponibles.add(G2);
        gatosDisponibles.add(G3);
        gatosDisponibles.add(G4);

        //Creare un mensaje de Bienvenida con una condicion en la pregunta si 
        //se quiere adoptar si o no un gato
        JOptionPane.showMessageDialog(null, "¡Bienvenidos a adopciones de Mel!");
        int opcionAdopcion = JOptionPane.showConfirmDialog(null, "¿Desea adoptar un michi?", "Adopcion de Michi", JOptionPane.YES_NO_OPTION);
        if (opcionAdopcion == JOptionPane.YES_OPTION) {
            boolean adoptarOtroGato = true;
            Persona persona = null;

            while (adoptarOtroGato) {
                if (persona == null) {
                    // Solicitar datos de la persona
                    String nombrePersona = JOptionPane.showInputDialog("Ingrese su nombre");
                    String apellidoPersona = JOptionPane.showInputDialog("Ingrese su apellido");
                    int edadPersona = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad"));
                    int documentoPersona = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su numero de documento"));

                    // Crear persona
                    persona = new Persona(nombrePersona, apellidoPersona, edadPersona, documentoPersona);
                }

                // Mostrar lista de gatos disponibles
                StringBuilder mensajeGatosDisponibles = new StringBuilder("Michis disponibles:\n");
                gatosDisponibles.forEach((gato) -> {
                    mensajeGatosDisponibles.append("- ").append(gato.getNombre()).append("\n");
                });

                String nombreGatoElegido = JOptionPane.showInputDialog(null, mensajeGatosDisponibles.toString(), "Elegir Michi", JOptionPane.PLAIN_MESSAGE);

                // Buscar el gato elegido en la lista de gatos disponibles
                Gatos gatoElegido = null;
                for (Gatos gato : gatosDisponibles) {
                    if (gato.getNombre().equalsIgnoreCase(nombreGatoElegido)) {
                        gatoElegido = gato;
                        break;
                    }
                }

                if (gatoElegido != null) {
                    // Asignar perro a la persona
                    persona.adoptarGato(gatoElegido);
                    gatosDisponibles.remove(gatoElegido);
                    JOptionPane.showMessageDialog(null, "¡Adopcion exitosa!");

                    int opcionAdoptarOtroGato = JOptionPane.showConfirmDialog(null, "¿Desea adoptar otro michi?", "Adopcion de Michi", JOptionPane.YES_NO_OPTION);
                    adoptarOtroGato = (opcionAdoptarOtroGato == JOptionPane.YES_OPTION);
                } else {
                    JOptionPane.showMessageDialog(null, "El Michi ingresado no se encuentra en nuestra base de datos. Por favor, ingrese nuevamente.");
                }
            }

            //Ahora mostrariamos la info de la persona y los gatos que adopto
            if (persona != null) {
                persona.InfoPersonaGato();
                JOptionPane.showMessageDialog(null, "Gracias por darle a un Michi un nuevo hogar.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Gracias por su visita.");
        }

        System.exit(0);
    }
}
