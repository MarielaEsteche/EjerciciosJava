/*
En esta clase vamos a tener:
Atributos: 
número de cuota, monto total de la cuota, estado de pago, 
fecha de vencimiento, forma de pago.
Relaciones: Una póliza puede tener varias cuotas.
Métodos: getters y setters.
 */
package LaTerceraSeguros;

import java.time.LocalDate;

/**
 *
 * @author TKBio
 */
public class Cuota {

    private int numeroCuota;
    private double montoTotalCuota;
    private boolean pagada;
    private LocalDate fechaVencimiento;
    private String formaPago;

    public Cuota(int numeroCuota, double montoTotalCuota, boolean pagada, LocalDate fechaVencimiento, String formaPago) {
        this.numeroCuota = numeroCuota;
        this.montoTotalCuota = montoTotalCuota;
        this.pagada = pagada;
        this.fechaVencimiento = fechaVencimiento;
        this.formaPago = formaPago;
    }

    public int getNumeroCuota() {
        return numeroCuota;
    }

    public void setNumeroCuota(int numeroCuota) {
        this.numeroCuota = numeroCuota;
    }

    public double getMontoTotalCuota() {
        return montoTotalCuota;
    }

    public void setMontoTotalCuota(double montoTotalCuota) {
        this.montoTotalCuota = montoTotalCuota;
    }

    public boolean isPagada() {
        return pagada;
    }

    public void setPagada(boolean pagada) {
        this.pagada = pagada;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

}
