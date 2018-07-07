package org.fundacionjala.coding.ana;


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
        StringBuilder word = new StringBuilder(str.length());
        for (String wordSeparate : str.split(" ")) {
            word.append(Character.toUpperCase(wordSeparate.charAt(0))).append(wordSeparate.substring(1));
        }
        return word.toString();
    }

}
