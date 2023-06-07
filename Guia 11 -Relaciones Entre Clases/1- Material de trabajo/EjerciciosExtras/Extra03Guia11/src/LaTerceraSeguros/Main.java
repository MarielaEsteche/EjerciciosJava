/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LaTerceraSeguros;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 *
 * @author TKBio
 */
public class Main {

    public static void main(String[] args) {

        // vamos a crear un cliente
        Cliente cliente = new Cliente("Maria Gomez", 123456789, "mariagomez@ejemplo.com", "Calle Siempre viva 742", "1234567890");

        // vamos a crear un coche
        Vehiculo vehiculo = new Vehiculo("Ford", "Ka", 2010, "Java54VR", "123456789", "Negro", "Tatoo");

        //Creamos una Poliza con formato tal que asi (17/05/2023)
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate fechaInicio = LocalDate.parse("2023-05-17");
        LocalDate fechaFin = LocalDate.parse("2024-05-17");
        String fechaInicioMod = fechaInicio.format(formatter);
        String fechaFinMod = fechaFin.format(formatter);
        Poliza poliza = new Poliza(1, fechaInicioMod, fechaFinMod, 12, "Efectivo", 1000000.0, true, 5000.0, TipoCobertura.TOTAL, cliente, vehiculo);

        //Ahora vamos con las cuotas de la Poliza tambien con formato
        LocalDate fechaVencimiento1 = LocalDate.parse("2023-06-10");
        LocalDate fechaVencimiento2 = LocalDate.parse("2023-07-10");
        LocalDate fechaVencimiento3 = LocalDate.parse("2023-08-10");

        DateTimeFormatter VenMod = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String fechaVencimiento1Formatter = fechaVencimiento1.format(VenMod);
        String fechaVencimiento2Formatter = fechaVencimiento1.format(VenMod);
        String fechaVencimiento3Formatter = fechaVencimiento1.format(VenMod);

        Cuota cuota1 = new Cuota(1, 10000.0, true, fechaVencimiento1, "Efectivo");
        Cuota cuota2 = new Cuota(2, 10000.0, true, fechaVencimiento2, "Efectivo");
        Cuota cuota3 = new Cuota(3, 10000.0, false, fechaVencimiento3, "Efectivo");
        poliza.agregarCuota(cuota1);
        poliza.agregarCuota(cuota2);
        poliza.agregarCuota(cuota3);

        // Obtener información de la póliza
        System.out.println("▒▒▒▒▒▒▒Información de la póliza▒▒▒▒▒▒▒\n");
        System.out.println("Número de póliza: " + poliza.getNumeroPoliza());
        System.out.println("Fecha de inicio: " + poliza.getFechaInicio());
        System.out.println("Fecha de fin: " + poliza.getFechaFin());
        System.out.println("Cantidad de cuotas: " + poliza.getCantidadCuotas());
        System.out.println("Forma de pago: " + poliza.getFormaPago());
        System.out.println("Monto total asegurado: " + poliza.getMontoTotalAsegurado());
        System.out.println("Incluye granizo: " + poliza.isIncluyeGranizo());
        System.out.println("Monto máximo granizo: " + poliza.getMontoMaximoGranizo());
        System.out.println("Tipo de cobertura: " + poliza.getTipoCobertura());
        System.out.println("Cliente: " + poliza.getCliente().getNombreApellido());
        System.out.println("Vehículo: " + poliza.getVehiculo().getMarca() + " " + poliza.getVehiculo().getModelo());

        // Mostrar cuotas de la póliza
        System.out.println("\n▒▒▒▒▒▒▒Cuotas de la póliza▒▒▒▒▒▒▒\n");
        List<Cuota> cuotas = poliza.getCuotas();
        cuotas.stream().map((cuota) -> {
            System.out.println("Número de cuota: " + cuota.getNumeroCuota());
            return cuota;
        }).map((cuota) -> {
            System.out.println("Monto total de la cuota: " + cuota.getMontoTotalCuota());
            return cuota;
        }).map((cuota) -> {
            System.out.println("Pagada: " + cuota.isPagada());
            return cuota;
        }).map((cuota) -> {
            System.out.println("Fecha de vencimiento: " + cuota.getFechaVencimiento());
            return cuota;
        }).map((cuota) -> {
            System.out.println("Forma de pago: " + cuota.getFormaPago());
            return cuota;
        }).forEachOrdered((_item) -> {
            System.out.println("------------------------");
        });

    }
}
