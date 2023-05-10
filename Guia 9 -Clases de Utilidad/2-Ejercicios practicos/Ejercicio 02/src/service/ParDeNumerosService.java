/*
Crear una clase ParDeNumerosService, en el paquete Servicios, 
que deberá además implementar los siguientes métodos:
*Método mostrarValores que muestra cuáles son los dos números guardados.
*Método devolverMayor para retornar cuál de los dos atributos tiene el mayor valor
*Método calcularPotencia para calcular la potencia del mayor valor de la clase elevado al menor número. Previamente se deben redondear ambos valores.
*Método calculaRaiz, para calcular la raíz cuadrada del menor de los dos valores. Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
package service;

import entidades.ParDeNumeros;

/**
 *
 * @author TKBio
 */
public class ParDeNumerosService {

    public void mostrarValores(ParDeNumeros par) {
        System.out.println("El primer numero es: " + par.getNum1());
        System.out.println("El segundo numero es: " + par.getNum2());
    }

    public double devolverMayor(ParDeNumeros par) {
        if (par.getNum1() > par.getNum2()) {
            return par.getNum1();
        } else {
            return par.getNum2();
        }
    }

    public double calcularPotencia(ParDeNumeros par) {
        double mayor = devolverMayor(par);
        double menor = (mayor == par.getNum1()) ? par.getNum2() : par.getNum1();
        mayor = Math.round(mayor);
        menor = Math.round(menor);
        return Math.pow(mayor, menor);
    }

    public double calcularRaiz(ParDeNumeros par) {
        double menor = (par.getNum1() < par.getNum2()) ? par.getNum1() : par.getNum2();
        menor = Math.abs(menor);
        return Math.sqrt(menor);
    }
}
