package org.fundacionjala.coding.denis;

/**
 * .
 */
public class CountCharacter {
    /**
     * @param str is the word a working.
     * @param c   id the character to compared.
     * @return counter of character.
     */
    public int charCount(final String str, final char c) {
        int count = 0;
        final char[] words = str.toLowerCase().toCharArray();
        for (final char cchar : words) {
            if (cchar == c) {
                count++;
            }
        }
        return count;
    }
}
