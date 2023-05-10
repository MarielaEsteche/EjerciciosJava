package Main;

import java.util.Date;
import Servicios.FechaService;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

/**
 *
 * @author TKBio
 */
public class Main {

    public static void main(String[] args) {
        FechaService fechaService = new FechaService();
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEE dd MMMM HH:mm:ss zzz yyyy");

        Date fechaNacimiento = fechaService.fechaNacimiento();
        System.out.println("Fecha de nacimiento: " + dateFormat.format(fechaNacimiento));

        Date fechaActual = fechaService.fechaActual();
        System.out.println("Fecha actual: " + dateFormat.format(fechaActual));

        int edad = fechaService.diferencia(fechaNacimiento, fechaActual);
        System.out.println("Edad: " + edad + " años");
    }
}
