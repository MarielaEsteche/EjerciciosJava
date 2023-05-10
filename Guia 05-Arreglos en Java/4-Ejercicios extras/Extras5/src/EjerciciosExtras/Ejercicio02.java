/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosExtras;

/**
 *
 * @author TKBio
 */
public class Ejercicio02 {
    public static boolean sonIguales(int[] vector1, int[] vector2) {
        if (vector1.length != vector2.length) {
            return false;
        }
        for (int i = 0; i < vector1.length; i++) {
            if (vector1[i] != vector2[i]) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        int[] v1 = {1, 2, 3, 4};
        int[] v2 = {1, 2, 3, 4};
        int[] v3 = {1, 2, 3, 5};
        
        System.out.println(sonIguales(v1, v2)); // true
        System.out.println(sonIguales(v1, v3)); // false
    }
}