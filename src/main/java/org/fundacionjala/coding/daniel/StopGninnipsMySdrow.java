package org.fundacionjala.coding.daniel;

import java.util.StringJoiner;

/**
 * Given a string of one or more words, you are asked to return the same string.
 * but with inverted the letters that haved a size larget than or equal to 5.
 */
public class StopGninnipsMySdrow {
    private static final int LIMITE = 5;

    /**
     * Method that compare the  word by word.
     * verifying  his size, if they are older that 5 invest them.
     *
     * @param cadena receives text complete.
     * @return the entire chain inverted.
     */
    public String invertirCadenaCompleta(final String cadena) {
        StringJoiner contenedor = new StringJoiner(" ");
        for (String frase : cadena.split(" ")) {
            contenedor.add(frase.length() >= LIMITE ? new StringBuilder(frase).reverse() : frase);
        }
        return contenedor.toString();
    }
}
