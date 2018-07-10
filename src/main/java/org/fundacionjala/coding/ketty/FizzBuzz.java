package org.fundacionjala.coding.ketty;

import java.util.StringJoiner;

/**
 * @author ketty camacho.
 * class fizzbuzz.
 */
public class FizzBuzz {
    private static final int THREE = 3;
    private static final int FIVE = 5;

    /**
     * @param limit of number it is validate.
     * @return a string FIZZ FUZZ FIZZBUZZ.
     */


    public String getFizzBuzz(int limit) {
        StringJoiner joiner = new StringJoiner(" ");

        for (int i = 1; i <= limit; i++) {
            joiner.add(fizzBuzzMethod(i));
        }
        return joiner.toString();
    }

    /**
     * @param number list of Fizz Buzz limit number.
     * @return string of number.
     */

    public String fizzBuzzMethod(int number) {
        if (number % THREE == 0 && number % FIVE == 0) {
            return "FizzBuzz";
        }
        if (number % FIVE == 0) {
            return "Buzz";
        }
        if (number % THREE == 0) {
            return "Fizz";
        }
        return String.valueOf(number);
    }

}
