package org.fundacionjala.coding.william;

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
    public int countChar(final String cadena, char letra) {
        int count = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.toLowerCase().charAt(i) == letra) {
                count++;
            }
        }
        return count;
    }
}
