package org.fundacionjala.coding.erik;

import java.util.StringJoiner;

/**
 * this is class FizzBuzz.
 */
public class FizzBuzz {
    private static final int THREE = 3;
    private static final int FIVE = 5;

    /**
     * this method run fizzBuzz.
     *
     * @param num is limit number.
     * @return words with Fizz,Buzz or FizzBuzz.
     */
    public String fizzBuzzcount(int num) {
        StringJoiner joiner = new StringJoiner(" ");
        for (int i = 1; i <= num; i++) {
            joiner.add(fizzBuzz(i));
        }
        return joiner.toString();
    }

    /**
     * this is method for the numbers Fizz, Buzz or FizzBuzz.
     *
     * @param number is number limit.
     * @return Numbers Fizz, Buzz or FizzBuzz.
     */
    public String fizzBuzz(int number) {
        String numb = String.valueOf(number);
        if (number % THREE == 0 && number % FIVE == 0) {
            return "FizzBuzz";
        }
        if (number % FIVE == 0 || numb.contains("5")) {
            return "Buzz";
        }
        if (number % THREE == 0 || numb.contains("3")) {
            return "Fizz";
        }
        return numb;
    }
}
