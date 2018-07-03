package org.fundacionjala.coding.daniel;

import java.util.Arrays;
import java.util.Collections;
import java.util.StringJoiner;

/**
 * Given a string it is requested to invert the internal characters of the word.
 * in a descending way, excluding the first and last character of the word.
 * example: forgeth my password = ftrogeh my pwssroad.
 */
public class SortInnerContent {

    /**
     * Method that will sort the characters of the word or phrase in descending order.
     *
     * @param cadena word or phrase.
     * @return descending orderly string.
     */
    public String innerContent(final String cadena) {
        String[] separarCadena = cadena.split(" ");
        StringJoiner orden = new StringJoiner(" ");
        String[] contenedor;
        for (int i = 0; i < separarCadena.length; i++) {
            contenedor = separarCadena[i].split("");
            if (separarCadena[i].length() > 2) {
                Arrays.sort(contenedor, 1, contenedor.length - 1, Collections.reverseOrder());
            }
            orden.add(String.join("", contenedor));

        }
        return orden.toString();
    }
}
