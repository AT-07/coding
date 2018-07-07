package org.fundacionjala.coding.erik;

import java.util.Arrays;

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

    public String sortTheInnerContent(String words) {
        String[] word = words.split(" ");

        for (int i = 0; i < word.length; i++) {
            if (word[i].length() > LENGTH) {
                char[] contentWord = word[i].substring(NUMBER, word[i].length() - NUMBER).toCharArray();
                Arrays.sort(contentWord);
                String ini = word[i].substring(NUMBER_CIRO, NUMBER);
                String fin = word[i].substring(word[i].length() - NUMBER);
                word[i] = ini.concat(new StringBuilder(new String(contentWord)).reverse().toString().concat(fin));
            }
        }
        return String.join(" ", word);
    }
}
