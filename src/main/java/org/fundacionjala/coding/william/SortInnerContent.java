package org.fundacionjala.coding.william;

import java.util.Arrays;
import java.util.Collections;
import java.util.StringJoiner;

/**
 * Class SortInnerContent that realizes the ordering of each word of a string.
 */
public class SortInnerContent {

    private static final int NUMBER = 1;
    private static final int LIMIT = 3;

    /**
     * Method that removes the 1st and last letter of the word and all its content orders it descending.
     *
     * @param value it is a string of words.
     * @return result that is a StringJoiner that I convert to a string.
     */
    public String sortInnerContent(final String value) {
        String[] arrayWords = value.split(" ");
        String[] arrayLetters;
        StringJoiner result = new StringJoiner(" ");
        for (String arrayWord : arrayWords) {
            arrayLetters = arrayWord.split("");
            if (arrayLetters.length > LIMIT) {
                Arrays.sort(arrayLetters, NUMBER, arrayLetters.length - NUMBER, Collections.reverseOrder());
            }
            result.add(String.join("", arrayLetters));
        }
        return result.toString();
    }
}
