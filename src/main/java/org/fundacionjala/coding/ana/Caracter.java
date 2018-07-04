package org.fundacionjala.coding.ana;

/**
 * word invert when the word is major that 5.
 *
 * @author Ana Maria Mamani Zenteno.
 */
public class Caracter {
    /**
     * metodo para contar.
     *
     * @param str value entrante.
     * @param c   value en entrante.
     * @return an int.
     */
    public int charCount(final String str, char c) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.toLowerCase().charAt(i) == c) {
                count++;
            }
        }
        return count;
    }
}
