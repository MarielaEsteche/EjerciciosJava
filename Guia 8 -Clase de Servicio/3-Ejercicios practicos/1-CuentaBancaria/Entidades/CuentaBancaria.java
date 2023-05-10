package Entidades;

/**
 *
 * @author TKBio
 */
public class CuentaBancaria {

    //Atributos
    private long numeroCuenta;
    private long dniCliente;
    public double saldoActual;

    //constructor vacio
    public CuentaBancaria() {
    }
    //constructor con parametros

    public CuentaBancaria(long numeroCuenta, long dniCliente, double saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.dniCliente = dniCliente;
        this.saldoActual = saldoActual;
    }

    //metodos geter y setter
    public long getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(long numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(long dniCliente) {
        this.dniCliente = dniCliente;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

}
