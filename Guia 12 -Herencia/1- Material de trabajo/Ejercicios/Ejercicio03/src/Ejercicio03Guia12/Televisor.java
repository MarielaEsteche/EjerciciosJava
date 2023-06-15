package Ejercicio03Guia12;

import java.util.Scanner;

/**
 *
 * @author TKBio
 */
//Creamos la clase televisor que hereda de electrodomestico
public class Televisor extends Electrodomestico {

    private int resolucion;
    private boolean sintonizadorTDT;

    //constructor vacio
    public Televisor() {
    }
    //constructor con atributos de la propia clase y los heredados

    public Televisor(int resolucion, boolean sintonizadorTDT, double precio, String color, char consumoEnergetico, double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }
    //getter y setters propios de la clase TV

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    //Metodo para crear una tele ingresada por teclado
    public void crearTelevisor() {
        crearElectrodomestico();
        Scanner sc = new Scanner(System.in);

        System.out.println("Cuantas pulgadas tiene el televisor? ");
        this.resolucion = sc.nextInt();

        System.out.println("Tiene TDT? (true/false): ");
        this.sintonizadorTDT = sc.nextBoolean();
    }
    //Metodo para calcular el precio de la tele

    @Override
    public double precioFinal() {
        double precioFinal = super.precioFinal();

        //Incremento el precio segun la resolucion
        if (this.resolucion > 40) {
            precioFinal += precioFinal * 0.3;
        }
        //Incrementamos el precio si tiene TDT o no
        if (this.sintonizadorTDT) {
            precioFinal += 500.0;
        }

        return precioFinal;
    }

    //Metodo para mostrar la info compoleta de la tele
    @Override
    public String toString() {
        String tieneTDT = sintonizadorTDT ? "Si" : "No";
        return super.toString() + "\n"
                + "Resolucion: " + resolucion + " Pulgadas" + "\n"
                + "Tiene TDT: " + tieneTDT;
    }

}
