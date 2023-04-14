package main;

import entidades.ParDeNumeros;
import service.ParDeNumerosService;

/**
 *
 * @author TKBio
 */
public class Main {

    public static void main(String[] args) {
        ParDeNumeros par = new ParDeNumeros();
        ParDeNumerosService servicio = new ParDeNumerosService();

        //Aca muestro los valorede de los atributos de par
        servicio.mostrarValores(par);

        //Calcular y mostrar el mayor de par
        double mayor = servicio.devolverMayor(par);
        System.out.println("El mayor valor es : " + mayor);

        // ahora lo mismo pero con la potencia del mayor elevada al menor
        double potencia = servicio.calcularPotencia(par);
        System.out.println("La potencia del mayor elevado al menor es de : " + potencia);

        //ahora el calculo de la raiz cuadrada del menor absoluto
        double raiz = servicio.calcularRaiz(par);
        System.out.println("La raiz cuadrada del valor absoluto del menor es:  " + raiz);
    }
}
