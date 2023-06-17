package ClaseTres;

/**
 *
 * @author TKBio
 */
public class Tres {

    private static int metodo() {
        int valor = 0;
        try {
            valor = valor + 1;
            valor = valor + Integer.parseInt("W");
            valor = valor + 1;
            System.out.println("Valor final del try: " + valor);
        } catch (NumberFormatException e) {
            valor = valor + Integer.parseInt("W");
            System.out.println("Valor final del catch: " + valor);
        } finally {
            valor = valor + 1;
            System.out.println("Valor final del finally:" + valor);
        }
        valor = valor + 1;
        System.out.println("Valor antes del return: " + valor);
        return valor;
    }

    public static void main(String[] args) {
        try {
            System.out.println(metodo());
        } catch (Exception e) {
            System.err.println("Excepcion en metodo ( ) ");
            e.printStackTrace();
        }
    }
}
/*///////////////////////////////////////////////////////////////////////////////////////

Aca tenemos dos modos de salida segun modificacion del codigo

con el codigo segun el ejercicio solo modificando la sintaxis mal empleada
nos daria esta salida:

run:
Valor final del finally:2
Excepcion en metodo ( ) 
java.lang.NumberFormatException: For input string: "W"
	at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
	at java.lang.Integer.parseInt(Integer.java:580)
	at java.lang.Integer.parseInt(Integer.java:615)
	at ClaseTres.Tres.metodo(Tres.java:17)
	at ClaseTres.Tres.main(Tres.java:30)

/////////////////////////////////////////////////////////////////////////////////////////

**** Con el codigo modificando la linea 17 poniendo valor = valor;
obtendriamos lo que se supone que deberia manejar el codigo en cuanto 
a las excepciones sin volver a llamar a --> integer.parseInt("W") <--- 
ya que esto es lo que produce que no se haga una excepcion esperada

al modificar la linea 17 el resultado es el esperado

run:
Valor final del catch: 1
Valor final del finally:2
Valor antes del return: 3
3

*////////////////////////////////////////////////////////////////////////////////////////
