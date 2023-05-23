/*
Realiza un programa en donde una clase Persona tenga como atributo
nombre, apellido y un objeto de clase Dni. 
La clase Dni tendrá como atributos la serie (carácter) y número. 
Prueba acceder luego a los atributos del dni de la persona creando
objetos y jugando desde el main.
*/
package Persona;

/**
 *
 * @author TKBio
 */
public class Persona {

    // Atributos
    private String nombre;
    private String apellido;
    private DNI dni;

    public Persona(String nombre, String apellido, DNI dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public DNI getDni() {
        return dni;
    }

}
