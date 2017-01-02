
package test;

import numerosapalabras.NumerosAPalabras;

/**
 *
 * @author Martin Corrales
 */
public class testEnteroAPalabras {
        public static void main(String[] args) {
        NumerosAPalabras nap = new NumerosAPalabras();
        int x = 2000020;
        while (x < 2000060) {
            System.out.println(nap.convertNumbertoWords(x));
            x++;
        }
    }
}
