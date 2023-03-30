package ejercicio03;

/**
 *
 * @author TKBio
 */
public class Main {

    public static void main(String[] args) {
        Operacion op = new Operacion();
        op.crearOperacion();
        int numero1 = op.getNumero1();
        int numero2 = op.getNumero2();
        System.out.println("--------------- OPERACIONES --------------");
        System.out.println("La suma de " + numero1 + " + " + numero2 + " = " + op.sumar());
        System.out.println("La resta de " + numero1 + " - " + numero2 + " = " + op.restar());
        System.out.println("La multiplicacion de " + numero1 + " x " + numero2 + " = " + op.multiplicar());
        System.out.println("La división de " + numero1 + " dividido " + numero2 + " = " + op.dividir());
        System.out.println("------------------------------------------");
    }
}
