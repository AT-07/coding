package org.fundacionjala.coding.ketty;

import java.util.StringJoiner;

/**
 * @author ketty
 * class CamlCase of a string.
 */

public class CamelCase {
    /**
     * @param phrase it is string :
     * @return count.
     */
    public String camelCase(final String phrase) {
        StringJoiner union = new StringJoiner("");
        String[] word = phrase.split(" ");
        for (String chartLetter : word) {
            union.add(Character.toUpperCase(chartLetter.charAt(0)) + chartLetter.substring(1));

        }
        return union.toString().trim();
    }
}
