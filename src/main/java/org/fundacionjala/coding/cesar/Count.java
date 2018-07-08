package org.fundacionjala.coding.cesar;


/**
 * @author admin-hp
 */
public class Count {
    /**
     * @param cadena String precess for count character.
     * @param chr count the number of times that character appears in the string.
     * @return cont to return.
     */
    public int countChar(final String cadena, final char chr) {
        char[] lst = cadena.toLowerCase().toCharArray();
        int cont = 0;
        for (char i : lst) {
            if (i == chr) {
                cont++;
            }
        }
        return cont;
    }
}
