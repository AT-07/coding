package org.fundacionjala.coding.william;

import java.util.Arrays;

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
        String auxiliary = Arrays.toString(arrayNumbers).replace("[", "").replace("]", "")
                .replace(" ", "").replace("3", "W").replace("7", "3")
                .replace("W", "7");
        String[] stringArray = auxiliary.split(",");
        Arrays.sort(stringArray);
        auxiliary = Arrays.toString(stringArray).replace("[", "").replace("]", "")
                .replace(" ", "").replace("3", "W").replace("7", "3")
                .replace("W", "7");
        stringArray = auxiliary.split(",");
        return Arrays.asList(stringArray).stream().mapToInt(Integer::parseInt).toArray();
    }
}
