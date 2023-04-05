/*
Crear una clase NIF que se usará para mantener DNIs
con su correspondiente letra (NIF). Los atributos 
serán el número de DNI (entero largo) y la letra 
(String o char) que le corresponde
*/
package extra02;

import java.util.Scanner;

/**
 * @author TKBio
 */
public class NIF {

    private long dni;
    private char letra;

    public NIF() {
        dni = 0;
        letra = '-';
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public void crearNif() {
        Scanner sc = new Scanner(System.in);
        System.out.println("========== NIF ===========");
        System.out.println("Introduce el número de DNI: ");
        dni = sc.nextLong();
        letra = calcularLetra(dni % 23);
    }

    public void mostrar() {
        System.out.println("--------------------------");
        String nif = String.format("%08d", dni) + "-" + Character.toUpperCase(letra);
        System.out.println(nif);
    }

    private char calcularLetra(long resto) {
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N',
            'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        return letras[(int) resto];
    }
}
