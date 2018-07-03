package org.fundacionjala.coding.cesar;

import java.util.stream.IntStream;

/**
 *
 * @author admin-hp
 */
public class Twisted {

    /**
     *
     * @param numeros Array from Numbers inputs.
     * @return Array replace.
     */
    public int[] sortTwisted(final int[] numeros) {
        return IntStream.of(numeros)
                .map(e -> Integer.parseInt(String.valueOf(e).replace("3", "x").replace("7", "3").replace("x", "7")))
                .sorted()
                .map(e -> Integer.parseInt(String.valueOf(e).replace("3", "x").replace("7", "3").replace("x", "7")))
                .toArray();
    }

}
