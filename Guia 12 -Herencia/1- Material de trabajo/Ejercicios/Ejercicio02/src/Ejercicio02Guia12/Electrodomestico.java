package Ejercicio02Guia12;

import java.util.Scanner;

/**
 *
 * @author TKBio
 */
public class Electrodomestico {

    //Atributos precio, color, consumo energetico y peso
    private double precio;
    private String color;
    private char consumoEnergetico;
    private double peso;

    //Constructor vacio
    public Electrodomestico() {

    }

    //constructor con todos los atributos
    public Electrodomestico(double precio, String color, char consumoEnergetico, double peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }
    //getters y setters

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    //Creamos un metodo para comprobar el consumo energetico
    private void comprobarConsumoEnergetico(char letra) {
        if (letra >= 'A' && letra <= 'F') {
            this.consumoEnergetico = letra;
        } else {
            this.consumoEnergetico = 'F';
        }
    }

    //Creamos un metodo para comprobar e color del electrodomestico
    private void comprobarColor(String color) {
        String[] coloresDisponible = {"blaco", "negro", "rojo", "azul", "gris"};
        boolean colorValido = false;
        for (String colorDisponible : coloresDisponible) {
            if (color.equalsIgnoreCase(colorDisponible)) {
                colorValido = true;
                break;
            }
        }
        if (colorValido) {
            this.color = color.toLowerCase();
        } else {
            this.color = "blanco";
        }
    }

    //Creamos un metodo para crear un electrodomestico pasado por teclado
    public void crearElectrodomestico() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, ingrese el precio del electrodomestico");
        this.precio = sc.nextDouble();

        System.out.println("Ahora ingrese el color ");
        sc.nextLine();
        String color = sc.nextLine();
        comprobarColor(color);

        System.out.println("Ahora, cuanta energia consume");
        char consumo = sc.next().charAt(0);
        comprobarConsumoEnergetico(consumo);

        System.out.println("Indique cuanto pesa");
        this.peso = sc.nextDouble();

    }

    //Ahora un metodo para calcular el precio final de acuerdo a la tabla dada
    //en la consigna
    public double precioFinal() {
        double precioFinal = this.precio;

        //Ahora lo vamos invrementando segun el consumo
        switch (this.consumoEnergetico) {
            case 'A':
                precioFinal += 1000;
                break;
            case 'B':
                precioFinal += 800;
                break;
            case 'C':
                precioFinal += 600;
                break;
            case 'D':
                precioFinal += 500;
                break;
            case 'E':
                precioFinal += 300;
                break;
            case 'F':
                precioFinal += 100;
                break;
        }
        //Ahora e incrementa el recio segun su peso
        if (this.peso >= 1 && this.peso <= 19) {
            precioFinal += 100;
        } else if (this.peso >= 20 && this.peso <= 49) {
            precioFinal += 500;
        } else if (this.peso >= 50 && this.peso <= 79) {
            precioFinal += 800;
        } else if (this.peso >= 80) {
            precioFinal += 1000;
        }
        return precioFinal;
    }

    //Creare un metodo que me muestre toda la info generada
    @Override
    public String toString() {
        return "-------------------------------------------\n"
                + "Precio de lista: $" + precio + "\n"
                + "Color: " + color + "\n"
                + "Consumo: " + consumoEnergetico + "\n"
                + "Peso: " + peso + " kg";
    }
}
