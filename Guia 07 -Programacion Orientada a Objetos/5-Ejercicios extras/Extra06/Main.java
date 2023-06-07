/*
Crea una clase "Empleado" que tenga atributos como "nombre",
"edad" y "salario". Luego, crea un método "calcular_aumento"
que calcule el aumento salarial de un empleado en función de
su edad y salario actual. El aumento salarial debe ser del 
10% si el empleado tiene más de 30 años o del 5% si tiene 
menos de 30 años.
 */
package extra06;

/**
 *
 * @author TKBio
 */
public class Main {

    public static void main(String[] args) {
        Empleado e1 = new Empleado("Mel", 20, 168000);
        //System.out.println(e1.toString()); Esto es para que funcione el @override
        System.out.println("-------------------------------------------");
        System.out.println("El salario antes del aumento seria : " + e1.getSalario());
        System.out.println("-------------------------------------------");
        e1.info();
        e1.calcular_aumento();
        System.out.println("El salario despues del aumento es: " + e1.getSalario());
        System.out.println("-------------------------------------------");
    }

}
