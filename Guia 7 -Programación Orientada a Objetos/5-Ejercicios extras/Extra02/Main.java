/*
Definir una clase llamada Puntos 
que contendrá las coordenadas de dos puntos, sus atributos
serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar 
un objeto puntos usando un método crearPuntos() que le pide
al usuario los dos números y los ingresa en los atributos 
del objeto. Después, a través de otro método calcular y 
devolver la distancia que existe entre los dos puntos que
existen en la clase Puntos. 
 */
package extra02;

/**
 *
 * @author TKBio
 */
public class Main {

    public static void main(String[] args) {
        //Se crea un onjeto "p" de la clase "Puntos"
        Puntos p = new Puntos();
        //se utiliza el metodo siguiente para que el usuario ingrese las coordenadas
        p.crearPuntos();
        //otro metodo para calcular la distancia
        Double distancia = p.calcularDistancia();
        //Impresion del resultado
        System.out.println("---------------------------------------");
        System.out.printf("La distancia entre los dos puntos es :%.2f", distancia);
        System.out.println("");
        System.out.println("---------------------------------------");
    }

}
