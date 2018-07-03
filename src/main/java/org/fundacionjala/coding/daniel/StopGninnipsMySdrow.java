package org.fundacionjala.coding.daniel;

import java.util.StringJoiner;

/**
 * Given a string of one or more words, you are asked to return the same string.
 * but with inverted the letters that haved a size larget than or equal to 5.
 */
public class StopGninnipsMySdrow {

    /**
     * Method that compare the  word by word.
     * verifying  his size, if they are older that 5 invest them.
     *
     * @param cadena receives text complete.
     * @return the entire chain inverted.
     */
    public String invertirCadenaCompleta(final String cadena) {
        final int cinco = 5;
        StringJoiner contenedor = new StringJoiner(" ");
        for (String frase : cadena.split(" ")) {
            contenedor.add(frase.length() >= cinco ? new StringBuilder(frase).reverse() : frase);
        }
        return contenedor.toString();
    }
}
