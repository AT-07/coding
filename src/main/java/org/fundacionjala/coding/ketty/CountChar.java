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

    public int countChar(final String phrase, String letter) {
        int cont = 0;
        for (int i = 0; i <= phrase.length() - 1; i++) {
            if (String.valueOf(phrase.charAt(i)).toLowerCase().equals(letter)) {
                cont++;
            }

        }
        return cont;
    }
}
