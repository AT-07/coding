package org.fundacionjala.coding.yerel;

import java.util.Arrays;

/**
 * this class short a array planet twisted.
 */
public class Planet {
    /**
     * @param number is a number to convert seven or three.
     * @return number converted.
     */
    public static Integer converNumber(final Integer number) {
        if (String.valueOf(number).contains("7")) {
            return Integer.parseInt(String.valueOf(number).replaceAll("7", "3"));
        }
        if (String.valueOf(number).contains("3")) {
            return Integer.parseInt(String.valueOf(number).replaceAll("3", "7"));
        }
        return number;
    }

    /**
     * @param array to convert number.
     * @return array changed.
     */
    public Integer[] sortTwisted37(final Integer[] array) {
        return Arrays.stream(array)
                .map(Planet::converNumber)
                .sorted()
                .map(Planet::converNumber)
                .toArray(Integer[]::new);
    }
}
