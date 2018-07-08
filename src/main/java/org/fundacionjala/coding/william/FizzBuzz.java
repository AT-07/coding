package org.fundacionjala.coding.william;

import java.util.StringJoiner;
import java.util.stream.IntStream;

/**
 * FizzBuzz class that exchanges the values of digits 3 and 5.
 */
public class FizzBuzz {

    private static final int NUMBERTHREE = 3;
    private static final int NUMBERFIVE = 5;
    private static final int NUMBERTEN = 10;
    private static final int NUMBERZERO = 0;

    /**
     * Method that replaces the values 3 and 5 in a chain.
     *
     * @param number is the number where the chain will arrive in numbers.
     * @return returns a string with the numbers exchanged.
     */
    public String fizzBuzz(int number) {
        StringJoiner result = new StringJoiner(" ");
        IntStream.rangeClosed(1, number).forEach(i -> {
            StringBuilder variable = new StringBuilder(String.valueOf(i));
            if (i % NUMBERTHREE != NUMBERZERO && i % NUMBERFIVE != NUMBERZERO && !variable.toString().contains("3")
                    && !variable.toString().contains("5")) {
                result.add(String.valueOf(i));
            }
            if (i % NUMBERTHREE == NUMBERZERO || i / NUMBERTEN == NUMBERTHREE || variable.toString().contains("3")) {
                result.add("FIZZ");
            }
            if (i % NUMBERFIVE == NUMBERZERO || i / NUMBERTEN == NUMBERFIVE || variable.toString().contains("5")) {
                result.add("BUZZ");
            }
        });
        return result.toString();
    }
}
