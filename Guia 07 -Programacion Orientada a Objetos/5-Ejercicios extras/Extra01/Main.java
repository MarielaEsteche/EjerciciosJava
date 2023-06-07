/*
Desarrollar una clase Cancion con los siguientes atributos: 
título y autor. Se deberá́  definir además dos constructores: 
uno vacío que inicializa el título y el autor a cadenas 
vacías y otro que reciba como parámetros el título y el autor
de la canción. Se deberán además definir los métodos getters 
y setters correspondientes.
 */
package extra01;

/**
 *
 * @author TKBio
 */
public class Main {

    public static void main(String[] args) {
        // creamos una nueva instancia para el constructor vacio
        Cancion can1 = new Cancion();
        can1.setTitulo("Little Stranger");
        can1.setAutor("Dawid podsiadło ");
        //Ahora una instancia para el constructor que recibe parametros
        Cancion can2 = new Cancion("R U Guna Move", "Venjent");
        //Se imprimern los parametros correspondientes a las canciones
        System.out.println("-------------------------------------------------------");
        System.out.println("Cancion 1: " + can1.getTitulo() + " - " + can1.getAutor());
        System.out.println("Cancion 2: " + can2.getTitulo() + " - " + can2.getAutor());
        System.out.println("-------------------------------------------------------");
    }

}
