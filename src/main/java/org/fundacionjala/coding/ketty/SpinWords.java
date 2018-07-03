package org.fundacionjala.coding.ketty;

/**
 * this is class verify if a string is a SPIN WORD.
 */

public class SpinWords {

    private static final int LIMIT_LETTER = 5;

    /**
     * @param phrase it method for verify if a string can to be a Spin Word.
     * @return a string.
     */

    public String getSpinWord(String phrase) {
        StringBuilder newPhrase = new StringBuilder();
        String[] word = phrase.split(" ");

        for (String wordPart : word) {
            if (wordPart.length() < LIMIT_LETTER) {
                newPhrase.append(" " + wordPart);

            } else {

                StringBuilder reverse = new StringBuilder(wordPart);
                newPhrase.append(" " + reverse.reverse().toString());
            }
        }
        return newPhrase.toString().trim();
    }
}
