package org.fundacionjala.coding.william;

import java.util.stream.IntStream;

/**
 * Class CountChar.
 */
public class CountChar {

    /**
     * Method that performs the character count of a string.
     *
     * @param cadena input string.
     * @param letra  character that we will compare.
     * @return returns the number of characters that exist in a string.
     */
    public int countChar(final String cadena, final char letra) {
         return (int) IntStream.range(0, cadena.length()).filter(i -> cadena.toLowerCase().charAt(i) == letra).count();
    }
}
