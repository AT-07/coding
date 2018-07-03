package org.fundacionjala.coding.franz;

/**
 * this is a class method.
 */
public class CountCharacters {

    /**
     * .
     *
     * @param str string that count.
     * @param c   charcater of reference.
     * @return cant of characters
     */
    public int charCount(String str, char c) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i, i + 1).equalsIgnoreCase("" + c)) {
                count++;
            }

        }
        return count;
    }
}
