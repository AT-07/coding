package org.fundacionjala.coding.yerel;

import java.util.ArrayList;

/**
 * this class convert word long is major five of sentence.
 */
public class StopSpinWords {

    private static final int LENGTWORD_COVERT = 4;
    private static final String SPACE = " ";

    /**
     * @param sentence is a word to invert.
     * @return word invert.
     */
    public String spinWords(final String sentence) {
        String[] wordsSepare = sentence.split(SPACE);
        ArrayList<String> wordArray = new ArrayList<>();
        for (String word: wordsSepare) {
            wordArray.add(word.length() > LENGTWORD_COVERT ? new StringBuilder(word).reverse().toString() : word);
        }
        return String.join(SPACE, wordArray);
    }
}
