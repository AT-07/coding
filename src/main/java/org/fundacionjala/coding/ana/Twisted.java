package org.fundacionjala.coding.ana;

import java.util.Arrays;
import java.util.StringJoiner;

/**
 * There is a planet.
 * The values of the digits 3 and 7 are twisted. Our 3 means 7.
 *
 * @author Ana Maria Mamani Zenteno.
 */
public class Twisted {
    private static final int SIZE = 9;

    /**
     * Method of the number of Twisted.
     *
     * @param number of an arrangement.
     * @return out of an arrangement.
     */
    public int[] sortTwisted37(final int[] number) {
        Arrays.sort(number);
        int[] result = new int[SIZE];
        StringJoiner word = new StringJoiner(",");
        for (int travelNumber : number) {
            String strNumber = Integer.toString(travelNumber);
            String supersede = strNumber.replace("3", "x").replace("7", "3").replace("x", "7");
            String[] newNumber = word.add(supersede).toString().split("\\D+");
            result = new int[newNumber.length];
            for (int j = 0; j < result.length; j++) {
                result[j] = Integer.parseInt(newNumber[j].trim());
            }
        }

        return result;
    }
}

