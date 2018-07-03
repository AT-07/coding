package org.fundacionjala.coding.ana;

import java.util.StringJoiner;

/**
 * word invert when the word is major that 5.
 *
 * @author Ana Maria Mamani Zenteno.
 */
public class Word {
    private static final int NUMBER = 5;

    /**
     * A word that has more than 5 letters is inverted.
     *
     * @param words enter the value "this is another test".
     * @return a string.
     */
    public String stringWords(final String words) {
        StringJoiner word = new StringJoiner(" ");
        for (String separatedWord : words.split(" ")) {
            word.add(separatedWord.length() >= NUMBER ? new StringBuilder(separatedWord).reverse() : separatedWord);
        }
        return word.toString();
    }

}

