package org.fundacionjala.coding.franz;

import java.util.Arrays;
import java.util.Collections;
import java.util.StringJoiner;

/**
 * this is a class of shorInner.
 */
public class ShortInner {
    public static final int THREE = 3;

    /**
     * this is a method that invert words inner.
     *
     * @param words is the words to invert
     * @return return words inner inverted
     */
    public String sortTheInnerContent(String words) {
        String[] listWords = words.split(" ");
        StringJoiner join = new StringJoiner(" ");
        String[] listChars;
        for (int i = 0; i < listWords.length; i++) {
            listChars = listWords[i].split("");
            if (listChars.length > THREE) {
                Arrays.sort(listChars, 1, listChars.length - 1,
                        Collections.reverseOrder());
            }
            join.add(String.join("", listChars));

        }
        return join.toString();
    }
}
