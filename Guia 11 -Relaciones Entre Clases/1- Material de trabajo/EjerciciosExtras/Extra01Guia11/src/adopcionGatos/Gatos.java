package adopcionGatos;

/**
 *
 * @author TKBio
 */
public class Gatos {

    private String nombre;
    private String raza;
    private int edad;
    private String tamanio;
    private boolean adoptado;

    public Gatos(String nombre, String raza, int edad, String tamanio) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamanio = tamanio;
        this.adoptado = false;
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

    public boolean isAdoptado() {
        return adoptado;
    }

    public void setAdoptado(boolean adoptado) {
        this.adoptado = adoptado;
    }
}
