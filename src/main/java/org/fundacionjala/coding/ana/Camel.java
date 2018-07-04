package org.fundacionjala.coding.ana;

import java.util.StringJoiner;

/**
 * word invert when the word is major that 5.
 *
 * @author Ana Maria Mamani Zenteno.
 */
public class Camel {

    /**
     * Method to convert the first letter to capital.
     *
     * @param str bow in.
     * @return the value String.
     */
    public String camelCase(final String str) {
        StringJoiner word = new StringJoiner("");
        for (String wordSeparate : str.split(" ")) {
            word.add(Character.toUpperCase(wordSeparate.charAt(0)) + wordSeparate.substring(1));
        }
        return word.toString();
    }

}
