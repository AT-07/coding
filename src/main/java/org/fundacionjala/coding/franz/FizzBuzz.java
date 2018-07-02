package org.fundacionjala.coding.franz;

import java.util.StringJoiner;

/**
 * this class is FizzBuzz.
 */
public class FizzBuzz {
    private static final int THREE = 3;
    private static final int FIVE = 5;
    private static final int ZERO = 0;

    /**
     * this method run fizzBuzz.
     *
     * @param limit is a limit of fizzBuzz
     * @return string that contains numbers fizzBuzz
     */
    public String fizzBuzz(int limit) {
        StringJoiner joiner = new StringJoiner(" ");
        for (int i = 1; i <= limit; i++) {
            joiner.add(assingFizzBuzz(i));
        }
        return joiner.toString();
    }

    /**
     * this method show fizzBuzz.
     * @param number for check
     * @return fizz, buzz or fizzbuzz depent of case
     */
    public String assingFizzBuzz(int number) {
        if (number % THREE == ZERO && number % FIVE == ZERO) {
            return "FizzBuzz";
        }
        if (number % FIVE == ZERO || String.valueOf(number).contains("5")) {
            return "Buzz";
        }
        if (number % THREE == ZERO || String.valueOf(number).contains("3")) {
            return "Fizz";
        }
        return String.valueOf(number);
    }
}

