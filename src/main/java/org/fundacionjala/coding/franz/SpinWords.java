package org.fundacionjala.coding.franz;

import java.util.StringJoiner;

/**
 * This is a class for Spin words.
 */
public class SpinWords {
    private static final int LIMIT_TAM = 4;

    /**
     * this method is a spin words.
     *
     * @param sentence is the words that use for excercise
     * @return words reverse if is a length major to 5 for word
     */
    public String spinWords(String sentence) {

        String[] words = sentence.split(" ");
        StringJoiner wordComplete = new StringJoiner(" ");
        for (String word : words) {
            wordComplete.add(word.length() > LIMIT_TAM ? new StringBuilder(word).reverse() : word);
        }
        return wordComplete.toString();
    }
}
