package org.fundacionjala.coding.daniel;

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
    public String camelCase(final String cadena) {
        StringBuilder almacenar = new StringBuilder();
        for (String palabra : cadena.split(" ")) {
            almacenar.append(palabra.substring(0, 1).toUpperCase()).append(palabra.substring(1, palabra.length()));
        }
        return almacenar.toString();
    }
}
