package org.fundacionjala.coding.erik;

import java.util.StringJoiner;

/**
 * This class is responsible for spin words.
 *
 * @author ErikVargas.
 */
public class SpinWord {
    private static final int LONG_STRING = 5;

    /**
     * This method is for spin word.
     *
     * @param sentence this is param set string.
     * @return string of spin words.
     */

    String spinWords(final String sentence) {

        String[] word = sentence.split(" ");
        StringJoiner wordSpin = new StringJoiner(" ");
        for (String aWord : word) {
            wordSpin.add(aWord.length() >= LONG_STRING ? new StringBuilder(aWord).reverse() : aWord);
        }
        return wordSpin.toString();
    }
}
