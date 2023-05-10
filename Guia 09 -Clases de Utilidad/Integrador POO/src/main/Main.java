package main;

import java.util.Arrays;
import service.EstudianteService;

/**
 *
 * @author TKBio
 */
public class Main {

    public static void main(String[] args) {
        EstudianteService ES = new EstudianteService();
        System.out.println("================= ESTUDIANTES DEL CURSO =================");
        ES.mostrarEstudiantes();
        double promedio = ES.promedioNotas();
        System.out.println("================== PROMEDIO DE NOTAS ====================");
        System.out.println("* El promedio de notas del curso es: [" + promedio + "]");
        System.out.println("---------------------------------------------------------");
        String[] nombres = ES.estudiantesNotaMayorProm();
        System.out.println("* Los estudiantes con nota mayor al promedio son : "); 
        System.out.println("---------------------------------------------------------");
        System.out.println("\t\t" + Arrays.toString(nombres));
        ES.mostrarEstudiantesNotaMayorProm();
        System.out.println("================ GRACIAS POR SU VISITA ==================");
    }
}
