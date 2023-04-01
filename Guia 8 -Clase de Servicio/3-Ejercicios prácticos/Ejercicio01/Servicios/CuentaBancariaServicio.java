package Servicios;

import java.util.Scanner;
import Entidades.CuentaBancaria;
import javax.swing.JOptionPane;

/**
 *
 * @author TKBio
 */
public class CuentaBancariaServicio {

    //Método para crear cuenta pidiéndole los datos al usuario.
    public CuentaBancaria crearCuenta() {
        String numeroCuentaStr = JOptionPane.showInputDialog("Ingrese su número de cuenta:");
        int numeroCuenta = Integer.parseInt(numeroCuentaStr);

        String dniClienteStr = JOptionPane.showInputDialog("Ingrese su DNI:");
        long dniCliente = Long.parseLong(dniClienteStr);

        String saldoActualStr = JOptionPane.showInputDialog("Ingrese su saldo actual:");
        double saldoActual = Double.parseDouble(saldoActualStr);

        return new CuentaBancaria(numeroCuenta, dniCliente, saldoActual);
    }

    public void ingresar(CuentaBancaria cuenta, double cantidadIngresar) {
        cuenta.setSaldoActual(cuenta.getSaldoActual() + cantidadIngresar);
        JOptionPane.showMessageDialog(null, "Se ha ingresado " + cantidadIngresar + " pesos en la cuenta.\n"
                + "Su saldo actual es de $: " + cuenta.getSaldoActual());
    }

    public void retirar(CuentaBancaria cuenta, double cantidadRetirar) {
        double saldoActual = cuenta.getSaldoActual();
        if (saldoActual < cantidadRetirar) {
            cantidadRetirar = saldoActual;
            cuenta.setSaldoActual(0);
        } else {
            cuenta.setSaldoActual(saldoActual - cantidadRetirar);
        }
        JOptionPane.showMessageDialog(null, "Ud ha retirado " + cantidadRetirar + " pesos de la cuenta.\n"
                + "Su saldo actual es de : $" + cuenta.getSaldoActual());
    }

    public void extraccionRapida(CuentaBancaria cuenta) {
        double saldoActual = cuenta.getSaldoActual();
        double cantidadRetirar = saldoActual * 0.2;

        if (saldoActual < cantidadRetirar) {
            JOptionPane.showMessageDialog(null, "No se puede ingresar la extraccion.\n"
                    + "Su saldo es insuficiente.");
        } else {
            cuenta.setSaldoActual(saldoActual - cantidadRetirar);
        }
        JOptionPane.showMessageDialog(null, "Usted retiro 20% de su saldo total \n"
                + "Su saldo actual es de : $" + cuenta.getSaldoActual());
    }

    public void consultarSaldo(CuentaBancaria cuenta) {
        JOptionPane.showMessageDialog(null, "Su saldo actual es de: $" + cuenta.getSaldoActual());
    }

    public void consultarDatos(CuentaBancaria cuenta) {
        JOptionPane.showMessageDialog(null, "Número de cuenta: " + cuenta.getNumeroCuenta()
                + "\nDNI del cliente: " + cuenta.getDniCliente()
                + "\nSaldo actual : $" + cuenta.getSaldoActual());
    }

}
