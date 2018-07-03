package org.fundacionjala.coding.yerel;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * test unit for class FizzBuzz.
 */
public class FizzBuzzTest {
    /**
     * test to validate if list return FizzFuzz.
     */
    @Test
    public void multiplesForNumberFizz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        final List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 151);
        final List<String> listExpeted = Arrays.asList("1", "2", "Fizz", "4", "Buzz", "Fizz",
                "7", "8", "Fizz", "Buzz", "11", "Fizz", "Fizz", "14", "FizzBuzz", "Buzz");
        assertEquals(listExpeted, fizzBuzz.multiplesForNumberOther(list));
    }
}
