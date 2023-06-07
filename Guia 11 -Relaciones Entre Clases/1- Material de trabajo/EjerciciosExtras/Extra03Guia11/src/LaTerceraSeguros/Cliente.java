/*
En esta clase vamos a poner lo siguiente:
Atributos: 
nombre, apellido, documento, email, domicilio, teléfono.
Métodos: 
getters y setters para acceder y modificar los atributos.
 */
package LaTerceraSeguros;

/**
 *
 * @author TKBio
 */
public class Cliente {

    private String nombreApellido;
    private int documento;
    private String email;
    private String domicilio;
    private String telefono;

    public Cliente(String nombreApellido, int documento, String email, String domicilio, String telefono) {
        this.nombreApellido = nombreApellido;
        this.documento = documento;
        this.email = email;
        this.domicilio = domicilio;
        this.telefono = telefono;
    }

    public String getNombreApellido() {
        return nombreApellido;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

}
