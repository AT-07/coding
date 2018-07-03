package org.fundacionjala.coding.william;

import java.util.stream.IntStream;

/**
 * Class Twisted which exchanges the values of 3 and 7.
 */
public class Twisted {

    /**
     * Method that exchanges the order of the numbers 3 and 7.
     *
     * @param arrayNumbers which is an arrangement of whole numbers.
     * @return arrays of numbers enteros.
     */
    public int[] sortTwisted(final int[] arrayNumbers) {
        return IntStream.of(arrayNumbers)
                .map(e -> Integer.parseInt(String.valueOf(e).replace("3", "x")
                        .replace("7", "3").replace("x", "7")))
                .sorted()
                .map(e -> Integer.parseInt(String.valueOf(e).replace("3", "x")
                        .replace("7", "3").replace("x", "7")))
                .toArray();
    }
}
