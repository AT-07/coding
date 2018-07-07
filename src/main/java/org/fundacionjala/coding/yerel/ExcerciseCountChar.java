package org.fundacionjala.coding.yerel;

/**
 * this class count cuantity of leter in sentense.
 */
public class ExcerciseCountChar {

    /**
     * @param sentence is a sentecense to count.
     * @param leter    it is a specific leter find.
     * @return a number cuantity.
     */
    public int countChar(final String sentence, final char leter) {
        int count = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (String.valueOf(sentence.charAt(i)).equalsIgnoreCase(String.valueOf(leter))) {
                count++;
            }
        }
        return count;
    }
}
