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
<<<<<<< Updated upstream
    String spinWords(final String sentence) {
=======
    public String spinWords(String sentence) {

>>>>>>> Stashed changes
        String[] word = sentence.split(" ");
        StringJoiner wordSpin = new StringJoiner(" ");
        for (String aWord : word) {
            wordSpin.add(aWord.length() >= LONG_STRING ? new StringBuilder(aWord).reverse() : aWord);
        }
        return wordSpin.toString();
    }
}
