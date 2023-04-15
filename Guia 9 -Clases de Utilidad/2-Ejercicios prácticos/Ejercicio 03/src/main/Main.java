/*
Crear en el Main dos arreglos. El arreglo A de 50 números reales 
y el arreglo B de 20 números reales.

En el Main nuevamente: inicializar A, mostrar A, ordenar A, 
inicializar B, mostrar A y B.
 */
package main;

import java.util.Arrays;
import service.ArregloService;

/**
 *
 * @author TKBio
 */
public class Main {
    
    public static void main(String[] args) {
        double[] arregloA = new double[50];
        double[] arregloB = new double[20];
        
        ArregloService servicio = new ArregloService();
        
        servicio.inicializarA(arregloA);
        System.out.println("El arreglo A sin ordenar seria: " + Arrays.toString(arregloA));
        servicio.ordenar(arregloA);
        System.out.println("El arreglo A ordenado seria: " + Arrays.toString(arregloA));
        
        servicio.inicializarB(arregloA, arregloB);
        System.out.println("Arreglo A: " + Arrays.toString(arregloA));
        System.out.println("Arreglo B: " + Arrays.toString(arregloB));
    }
}
