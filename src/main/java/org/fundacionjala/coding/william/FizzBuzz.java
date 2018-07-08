package org.fundacionjala.coding.william;

import java.util.StringJoiner;

/**
 * FizzBuzz class that exchanges the values of digits 3 and 5.
 */
public class FizzBuzz {

    private static final int THREE = 3;
    private static final int FIVE = 5;
    private static final int ZERO = 0;
    private static final int FIFTEEN = 15;

    /**
     * Method that replaces the values 3 and 5 in a chain.
     *
     * @param number is the number where the chain will arrive in numbers.
     * @return returns a string with the numbers exchanged.
     */
    public String fizzBuzz(int number) {
        StringJoiner result = new StringJoiner(" ");
        for (int i = 1; i <= number; i++) {
            result.add(verifyFizzBuzz(i));
        }
        return result.toString();
    }

    /**
     * Intermediate method that helps us to classify a number.
     *
     * @param number number that we send to verify what classification belongs.
     * @return result which is a string that tells us what type it is.
     */
    public String verifyFizzBuzz(int number) {
        String result = String.valueOf(number);

        if (number % THREE != ZERO && number % FIVE != ZERO && !result.contains("3") && !result.contains("5")) {
            result = String.valueOf(number);
        }

        if (number % FIFTEEN == ZERO || result.contains("3") && result.contains("5")) {
            result = "FizzBuzz";
        } else {

            if (number % THREE == ZERO || result.contains("3")) {
                result = "Fizz";
            } else {
                if (number % FIVE == ZERO || result.contains("5")) {
                    result = "Buzz";
                }
            }
        }
        return result;
    }
}
