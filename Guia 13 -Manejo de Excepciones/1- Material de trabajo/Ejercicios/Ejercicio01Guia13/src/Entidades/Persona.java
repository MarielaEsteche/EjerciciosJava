package entidades;

/**
 *
 * @author TKBio
 */
public class Persona {
    //En la clase "Persona" añado una verificacion adicional en el metodo esMayorDeEdad().
    //Si el objeto persona es null, se lanza una excepcion "NullPointerException" con un mensaje
    //indicando que el objeto no ha sido inicializado.

    private String nombre;
    private int edad;
    private char sexo;
    private double peso;
    private double altura;

    public Persona() {
    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public boolean esMayorDeEdad() {
        return edad >= 18;
    }
}
