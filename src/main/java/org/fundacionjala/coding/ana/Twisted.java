package org.fundacionjala.coding.ana;

import java.util.Arrays;

/**
 * There is a planet.
 * The values of the digits 3 and 7 are twisted. Our 3 means 7.
 *
 * @author Ana Maria Mamani Zenteno.
 */
public class Twisted {
    /**
     * Method of the number of Twisted.
     *
     * @param number of an arrangement.
     * @return out of an arrangement.
     */
    public int[] sortTwisted37(final int[] number) {
        Arrays.sort(number);
        int[] result = new int[number.length];
        for (int i = 0; i < number.length; i++) {
            result[i] = Integer.parseInt(Integer.toString(number[i])
                    .replace("3", "x")
                    .replace("7", "3")
                    .replace("x", "7"));
        }
        return result;
    }
}

