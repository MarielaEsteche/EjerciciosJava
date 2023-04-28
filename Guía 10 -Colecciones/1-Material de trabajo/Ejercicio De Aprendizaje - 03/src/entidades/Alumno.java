package entidades;

import java.util.List;

/**
 *
 * @author TKBio
 */
public class Alumno {

    /*
     Crear una clase llamada Alumno que mantenga información sobre
     las notas de distintos alumnos. 
    La clase Alumno tendrá como atributos, su nombre y una lista 
    de tipo Integer con sus 3 notas.
     */
    private String nombre;
    private List<Integer> notas;

    public Alumno(String nombre, List<Integer> notas) {
        this.nombre = nombre;
        this.notas = notas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Integer> getNotas() {
        return notas;
    }

    public void setNotas(List<Integer> notas) {
        this.notas = notas;
    }

    public double notaFinal() {
        int suma = 0;
        suma = notas.stream().map((nota) -> nota).reduce(suma, Integer::sum);
        double promedio = (double) suma / notas.size();
        return promedio;
    }
}
