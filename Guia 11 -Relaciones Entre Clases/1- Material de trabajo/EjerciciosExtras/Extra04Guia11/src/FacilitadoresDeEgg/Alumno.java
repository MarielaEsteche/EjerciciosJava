/*
El sistema de votación de Egg tiene una clase llamada Alumno 
con los siguientes atributos:
nombre completo, dni y cantidad de votos
 */
package FacilitadoresDeEgg;

import java.util.*;

/**
 *
 * @author TKBio
 */
public class Alumno {

    private String nombreCompleto;
    private String dni;
    private int cantidadVotos;
    private Set<Alumno> votosRealizados;

    public Alumno(String nombreCompleto, String dni) {
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
        this.cantidadVotos = 0;
        this.votosRealizados = new HashSet<>();
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public String getDni() {
        return dni;
    }

    public int getCantidadVotos() {
        return cantidadVotos;
    }

    public void incrementarVotos() {
        cantidadVotos++;
    }

    public Set<Alumno> getVotosRealizados() {
        return votosRealizados;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void votar(Alumno alumno) {
        votosRealizados.add(alumno);
    }

}
