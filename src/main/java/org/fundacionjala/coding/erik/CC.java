package org.fundacionjala.coding.erik;

/**
 * this is class CC.
 */
public class CC {
    /**
     * this is method charCount.
     * @param str is a string.
     * @param c is a character.
     * @return cant.
     */
    public int charCount(final String str, char c) {
       int cont = 0;
       char[] cad = str.toLowerCase().toCharArray();
        for (char aCad : cad) {
            if (aCad == c) {
                cont++;
            }
        }
        return  cont;
    }
}
