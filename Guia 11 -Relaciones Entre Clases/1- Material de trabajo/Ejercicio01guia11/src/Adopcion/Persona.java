package Adopcion;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author TKBio
 */
public class Persona {

    private String nombre;
    private String apellido;
    private int edad;
    private int documento;
    private List<Gato> variosGatos;

    public Persona(String nombre, String apellido, int edad, int documento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
        this.variosGatos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    //Hare un metodo para que una persona adopte a mas de un gato
    public void adoptarGato(Gato Michi) {
        //le voy a poner un maximo de 2 para no hacerla tan larga
        if (variosGatos.size() < 2) {
            //Le doy el gato a la persona
            variosGatos.add(Michi);
            //} else {
            //   System.out.println(getNombre() + " Ya adopto el maximo de Gatos permitidos");
        }

        //Michi.setMasDeUno(true);
    }

    public String getInfoPersona() {
        String infoPersona = "Nombre: " + nombre + "\nApellido: " + apellido + "\nEdad: " + edad + "\nDocumento: " + documento;

        if (!variosGatos.isEmpty()) {
            infoPersona += "\n\n------------- DATOS DEL FELINO -------------\n\n";
            infoPersona = variosGatos.stream().map((gato) -> "\nNombre: " + gato.getNombre() + "\nRaza: " + gato.getRaza() + "\nEdad: " + gato.getEdad() + "\nTamaño: " + gato.getTamanio() + "\n").reduce(infoPersona, String::concat);
        } else {
            infoPersona += "\n\nNo se ha adoptado ningún gato.";
        }

        return infoPersona;
    }

}
