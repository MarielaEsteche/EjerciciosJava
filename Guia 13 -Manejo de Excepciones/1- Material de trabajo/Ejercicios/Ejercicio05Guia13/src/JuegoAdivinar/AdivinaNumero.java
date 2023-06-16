/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JuegoAdivinar;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author TKBio
 */
public class AdivinaNumero {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int numeroAdivinar = rd.nextInt(500) + 1;
        int intentos = 0;

        System.out.println("//////////////////////////////////////////");
        System.out.println("///// BIENVENIDOS A ADIVINAR NUMEROS /////");
        System.out.println("//////////////////////////////////////////");

        while (true) {
            try {
                System.out.println("Ingrese un numero entero");
                int numeroIngresado = sc.nextInt();
                intentos++;

                if (numeroIngresado < numeroAdivinar) {
                    System.out.println("Es mas!");
                } else if (numeroIngresado > numeroAdivinar) {
                    System.out.println("Es menos!");
                } else {
                    System.out.println("ADIVINASTE!!!");
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("ERROR!! Pone un numero valido");
                sc.nextLine();
                intentos++;

            }
        }

        System.out.println("Intentos usados : " + intentos);
    }
}
