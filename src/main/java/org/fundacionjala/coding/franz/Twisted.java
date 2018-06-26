package org.fundacionjala.coding.franz;

import java.util.Arrays;

/**
 * this is a class Twisted.
 */
public class Twisted {
    /**
     * this method os a sort twisted.
     * @param array numers that sort in twisted
     * @return arrays number sorted
     */
    public Integer[] sortTwisted(Integer[] array) {
        return Arrays.stream(array)
                .map(number -> {
                    return new Integer(Integer.valueOf(number.toString()
                            .replace('3', 't')
                            .replace('7', '3').replace('t', '7')));
                })
                .sorted()
                .map(number -> {
                    return new Integer(Integer.valueOf(number.toString()
                            .replace('3', 't')
                            .replace('7', '3').replace('t', '7')));
                })
                .toArray(Integer[]::new);
    }
}
