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

            String numberTurned = String.valueOf(i);

            if (i % THREE == 0 || numberTurned.contains("3")) {
                numberTurned = "Fizz";
            }
            if (i % FIVE == 0 || numberTurned.contains("5")) {
                numberTurned = "Buzz";
            }
            if (i % THREE == 0 && i % FIVE == 0) {
                numberTurned = "FizzBuzz";
            }
            if (numberTurned.contains("3") && numberTurned.contains("5")) {
                numberTurned = "FizzBuzz";
            }
            numberStr.add(numberTurned);
        }
        return numberStr.toString();
    }
}

