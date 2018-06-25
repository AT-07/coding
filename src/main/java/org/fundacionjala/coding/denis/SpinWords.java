package org.fundacionjala.coding.denis;

import java.util.StringJoiner;

/**
 * class SpinWords.
 */
public class SpinWords {
    private static final int ZISEWORD = 5;

    /**
     * invest of the words.
     *
     * @param sentence OF STRING INVEST.
     * @return string.
     */
    public String stopSpinWords(String sentence) {

        String[] wordsParts = sentence.split(" ");
        StringJoiner word = new StringJoiner(" ");

        for (String wordsPart : wordsParts) {

            word.add(wordsPart.length() < ZISEWORD ? wordsPart : new StringBuilder(wordsPart).reverse());
        }

        return word.toString();

    }
}
