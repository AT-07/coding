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
            boolean dataFizz = String.valueOf(res).contains("3");
            boolean dataBuzz = String.valueOf(res).contains("5");
            if (res % FIZZCONT == 0 && res % BUZZCONT == 0 || dataFizz && dataBuzz
                    || res % FIZZCONT == 0 && dataBuzz || res % BUZZCONT == 0 && dataFizz) {
                espectedResult.add("FizzBuzz");
            } else {
                if (res % FIZZCONT == 0 || String.valueOf(res).contains("3")) {
                    espectedResult.add("Fizz");
                } else {
                    if (res % BUZZCONT == 0 || String.valueOf(res).contains("5")) {
                        espectedResult.add("Buzz");
                    } else {
                        espectedResult.add(String.valueOf(res));
                    }
                }
            }
        }

        return espectedResult.toString();
    }
}
