package org.fundacionjala.coding.erik;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * this is test Class.
 */
public class FizzBuzzTest {
    private FizzBuzz test;

    /**
     * this method initial.
     */
    @Before
    public void ini() {
        test = new FizzBuzz();
    }

    /**
     * this is first unit test.
     */
    @Test
    public void fizzBuzzTestFirst() {
        final int number = 15;
        final String expected = "1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz Fizz 14 FizzBuzz";
        assertEquals(expected, test.fizzBuzz(number));
    }

    /**
     * this is second unit test.
     */
    @Test
    public void fizzBuzzTestSecond() {
        final int number = 10;
        final String expected = "1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz";
        assertEquals(expected, test.fizzBuzz(number));
    }

    /**
     * this is third unit test.
     */
    @Test
    public void fizzBuzzTestThird() {
        final int number = 5;
        final String expected = "1 2 Fizz 4 Buzz";
        assertEquals(expected, test.fizzBuzz(number));
    }
}
