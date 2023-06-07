package FacilitadoresDeEgg;

import java.util.List;

/**
 *
 * @author TKBio
 */
public class Main {

    public static void main(String[] args) {
        Simulador simulador = new Simulador();

        List<Alumno> alumnos = simulador.generarListadoAlumnos(20);
        List<String> dnis = simulador.generarListaDNI(20, 20000000, 45000000);
        List<Alumno> objetosAlumno = simulador.crearObjetosAlumno(alumnos, dnis, 10);

        simulador.imprimirListadoAlumnos(objetosAlumno);
        simulador.votacion(objetosAlumno);
        simulador.mostrarResultados(objetosAlumno);
        simulador.generarFacilitadores(objetosAlumno);
    }
}
