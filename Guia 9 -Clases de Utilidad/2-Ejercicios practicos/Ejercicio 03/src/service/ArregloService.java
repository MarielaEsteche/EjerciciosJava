/*
Crear la clase ArregloService, en el paquete servicio,
con los siguientes métodos:
*Método inicializarA recibe un arreglo por parámetro y lo
inicializa con números aleatorios.
*Método mostrar recibe un arreglo por parámetro y lo muestra por 
pantalla.
*Método ordenar recibe un arreglo por parámetro y lo ordena de 
mayor a menor.
*Método inicializarB copia los primeros 10 números del arreglo A 
en el arreglo B. Luego llenar las últimas 10 posiciones del 
arreglo B con 0.5.
 */
package service;

import java.util.Arrays;

/**
 *
 * @author TKBio
 */
public class ArregloService {

    public void inicializarA(double[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = Math.random() * 100;
        }
    }

    public void mostrar(double[] arreglo) {
        System.out.println(Arrays.toString(arreglo));
    }

    public void ordenar(double[] arreglo) {
        Arrays.sort(arreglo);
        for (int i = 0; i < arreglo.length / 2; i++) {
            double temp = arreglo[i];
            arreglo[i] = arreglo[arreglo.length - 1 - i];
            arreglo[arreglo.length - 1 - i] = temp;
        }
    }

    public void inicializarB(double[] arregloA, double[] arregloB) {
        for (int i = 0; i < 10; i++) {
            arregloB[i] = arregloA[i];
        }
        for (int i = 10; i < arregloB.length; i++) {
            arregloB[i] = 0.5;
        }
    }
}
