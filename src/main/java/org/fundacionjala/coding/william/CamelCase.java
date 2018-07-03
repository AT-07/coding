package org.fundacionjala.coding.william;

import java.util.StringJoiner;

/**
 * Class that converts the first letter of a word into a capital letter.
 */
public class CamelCase {

    /**
     * Method that converts the first letter of a word into a capital letter.
     *
     * @param word receives a string.
     * @return returns a string.
     */
    public String camelCase(final String word) {
        String[] array = word.split(" ");
        StringJoiner result = new StringJoiner("");
        String[] auxiliary;
        for (int i = 0; i < array.length; i++) {
            auxiliary = array[i].split("");
            auxiliary[0] = auxiliary[0].toUpperCase();
            result.add(String.join("", auxiliary));
        }
        return result.toString();
    }
}
