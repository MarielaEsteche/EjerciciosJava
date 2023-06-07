/*
La clase Simulador que va a tener los métodos para manejar los
alumnos y sus votaciones. Estos métodos serán llamados
desde el main.
• La clase Simulador debe tener un método que genere un listado de alumnos manera
aleatoria y lo retorne. Las combinaciones de nombre y apellido deben ser generadas de
manera aleatoria. Nota: usar listas de tipo String para generar los nombres y los apellidos.
• Ahora hacer un generador de combinaciones de DNI posibles, deben estar dentro de un
rango real de números de documentos. Y agregar a los alumnos su DNI. Este método
debe retornar la lista de dnis.
• Ahora tendremos un método que, usando las dos listas generadas, cree una cantidad de
objetos Alumno, elegidos por el usuario, y le asigne los nombres y los dnis de las dos
listas a cada objeto Alumno. No puede haber dos alumnos con el mismo dni, pero si con el
mismo nombre.
• Se debe imprimir por pantalla el listado de alumnos.
 */
package FacilitadoresDeEgg;

import java.util.*;

/**
 *
 * @author TKBio
 */
public class Simulador {

    public List<Alumno> generarListadoAlumnos(int cantidad) {
        List<String> nombres = Arrays.asList("Maria", "Mariela", "Patricia", "Damian", "Rocio", "Ismael", "Mia", "Zoe", "Nancy", "Camila", "Cintia", "Cristian", "Ariel", "Tamara", "Roxana", "Axel", "Oscar", "Alicia", "Rei", "Netsuko", "Ranma");
        List<String> apellidos = Arrays.asList("Gomez", "Esteche", "Robledo", "Insaurralde", "Martinez", "Lopez", "Villagra", "Bogado", "Zapata", "Godoy", "Ortellado", "Perez", "Asus", "Blem", "Razer", "Steel", "Serrano", "Ayanami", "Langley", "Ikari");
        List<Alumno> alumnos = new ArrayList<>();

        Random rand = new Random();
        for (int i = 0; i < cantidad; i++) {
            String nombreCompleto = nombres.get(rand.nextInt(nombres.size())) + " " + apellidos.get(rand.nextInt(apellidos.size()));
            alumnos.add(new Alumno(nombreCompleto, ""));
        }

        return alumnos;
    }

    public List<String> generarListaDNI(int cantidad, int rangoInicial, int rangoFinal) {
        List<String> dnis = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < cantidad; i++) {
            String dni = String.valueOf(rand.nextInt(rangoFinal - rangoInicial + 1) + rangoInicial);
            dnis.add(dni);

        }

        return dnis;
    }

    public List<Alumno> crearObjetosAlumno(List<Alumno> alumnos, List<String> dnis, int cantidad) {
        Set<String> dnisAsignados = new HashSet<>();
        List<Alumno> objetosAlumno = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < cantidad; i++) {
            String dni = dnis.get(rand.nextInt(dnis.size()));
            if (dnisAsignados.contains(dni)) {
                i--;
                continue;
            }
            dnisAsignados.add(dni);
            Alumno alumno = alumnos.get(rand.nextInt(alumnos.size()));
            alumno.setDni(dni);
            objetosAlumno.add(alumno);
        }

        return objetosAlumno;
    }

    public void imprimirListadoAlumnos(List<Alumno> alumnos) {
        for (Alumno alumno : alumnos) {
            System.out.println("Nombre: " + alumno.getNombreCompleto() + ", DNI: " + alumno.getDni());
        }
    }

    public void votacion(List<Alumno> alumnos) {
        Random random = new Random();

        for (Alumno alumno : alumnos) {
            Set<Alumno> votosRealizados = alumno.getVotosRealizados();
            while (votosRealizados.size() < 3) {
                Alumno voto = alumnos.get(random.nextInt(alumnos.size()));
                if (alumno != voto && !votosRealizados.contains(voto) && !votosRealizados.contains(voto)) {
                    votosRealizados.add(voto);
                    alumno.votar(voto);
                    voto.incrementarVotos();
                }
            }
        }

    }

    public void mostrarResultados(List<Alumno> alumnos) {
        for (Alumno alumno : alumnos) {
            System.out.println();
            System.out.println("Alumno: " + alumno.getNombreCompleto());
            System.out.println("Cantidad de votos: " + alumno.getCantidadVotos());
            System.out.println("Votos realizados: ");
            for (Alumno voto : alumno.getVotosRealizados()) {
                System.out.println("- " + voto.getNombreCompleto());
            }
            System.out.println("--------------------------");
        }
    }

    public void generarFacilitadores(List<Alumno> alumnos) {
        Collections.sort(alumnos, Comparator.comparingInt(Alumno::getCantidadVotos).reversed());

        System.out.println("Facilitadores:");
        System.out.println("--------------------------");

        for (int i = 0; i < 5; i++) {
            Alumno facilitador = alumnos.get(i);
            System.out.println("- " + facilitador.getNombreCompleto() + " (Votos: " + facilitador.getCantidadVotos() + ")");
        }

        System.out.println("--------------------------");
        System.out.println("Facilitadores Suplentes:");
        System.out.println("--------------------------");

        for (int i = 5; i < 10; i++) {
            Alumno facilitadorSuplente = alumnos.get(i);
            System.out.println("- " + facilitadorSuplente.getNombreCompleto() + " (Votos: " + facilitadorSuplente.getCantidadVotos() + ")");
        }
        System.out.println();
    }
}
