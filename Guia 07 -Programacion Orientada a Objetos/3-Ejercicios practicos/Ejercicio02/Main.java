/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio02;
import java.util.Scanner;
/**
 *
 * @author TKBio
 */
public class Main {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Por favor, introduce el radio: ");
        double radio = leer.nextDouble();
        Circunferencia c = new Circunferencia(radio);

        System.out.println("Radio: " + c.getRadio());
        System.out.println("Area: " + c.area());
        System.out.println("Perímetro: " + c.perimetro());
    }
}
