/*
Crearemos la clase FechaService, en paquete Servicios, que tenga los siguientes métodos:
Método fechaNacimiento que pregunte al usuario día, mes y año de su nacimiento. Luego los pase por parámetro a un nuevo objeto Date. El método debe retornar el objeto Date. Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Método fechaActual que cree un objeto fecha con el día actual. Para esto usaremos el constructor vacío de la clase Date. Ejemplo: Date fechaActual = new  Date();
El método debe retornar el objeto Date.
Método diferencia que reciba las dos fechas por parámetro y retorna la diferencia de años entre una y otra (edad del usuario)
 */
package Servicios;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author TKBio
 */
public class FechaService {

    //Metodo que pide por teclado el dia, mes y anio de su nacimiento
    // y lo convierte en un objeto DATE
    public Date fechaNacimiento() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su dia de nacimiento:");
        int dia = leer.nextInt();
        System.out.println("Ingrese su mes de nacimiento:");
        // los meses en Date empiezan en 0 (enero = 0)
        int mes = leer.nextInt() - 1;
        System.out.println("Ahora, ingrese su año de nacimiento:");
        // los años en Date se cuentan a partir de 1900
        int anio = leer.nextInt() - 1900;
        //Ahora retornamos los valores ingresados con el objeto Date
        return new Date(anio, mes, dia);
    }
    //En este metodo ponemos la fecha actual desde el objeto date

    public Date fechaActual() {
        return new Date();
    }

    //Este metodo calcula la diferencia de años entre dos fechas
    public int diferencia(Date F1, Date F2) {
        Calendar cal1 = Calendar.getInstance();
        cal1.setTime(F1);
        Calendar cal2 = Calendar.getInstance();
        cal2.setTime(F2);
        int diferencia = cal2.get(Calendar.YEAR) - cal1.get(Calendar.YEAR);
        if (cal1.get(Calendar.MONTH) > cal2.get(Calendar.MONTH)
                || (cal1.get(Calendar.MONTH) == cal2.get(Calendar.MONTH) && cal1.get(Calendar.DAY_OF_MONTH) > cal2.get(Calendar.DAY_OF_MONTH))) {
            diferencia--;
        }
        return diferencia;
    }
}
