package org.fundacionjala.coding.franz;

import java.util.StringJoiner;
import java.util.stream.Stream;

/**
 * this class is FizzBuzz.
 */
public class FizzBuzz {
    private static final int THREE = 3;
    private static final int FIVE = 5;
    private static final int ONE = 1;
    private static final int ZERO = 0;

    /**
     * this method show fizzBuzz.
     *
     * @param limit is a limit of fizzBuzz
     * @return string that contains numbers fizzBuzz
     */
    public String fizzBuzz(int limit) {
        StringJoiner joinerString = new StringJoiner(" ");
        Stream.iterate(ONE, i -> i + ONE).limit(limit)
                .map(i -> ((i % THREE) == ZERO && (i % FIVE) == ZERO)
                        || (i.toString().contains("3") && i.toString().contains("5")) ? joinerString.add("FizzBuzz")
                        : ((i % FIVE) == ZERO || i.toString().contains("5")) ? joinerString.add("Buzz")
                        : ((i % THREE) == ZERO || i.toString().contains("3")) ? joinerString.add("Fizz")
                        : joinerString.add(String.valueOf(i))).forEach(System.out::println);
        return joinerString.toString();
    }
}

