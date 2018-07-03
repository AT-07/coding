package org.fundacionjala.coding.denis;

import java.util.Arrays;

/**
 * This is the class principal.
 */
public class Twisted {
    /**
     * @param array is the numbers in the other planets.
     * @return numbers correct.
     */
    public Integer[] sortTwisted37(final Integer[] array) {
        final char numTwist = '3';
        final char auxiliary = 'x';
        final char numTwist1 = '7';
        return Arrays.stream(array)
                .map(number -> number.toString().replace(numTwist, auxiliary)
                        .replace(numTwist1, numTwist).replace(auxiliary, numTwist1))
                .map(Integer::parseInt).sorted()
                .map(number -> number.toString().replace(numTwist, auxiliary)
                        .replace(numTwist1, numTwist).replace(auxiliary, numTwist1))
                .map(Integer::parseInt).toArray(Integer[]::new);
    }
}
