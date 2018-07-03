package org.fundacionjala.coding.ketty;

import java.util.StringJoiner;

/**
 * this is class verify if a string is a SPIN WORD.
 */

public class SpinWords {

    private static final int LIMIT_LETTER = 5;

    /**
     * @param phrase it method for verify if a string can to be a Spin Word.
     * @return a string.
     */

    public String getSpinWord(final String phrase) {
        StringJoiner newPhrase = new StringJoiner(" ");
        String[] word = phrase.split(" ");
        for (String wordPart : word) {
            newPhrase.add(wordPart.length() < LIMIT_LETTER ? wordPart : new StringBuilder(wordPart).reverse());

        }
        return newPhrase.toString().trim();
    }
}
