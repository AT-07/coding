package org.fundacionjala.coding.franz;

import java.util.Arrays;
import java.util.Collections;
import java.util.StringJoiner;

/**
 * this is a class of shorInner.
 */
public class ShortInner {
    private static final int THREE = 3;

    /**
     * this is a method that invert words inner.
     *
     * @param words is the words to invert
     * @return return words inner inverted
     */
<<<<<<< Updated upstream
    String sortTheInnerContent(final String words) {
=======
    public String sortTheInnerContent(String words) {
>>>>>>> Stashed changes
        String[] listWords = words.split(" ");
        StringJoiner join = new StringJoiner(" ");
        String[] listChars;
        for (String listWord : listWords) {
            listChars = listWord.split("");
            if (listChars.length > THREE) {
                Arrays.sort(listChars, 1, listChars.length - 1,
                        Collections.reverseOrder());
            }
            join.add(String.join("", listChars));

        }
        return join.toString();
    }
}
