package Adopcion;

/**
 *
 * @author TKBio
 */
public class Gato {

    private String nombre;
    private String raza;
    private int edad;
    private String tamanio;
    //private boolean masDeUno;

    public Gato(String nombre, String raza, int edad, String tamanio) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamanio = tamanio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }

    public int getEdad() {
        return edad;
    }

    public String getTamanio() {
        return tamanio;
    }

    // public void setMasDeUno(boolean masDeUno) {
    // this.masDeUno = masDeUno;
}
