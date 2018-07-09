package org.fundacionjala.coding.yerel;

/**
 * this class count cuantity of leter in sentense.
 */
public class ExcerciseCountChar {

    /**
     * @param sentence is a sentecense to count.
     * @param letter    it is a specific letter find.
     * @return a number cuantity.
     */
    public int countChar(final String sentence, final char letter) {
        int count = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (Character.toLowerCase(sentence.charAt(i)) == letter) {
                count++;
            }
        }
        return count;
    }
}
