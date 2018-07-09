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
     * @param number list of Fizz Buzz limit number.
     * @return string of number.
     */

    public String fizzBuzzMethod(int number) {


        StringJoiner fizBuz = new StringJoiner(" ");
        for (int i = 1; i <= number; i++) {

            if (i % THREE == 0) {
                fizBuz.add("Fizz");
            }
            if (i % FIVE == 0) {
                fizBuz.add("Buzz");

            }
            if (i % THREE != 0 && i % FIVE != 0) {
                String num = String.valueOf(i);
                fizBuz.add(num);
            }
        }
        return fizBuz.toString();
    }

}
