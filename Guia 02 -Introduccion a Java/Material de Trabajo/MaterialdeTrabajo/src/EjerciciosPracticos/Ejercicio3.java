/*
 * Ejercicio 3
 * Define variables donde puedas alojar los resultados 
 * y prueba usar dos operadores de cada tipo
 */
package EjerciciosPracticos;

/**
 *
 * @author TKBio
 */
public class Ejercicio3 {

    public static void main(String[] args) {

        // variables para alojar resultados
        int sumar;
        int restar;
        int Multiplicar;
        int dividir;
        int mod;
        int num1 = 10;
        int num2 = 3;
        // **opetadores aritmeticos**
        sumar = num1 + num2;//10 + 3=13
        restar = num1 - num2;//10 - 3=7
        Multiplicar = num1 * num2;//10 x 3=30
        dividir = num1 / num2;//10 / 3=3
        mod = num1 % num2;//10 % 3=1
        //imprimo los resultados
        System.out.println("---- ** OPERADORES ARITMETICOS ** ----");
        System.out.println("El resultado de " + num1 + " + " + num2 + " = " + sumar);
        System.out.println("El resultado de " + num1 + " - " + num2 + " = " + restar);
        System.out.println("El resultado de " + num1 + " x " + num2 + " = " + Multiplicar);
        System.out.println("El resultado de " + num1 + " / " + num2 + " = " + dividir);
        System.out.println("El resultado de " + num1 + " % " + num2 + " = " + mod);
        //operadores unarios
        int num3 = 5;
        int incremento = ++num3;//incrementa el valor de num3 en 1 en este caso 5+1=6
        int decremento = --num3;//decrementa el valor de num3 en 1 en este caso 5-3=4
        //imprimo los resultados
        System.out.println("---- ** OPERADORES UNARIOS ** ----");
        System.out.println("El valor " + num3 + " + 1 = " + incremento);
        System.out.println("El valor " + num3 + " - 1 = " + decremento);
        //operadores de igualdad y relacion
        int num4 = 11;
        int num5 = 6;

        boolean igualdad = (num4 == num5);//falso
        boolean desigualdad = (num4 != num5); // verdadero
        boolean mayorQue = (num4 > num5); // verdadero
        boolean mayorIgualQue = (num4 >= num5); // verdadero
        boolean menorQue = (num4 < num5); // falso
        boolean menorIgualQue = (num4 <= num5); // falso
        //imprimo los resultados
        System.out.println("---- ** OPERADORES DE IGUALDAD Y RELACION ** ----");
        System.out.println(num4 + " == " + num5 + " = " + igualdad);
        System.out.println(num4 + " != " + num5 + " = " + desigualdad);
        System.out.println(num4 + " > " + num5 + " = " + mayorQue);
        System.out.println(num4 + " >= " + num5 + " = " + mayorIgualQue);
        System.out.println(num4 + " < " + num5 + " = " + menorQue);
        System.out.println(num4 + " <= " + num5 + " = " + menorIgualQue);
    }
}
