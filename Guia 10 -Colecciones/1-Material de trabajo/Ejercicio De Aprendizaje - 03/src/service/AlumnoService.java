/*
En el servicio de Alumno deberemos tener un bucle que crea un objeto
Alumno. Se pide toda la información al usuario y ese Alumno se 
guarda en una lista de tipo Alumno y se le pregunta al usuario si 
quiere crear otro Alumno o no.
Después de ese bucle tendremos el siguiente método en el servicio
de Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que 
quiere calcular su nota final y se lo busca en la lista de Alumnos.
Si está en la lista, se llama al método. Dentro del método se usará
la lista notas para calcular el promedio final de alumno. Siendo 
este promedio final, devuelto por el método y mostrado en el main.
 */
package service;

import entidades.Alumno;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author TKBio
 */
public class AlumnoService {

    private List<Alumno> alumnos;

    public AlumnoService() {
        this.alumnos = new ArrayList<>();
    }

    public void agregarAlumno(Alumno alumno) {
        alumnos.add(alumno);
    }

    public double notaFinal(String nombreBuscado) {
        for (Alumno alumno : alumnos) {
            if (alumno.getNombre().equalsIgnoreCase(nombreBuscado)) {
                return alumno.notaFinal();
            }
        }
        return -1; // Retornar un valor negativo si no se encuentra al alumno

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AlumnoService alumnoService = new AlumnoService();

        boolean seguirAgregando = true;
        while (seguirAgregando) {
            System.out.print("Ingrese el nombre del alumno: ");
            String nombre = scanner.nextLine();

            List<Integer> notas = new ArrayList<>();
            for (int i = 1; i <= 3; i++) {
                System.out.print("Ingrese la nota " + i + " del alumno: ");
                int nota = scanner.nextInt();
                notas.add(nota);
            }
            scanner.nextLine(); // Limpiar el buffer del scanner

            Alumno alumno = new Alumno(nombre, notas);
            alumnoService.agregarAlumno(alumno);

            System.out.print("¿Desea agregar otro alumno? (S/N): ");
            String respuesta = scanner.nextLine();
            seguirAgregando = respuesta.equalsIgnoreCase("S");
        }

        System.out.print("Ingrese el nombre del alumno para calcular su nota final: ");
        String nombreBuscado = scanner.nextLine();

        double notaFinal = alumnoService.notaFinal(nombreBuscado);
        if (notaFinal >= 0) {
            System.out.println("La nota final de " + nombreBuscado + " es " + notaFinal);
        } else {
            System.out.println("El alumno " + nombreBuscado + " no se encuentra en la lista.");
        }
    }
}
