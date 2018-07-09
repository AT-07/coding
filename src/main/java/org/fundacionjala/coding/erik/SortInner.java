package org.fundacionjala.coding.erik;

import java.util.Arrays;
import java.util.Collections;

/**
 * this is class for sort inner.
 */
public class SortInner {
    private static final int LENGTH = 3;
    private static final int NUMBER = 1;
    private static final int NUMBER_CIRO = 0;

    /**
     * this class is to order the string.
     *
     * @param words to evaluate.
     * @return the string content in descending order.
     */

    public String sortTheInnerContent(final String words) {
        String[] wordArray = words.split(" ");

        for (int i = 0; i < wordArray.length; i++) {
            if (wordArray[i].length() > LENGTH) {
                String[] contentWord = wordArray[i].substring(NUMBER, wordArray[i].length() - NUMBER).split("");
                Arrays.sort(contentWord, Collections.reverseOrder());
                wordArray[i] = wordArray[i].substring(NUMBER_CIRO, NUMBER)
                        .concat(String.join("", contentWord))
                        .concat(wordArray[i].substring(wordArray[i].length() - NUMBER));
            }
        }
        return String.join(" ", wordArray);
    }
}
