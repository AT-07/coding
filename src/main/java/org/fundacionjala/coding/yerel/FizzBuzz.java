package org.fundacionjala.coding.yerel;

import java.util.ArrayList;
import java.util.List;

/**
 * this is a class for find number Fizz or Fuzz.
 */
public class FizzBuzz {
    private static final int NUMBER_THREE = 3;
    private static final int NUMBER_FIVE = 5;
    private static final int NUMBER_ZERO = 0;

    /**
     * @param number to find String FizzBuzz.
     * @return Fizz o Fuzz values.
     */
    public String multiplesForNumber(final int number) {
        String numberString = String.valueOf(number);
        if (number % NUMBER_FIVE == NUMBER_ZERO && number % NUMBER_THREE == NUMBER_ZERO) {
            return "FizzBuzz";
        }
        if (number % NUMBER_FIVE == NUMBER_ZERO || numberString.contains("5")) {
            return "Buzz";
        }
        if (number % NUMBER_THREE == NUMBER_ZERO || numberString.contains("3")) {
            return "Fizz";
        }
        return numberString;
    }

    /**
     * @param number list to find FiZZ and Fuzz.
     * @return list Fizz Fuzz.
     */
    public List<String> multiplesForNumberOther(final List<Integer> number) {
        List<String> listNumberFizzBuzz = new ArrayList<>();
        for (Integer numberOnly: number) {
            listNumberFizzBuzz.add(multiplesForNumber(numberOnly));
        }
        return listNumberFizzBuzz;
    }
}
