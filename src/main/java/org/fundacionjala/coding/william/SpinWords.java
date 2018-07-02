package org.fundacionjala.coding.william;

import java.util.StringJoiner;

/**
 * SpinWords class that works with strings of words.
 */
public class SpinWords {

    private static final int MAXIMUN_SIZE = 5;

    /**
     * Method to revert those words in a String that its size is more than 5 characters.
     *
     * @param stringNew is a String.
     * @return result.
     */
    public String spinWords(final String stringNew) {
        String[] words = stringNew.split("\\s");
        StringJoiner spinJoiner = new StringJoiner(" ");
        for (String temporary : words) {
            spinJoiner.add(temporary.length() >= MAXIMUN_SIZE ? new StringBuilder(temporary).reverse() : temporary);
        }
        return spinJoiner.toString();
    }
}
