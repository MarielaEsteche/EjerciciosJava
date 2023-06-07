/*
Crea una clase en Java donde declares una variable de tipo array de Strings que
contenga los doce meses del año, en minúsculas. 
A continuación, declara una variable mesSecreto de tipo String, y hazla igual a
un elemento del array (por ejemplo, mesSecreto = mes[9]. 
El programa debe pedir al usuario que adivine el mes secreto. Si el usuario 
acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a intentar adivinar
el mes secreto.  
Un ejemplo de ejecución del programa podría ser este:
Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
¡Ha acertado!

 */
import java.util.Scanner;
/**
 *
 * @author TKBio
 */
public class AdivinarMes {
    public static void main(String[] args) {
        /*
            Declaro la variable de tipo array de String que tiene los 12 meses en minuscula
        */
        String[] mes = {"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","nobiembre","diciembre"};
        /*
            Declaro la variable mesSereto de tipo String donde contendra el mes secreto
            en este  caso es Marzo(como es el mes 3, el indice del array debe ser 2.
        */  
        String mesSecreto = mes[2];
        //Creo un objeto 'Scanner' para interactuar con el usuario
        Scanner leer = new Scanner(System.in);
        String mesAdivinado;
        //Uso un bucle do.while para pedirle al usuario que adivine el mes secreto
        do {
            System.out.println("Adivina el mes secreto:");
            mesAdivinado = leer.nextLine();
            //comparo el mes adivinado con el mes secreto usando "mesAdivinado.equals(mesSecreto) 
            if (mesAdivinado.equals(mesSecreto)) {
                System.out.println("ACERTASTE!!");
                break;
            } else {
                System.out.println("No acertaste, Segui participando!!");
            }
        } while (true);
    }
}
