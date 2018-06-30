package org.fundacionjala.coding.yerel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * this class inner content desending.
 */
public class WordOrder {

    private static final int INDEX_ONE = 1;
    private static final int INDEX_ZERO = 0;
    private static final String SPACE = " ";
    private static final String INDEX_EMPTY = "";

    /**
     * @param sentence a inner content.
     * @return content inner desendig.
     */
    public String innerContent(final String sentence) {
        List<String> list = new ArrayList<>();
        String[] wordReverte;
        for (String word: sentence.split(SPACE)) {
            wordReverte = word.split(INDEX_EMPTY);
            Arrays.sort(wordReverte, (wordReverte.length > INDEX_ONE) ? INDEX_ONE : INDEX_ZERO, wordReverte.length - INDEX_ONE, Collections.reverseOrder());
            list.add(String.join(INDEX_EMPTY, wordReverte));
        }
        return String.join(SPACE, list);
    }
}
