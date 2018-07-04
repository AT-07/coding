package org.fundacionjala.coding.daniel;

import java.util.StringJoiner;

/**
 * All words must have their first letter capitalized without spaces.
 */
public class CamelCaseMethod {

    /**
     * Methos that puts the words together and capitalizes the first letter of each word.
     *
     * @param cadena string of words.
     * @return cadena unida con la primera palabra en mayuscula.
     */
    public String camelCase(String cadena) {
        StringJoiner joiner = new StringJoiner("");
        for (String palabra : cadena.split(" ")) {
            joiner.add(palabra.substring(0, 1).toUpperCase() + palabra.substring(1, palabra.length()).toLowerCase());
        }
        return String.join("", joiner.toString());
    }
}
