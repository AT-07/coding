package org.fundacionjala.coding.ketty;

/**
 * @author ketty Camacho Vasquez.
 * class countChar.
 */

public class CountChar {
    /**
     * @param phrase is the string .
     * @param letter is the character for see count there are exist in the phrase.
     * @return la count of letter exist in phrase.
     */

    public int countChar(final String phrase, final char letter) {
        int count = 0;
        for (char arrayLetter : phrase.toLowerCase().toCharArray()) {
            if (arrayLetter == letter) {
                count++;
            }
        }
        return count;
    }
}
