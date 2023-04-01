/*
Realizar una clase llamada CuentaBancaria en el paquete Entidades con los 
siguientes atributos: numeroCuenta(entero), dniCliente(entero largo), 
saldoActual. Agregar constructor vacío, con parámetros, getters y setters.
Agregar la clase CuentaBancariaServicio en el paquete Servicios que contenga:
1-Método para crear cuenta pidiéndole los datos al usuario.
2-Método ingresar(double): recibe una cantidad de dinero a ingresar y se le 
sumará al saldo actual.
3-Método retirar(double): recibe una cantidad de dinero a retirar y se le 
restara al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar 
se retirará el máximo posible hasta dejar la cuenta en 0.
3-Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. 
Validar que el usuario no saque más del 20%.
4-Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.
5-Método consultarDatos: permitirá mostrar todos los datos de la cuenta.
 */
import javax.swing.JOptionPane;
import Entidades.CuentaBancaria;
import Servicios.CuentaBancariaServicio;

/**
 *
 * @author TKBio
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        CuentaBancariaServicio servicio = new CuentaBancariaServicio();
        CuentaBancaria cuenta = null;

        int opcion = 0;

        do {
            String opcionStr = JOptionPane.showInputDialog("Menú:\n"
                    + "1. Crear cuenta\n"
                    + "2. Ingresar dinero\n"
                    + "3. Retirar dinero\n"
                    + "4. Extracción rápida del 20%\n"
                    + "5. Consultar saldo\n"
                    + "6. Consultar datos\n"
                    + "7. Salir\n\n"
                    + "Ingrese una opción:");

            opcion = Integer.parseInt(opcionStr);

            switch (opcion) {
                case 1:
                    cuenta = servicio.crearCuenta();
                    JOptionPane.showMessageDialog(null, "La cuenta ha sido creada.");
                    break;

                case 2:
                    if (cuenta == null) {
                        JOptionPane.showMessageDialog(null, "Primero debe crear una cuenta.");
                        break;
                    }

                    String cantidadIngresarStr = JOptionPane.showInputDialog("Ingrese la cantidad a ingresar:");
                    double cantidadIngresar = Double.parseDouble(cantidadIngresarStr);
                    servicio.ingresar(cuenta, cantidadIngresar);
                    break;

                case 3:
                    if (cuenta == null) {
                        JOptionPane.showMessageDialog(null, "Primero debe crear una cuenta.");
                        break;
                    }

                    String cantidadRetirarStr = JOptionPane.showInputDialog("Ingrese la cantidad a retirar:");
                    double cantidadRetirar = Double.parseDouble(cantidadRetirarStr);
                    servicio.retirar(cuenta, cantidadRetirar);
                    break;

                case 4:
                    if (cuenta == null) {
                        JOptionPane.showMessageDialog(null, "Primero debe crear una cuenta.");
                        break;
                    }

                    servicio.extraccionRapida(cuenta);
                    break;

                case 5:
                    if (cuenta == null) {
                        JOptionPane.showMessageDialog(null, "Primero debe crear una cuenta.");
                        break;
                    }

                    servicio.consultarSaldo(cuenta);
                    break;

                case 6:
                    if (cuenta == null) {
                        JOptionPane.showMessageDialog(null, "Primero debe crear una cuenta.");
                        break;
                    }

                    servicio.consultarDatos(cuenta);
                    break;

                case 7:
                    JOptionPane.showMessageDialog(null, "¡Gracias por su Visita! \n"
                            + "Vuelvas Prontos xD");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida.");
            }

        } while (opcion != 7);
    }
}
