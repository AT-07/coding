package org.fundacionjala.coding.william;

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
        StringBuilder result = new StringBuilder();
        for (String anArray : array) {
            result.append(anArray.substring(0, 1).toUpperCase()).append(anArray.substring(1));
        }
        return result.toString();
    }
}
