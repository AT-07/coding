package org.fundacionjala.coding.ketty;

/**
 * @author ketty camacho Vasquez.
 * class CamlCase of a string.
 */

public class CamelCase {
    /**
     * @param phrase it is string :
     * @return count.
     */
    public String camelCase(final String phrase) {
        StringBuilder union = new StringBuilder();
        int count = 0;
        String[] word = phrase.split(" ");

        for (String chartLetter : word) {

            union.append(chartLetter.toUpperCase().charAt(count)).append(chartLetter.substring(count + 1));
        }
        return union.toString().trim();
    }
}
