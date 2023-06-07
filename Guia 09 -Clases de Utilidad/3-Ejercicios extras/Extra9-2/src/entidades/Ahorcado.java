package entidades;

/**
 *
 * @author TKBio
 */
public class Ahorcado {

    private String palabra;
    private int intentosPermitidos;
    private int intentosRealizados;

    public Ahorcado() {
    }

    public Ahorcado(String palabra, int intentosPermitidos) {
        this.palabra = palabra;
        this.intentosPermitidos = intentosPermitidos;
        this.intentosRealizados = 0;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public int getIntentosPermitidos() {
        return intentosPermitidos;
    }

    public void setIntentosPermitidos(int intentosPermitidos) {
        this.intentosPermitidos = intentosPermitidos;
    }

    public int getIntentosRealizados() {
        return intentosRealizados;
    }

    public void setIntentosRealizados(int intentosRealizados) {
        this.intentosRealizados = intentosRealizados;
    }
}
