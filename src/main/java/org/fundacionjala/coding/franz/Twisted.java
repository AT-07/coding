package org.fundacionjala.coding.franz;

import java.util.Arrays;

/**
 * this is a class Twisted.
 */
public class Twisted {
    private static final char THREE = '3';
    private static final char FLAG = 't';
    private static final char SEVEN = '7';
    /**
     * this method os a sort twisted.
     *
     * @param array numers that sort in twisted
     * @return arrays number sorted
     */
    public Integer[] sortTwisted(final Integer[] array) {
        return Arrays.stream(array)
                .map(number -> Integer.valueOf(number.toString()
                        .replace(THREE, FLAG).replace(SEVEN, THREE).replace(FLAG, SEVEN))
                ).sorted().map(number -> Integer.valueOf(number.toString()
                        .replace(THREE, FLAG).replace(SEVEN, THREE).replace(FLAG, SEVEN))
                ).toArray(Integer[]::new);
    }
}
