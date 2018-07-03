package org.fundacionjala.coding.ketty;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * class twisted.
 */
public class Twisted {


    /**
     * method twisted.
     *
     * @param arrayInteger is an array of integer.
     * @return int [] it is a array the return the solution.
     */

    public int[] twisted(final int[] arrayInteger) {
        final Map<Integer, Integer> mapTwisted = new HashMap<>();
        final int numberThree = 3;
        final int numberSeven = 7;
        mapTwisted.put(numberThree, numberSeven);
        mapTwisted.put(numberSeven, numberThree);

        int[] arrayNew = new int[arrayInteger.length];
        Arrays.sort(arrayInteger);
        for (int i = 0; i <= arrayInteger.length - 1; i++) {
            if (arrayInteger[i] == numberThree || arrayInteger[i] == numberSeven) {
                arrayNew[i] = mapTwisted.get(arrayInteger[i]);
            } else {
                arrayNew[i] = arrayInteger[i];
            }

        }
        return arrayNew;

    }

}
