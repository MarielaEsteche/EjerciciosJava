package Ejercicio03Guia12;

import java.util.Scanner;

/**
 *
 * @author TKBio
 */
//Creamos la clase Lavadora que Heredara de Electrodomestico
public class Lavadora extends Electrodomestico {

    private double carga;

    //ponemos constructo vacio
    public Lavadora() {
    }
    //ponemos contructor con sus atributos heredados

    public Lavadora(double carga, double precio, String color, char consumoEnergetico, double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }
    //ahora los getters y setters 

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    //Ahora un metodo para crear la lavadora ingresada por teclado
    public void crearLavadora() {
        crearElectrodomestico();
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la carga de la lavadora: ");
        this.carga = sc.nextDouble();
    }
    //Ahora un metodo para calcular el precio final de la lavadora

    @Override
    public double precioFinal() {
        double precioFinal = super.precioFinal();

        //Invrementamos el precio segun la carga de la lavadora
        if (this.carga > 30) {
            precioFinal += 500.0;
        }
        return precioFinal;
    }

    //Creamos un metodo para que muestre la info completa de la lavadora
    @Override
    public String toString() {
        return super.toString() + "\n"
                + "Carga: " + carga + " kg";
    }
}
