package org.fundacionjala.coding.erik;

import java.util.StringJoiner;

/**
 * this is class FizzBuzz.
 */
public class FizzBuzz {
    private static final int THREE = 3;
    private static final int FIVE = 5;

    /**
     * this is method for the numbers Fizz, Buzz or FizzBuzz.
     *
     * @param number is number limit.
     * @return Numbers Fizz, Buzz or FizzBuzz.
     */
    public String fizzBuzz(int number) {
        String numb;
        StringJoiner joiner = new StringJoiner(" ");
        for (int i = 1; i <= number; i++) {
            numb = String.valueOf(i);
            if (i % THREE == 0 && i % FIVE == 0) {
                numb = "FizzBuzz";
            } else {
                if (i % THREE == 0 || numb.contains("3")) {
                    numb = "Fizz";
                } else {
                    if (i % FIVE == 0 || numb.contains("5")) {
                        numb = "Buzz";
                    }
                }
            }
            joiner.add(numb);
        }
        return joiner.toString();
    }
}
