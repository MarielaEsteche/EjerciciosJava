package adopcionGatos;

import javax.swing.JOptionPane;

/**
 *
 * @author TKBio
 */
public class Persona {

    private String nombre;
    private String apellido;
    private int edad;
    private int documento;
    private Gatos[] gatos;
    private int cantidadGatos;

    public Persona(String nombre, String apellido, int edad, int documento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
        this.gatos = new Gatos[2];// le voy a dar que la persona no pueda adoptar mas de 2 gatos
        this.cantidadGatos = 0;

    }

    public String getNombre() {
        return nombre;
    }

    public Gatos[] getGatos() {
        return gatos;
    }

    public void adoptarGato(Gatos gato) {
        if (cantidadGatos < gatos.length) {
            gatos[cantidadGatos] = gato;
            cantidadGatos++;
        } else {
            JOptionPane.showMessageDialog(null, "Ya ha alcanzado el limite maximo de michis adoptados.");
        }
    }

    public void InfoPersonaGato() {
        StringBuilder mensaje = new StringBuilder();
        mensaje.append("------ Datos de la Persona ------\n");
        mensaje.append("Nombre: ").append(nombre).append("\n");
        mensaje.append("Apellido: ").append(apellido).append("\n");
        mensaje.append("Edad: ").append(edad).append("\n");
        mensaje.append("Documento: ").append(documento).append("\n");

        if (cantidadGatos > 0) {
            mensaje.append("------ Datos del Michi ------\n");
            for (Gatos gato : gatos) {
                mensaje.append("Nombre: ").append(gato.getNombre()).append("\n");
                mensaje.append("Raza: ").append(gato.getRaza()).append("\n");
                mensaje.append("Edad: ").append(gato.getEdad()).append("\n");
                mensaje.append("Tamanio: ").append(gato.getTamanio()).append("\n ------ \n");
            }
        } else {
            mensaje.append("No tiene michis asignados.");
        }

        JOptionPane.showMessageDialog(null, mensaje.toString());
    }

}
