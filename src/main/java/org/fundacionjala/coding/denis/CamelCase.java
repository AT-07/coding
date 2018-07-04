package org.fundacionjala.coding.denis;

import java.util.StringJoiner;

/**
 * this is the class principal.
 */
public class CamelCase {
    private static final int POSZERO = 0;
    private static final int POSONE = 1;
    private static final int SIZE = 2;

    /**
     *
     * @param str is the data with a work.
     * @return string in the work.
     */
    public String camelCase(final String str) {
        if (str.length() < SIZE) {
            return str.length() == POSZERO ? str : str.toUpperCase();
        }
        StringJoiner spectedResult = new StringJoiner("");

        for (String word : str.split(" ")) {
            if (!word.equals("")) {
                spectedResult.add(word.substring(POSZERO, POSONE)
                        .toUpperCase().concat(word.substring(POSONE)));
            }
        }
        return spectedResult.toString();
    }
}
