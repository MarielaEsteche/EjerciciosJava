/*
 * Tenemos una clase padre Animal junto con sus
 * 3 clases hijas Perro, Gato, Caballo.
 * La clase Animal tendrá como atributos:
 * nombre, alimento, edad y raza del Animal.
 * Crear un método en la clase Animal a través
 * del cual cada clase hija deberá mostrar luego
 * un mensaje por pantalla informando de que
 * se alimenta
 *
 */
package Ejercicio01Guia12;

/**
 *
 * @author TKBio
 */
public class Animal {

    //Creamos los atributos pedidos en la consigna
    protected String nombre;
    protected String alimento;
    protected int edad;
    protected String raza;

    //Creamos el contructor de la clase Animal
    public Animal(String nombre, String alimento, int edad, String raza) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.edad = edad;
        this.raza = raza;
    }

    //Creamos el metodo en la clase Animal para que se alimente como 
    //se pide en la consigna
    public void Alimentarse() {
        System.out.println(nombre + " se alimenta de " + alimento);

    }
}
