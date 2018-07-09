package org.fundacionjala.coding.denis;

import java.util.List;
import java.util.StringJoiner;

/**
 * . this is the class principal of FizzBuzz.
 */
public class FizzBuzz {
    private static final int FIZZCONT = 3;
    private static final int BUZZCONT = 5;

    /**
     * @param numbers is the data work.
     * @return the spected result.
     */
    public String fizzBuzzCheck(final List<Integer> numbers) {
        StringJoiner espectedResult = new StringJoiner(",");
        for (int res : numbers) {
            espectedResult.add(verifyFizzBuzz(res));
        }
        return espectedResult.toString();
    }

    /**
     * @param res is the date with the work.
     * @return of the string res.
     */
    private String verifyFizzBuzz(int res) {
        final String data = String.valueOf(res);
        boolean dataFizz = data.contains("3");
        boolean dataBuzz = data.contains("5");

        if (res % FIZZCONT == 0 && res % BUZZCONT == 0 || dataFizz && dataBuzz) {
            return "FizzBuzz";
        }
        if (res % BUZZCONT == 0 || data.contains("5")) {
            return "Buzz";
        }
        if (res % FIZZCONT == 0 || data.contains("3")) {
            return "Fizz";
        }

        return data;
    }
}
