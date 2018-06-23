package org.fundacionjala.coding.erik;

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
    public String spinWords(String sentence) {

        String[] word = sentence.split(" ");
        String wordSpin = "";
        for (int i = 0; i < word.length; i++) {
            if (word[i].length() >= LONG_STRING) {
                StringBuilder builder = new StringBuilder(word[i]);
                wordSpin += builder.reverse().append(" ").toString();
            } else {
                wordSpin += word[i].concat(" ");
            }
        }
        return wordSpin.trim();
    }
}
