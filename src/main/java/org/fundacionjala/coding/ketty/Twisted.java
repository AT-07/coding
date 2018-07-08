package org.fundacionjala.coding.ketty;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * class twisted.
 */
public class Twisted {

    private static final Map<Integer, Integer> REPLACE = new HashMap<>();
    private static final int THREE = 3;
    private static final int SEVEN = 7;

    static {

        REPLACE.put(THREE, SEVEN);
        REPLACE.put(SEVEN, THREE);
    }

    /**
     * method twisted.
     *
     * @param arrayInt is an array of integer.
     * @return int [] it is a array the return the solution.
     */

    public int[] twisted(final int[] arrayInt) {


        int[] arrayNew = new int[arrayInt.length];
        Arrays.sort(arrayInt);
        for (int i = 0; i <= arrayInt.length - 1; i++) {
            arrayNew[i] = arrayInt[i] == THREE || arrayInt[i] == SEVEN ? REPLACE.get(arrayInt[i]) : arrayInt[i];

        }
        return arrayNew;
    }

}
