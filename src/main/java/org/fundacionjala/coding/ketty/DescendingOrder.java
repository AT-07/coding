package org.fundacionjala.coding.ketty;

import java.util.Arrays;
import java.util.Collections;
import java.util.StringJoiner;

/**
 * @author kettycamacho.
 * * class verify that of last to first alphabet in order without move the first letter and last letter.
 */
public class DescendingOrder {
    private static final int NUMBER_LIMIT = 3;

    /**
     * @param text intro for to be result.
     * @return the result of text.
     */
    public String descendingOrder(final String text) {

        StringJoiner ord = new StringJoiner(" ");
        String[] phrase = text.split(" ");

        for (String phraseNew : phrase) {
            String[] n = phraseNew.split("");
            if (n.length >= NUMBER_LIMIT) {

                Arrays.sort(n, 1, n.length - 1, Collections.reverseOrder());

            }
            ord.add(String.join("", n));

        }
        return ord.toString();
    }

}


