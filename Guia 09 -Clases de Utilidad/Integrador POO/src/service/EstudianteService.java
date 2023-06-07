package service;

import entidades.Estudiante;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author TKBio
 */
public class EstudianteService {

    private Estudiante[] estudiantes;

    public EstudianteService() {
        estudiantes = new Estudiante[8];
        estudiantes[0] = new Estudiante("Jose", 90);
        estudiantes[1] = new Estudiante("Maria", 97);
        estudiantes[2] = new Estudiante("Mel", 100);
        estudiantes[3] = new Estudiante("Ana", 88);
        estudiantes[4] = new Estudiante("Mario", 98);
        estudiantes[5] = new Estudiante("Santy", 90);
        estudiantes[6] = new Estudiante("Hugo", 80);
        estudiantes[7] = new Estudiante("Caro", 96);

    }
    public void mostrarEstudiantes() {
    System.out.println("\t\t  Nombre\tNota");
    System.out.println("\t\t  ----------|----------");
    for (Estudiante estudiante : estudiantes) {
        System.out.println("\t\t  " + estudiante.getNombre() + "\t\t" + estudiante.getNota());
    }
}

    public double promedioNotas() {
        int sumarNotas = 0;
        for (Estudiante estudiante : estudiantes) {
            sumarNotas += estudiante.getNota();
        }
        return (double) sumarNotas / estudiantes.length;
    }

    public String[] estudiantesNotaMayorProm() {
        double promedio = promedioNotas();
        List<String> nombres = new ArrayList<>();
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getNota() > promedio) {
                nombres.add(estudiante.getNombre());
            }
        }
        return nombres.toArray(new String[0]);
    }

    public void mostrarEstudiantesNotaMayorProm() {
        double promedio = promedioNotas();
        System.out.println("---------------------------------------------------------");
        System.out.println("* Estos son los estudiantes con la nota mayor al prmedio:");
        System.out.println("---------------------------------------------------------");

        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getNota() > promedio) {
                System.out.println(estudiante.getNombre() + " - " + estudiante.getNota());

            }
        }
    }
}
