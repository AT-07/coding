package org.fundacionjala.coding.ana;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Test for FizzBuzz his the data of into.
 *
 * @author Ana Maria Mamani Zenteno.
 */
public class FizzBuzzTest {
    private FizzBuzz fizzBuzz;

    /**
     * Call of class.
     */
    @Before
    public void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    /**
     * test for any value.
     */
    @Test
    public void testFizzBuzzNumberHundredValue() {
        final int number = 15;
        assertEquals("1-2-Fizz-4-Buzz-Fizz-7-8-Fizz-Buzz-11-Fizz-Fizz-14-FizzBuzz", fizzBuzz.numberHundred(number));
    }

    /**
     * Test for the value 30 with the two condition.
     */
    @Test
    public void testFizzBuzzNumberHundred() {
        final int number = 0;
        assertEquals("", fizzBuzz.numberHundred(number));
    }
}
