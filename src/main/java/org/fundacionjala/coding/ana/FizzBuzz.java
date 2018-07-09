package org.fundacionjala.coding.ana;

import java.util.StringJoiner;

/**
 * FizzBuzz his the data of into.
 *
 * @author Ana Maria Mamani Zenteno.
 */
public class FizzBuzz {
    private static final int THREE = 3;
    private static final int FIVE = 5;

    /**
     * Method for the number of FizzBuzz.
     *
     * @param number any value.
     * @return a String.
     */
    public String numberHundred(int number) {
        StringJoiner numberStr = new StringJoiner("-");
        for (int i = 1; i <= number; i++) {
            numberStr.add(valueNumber(i));
        }
        return numberStr.toString();
    }

    /**
     * @param value send.
     * @return a String.
     */
    public String valueNumber(int value) {
        String numberTurned = String.valueOf(value);
        if (value % THREE == 0 || numberTurned.contains("3")) {
            numberTurned = "Fizz";
        }
        if (value % FIVE == 0 || numberTurned.contains("5")) {
            numberTurned = "Buzz";
        }
        if (value % THREE == 0 && value % FIVE == 0) {
            numberTurned = "FizzBuzz";
        }
        if (numberTurned.contains("3") && numberTurned.contains("5")) {
            numberTurned = "FizzBuzz";
        }
        return numberTurned;
    }
}

