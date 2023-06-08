package Interfaz;

/**
 *
 * @author TKBio
 */
public class Main {
//Instanciacion del objeto de tipo ClaseDePrueba desde InterfazDePrueba
//Segun la guia dice que se puede implementar la interfaz desde la clase
//Despues llame al metodo en el objeto    

    public static void main(String[] args) {
        InterfazDePrueba objeto = new ClaseDePrueba();
        objeto.metodoAbstracto();
    }
}
