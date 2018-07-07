package org.fundacionjala.coding.ketty;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * class twisted.
 */
public class Twisted {

    static final Map<Integer, Integer> REPLACE = new HashMap<>();

    /**
     * method twisted.
     *
     * @param arrayInt is an array of integer.
     * @return int [] it is a array the return the solution.
     */

    public int[] twisted(final int[] arrayInt) {

        final int numThree = 3;
        final int numSeven = 7;
        REPLACE.put(numThree, numSeven);
        REPLACE.put(numSeven, numThree);

        int[] arrayNew = new int[arrayInt.length];
        Arrays.sort(arrayInt);
        for (int i = 0; i <= arrayInt.length - 1; i++) {
            arrayNew[i] = arrayInt[i] == numThree || arrayInt[i] == numSeven ? REPLACE.get(arrayInt[i]) : arrayInt[i];

        }
        return arrayNew;

    }

}
