/*
En NIFService se dispondrá de los siguientes métodos:
Métodos getters y setters para el número de DNI y la letra.
Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le corresponderá. Una vez calculado, le asigna la letra que le corresponde según
Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la letra en mayúscula; por ejemplo: 00395469-F).
La letra correspondiente al dígito verificador se 
calculará a traves de un método que funciona de la 
siguiente manera: Para calcular la letra se toma el
resto de dividir el número de DNI por 23
(el resultado debe ser un número entre 0 y 22). 
El método debe buscar en un array (vector) de 
caracteres la posición que corresponda al resto de 
la división para obtener la letra correspondiente. 

*/
package Service;

import extra02.NIF;

/**
 *
 * @author TKBio
 */
public class NIFService {

    public static void main(String[] args) {
        NIF nif = new NIF();
        nif.crearNif();
        nif.mostrar();
        
        System.out.println("===========================");
    }
}
