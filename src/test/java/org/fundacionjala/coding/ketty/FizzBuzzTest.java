package org.fundacionjala.coding.ketty;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotEquals;


/**
 * test of class FizzBuzz.
 */

public class FizzBuzzTest {

    private FizzBuzz fibu;

    /**
     * first execute.
     */
    @Before
    public void before() {
        fibu = new FizzBuzz();
    }

    /**
     * test of pass of number 15.
     */
    @Test
    public void fizzBuzzMethodTestPass() {
        final int number = 15;
        assertEquals("1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz",
                fibu.getFizzBuzz(number));
    }

    /**
     * test not pass.
     */
    @Test
    public void fizzBuzzMethodTestFailed() {
        final int number = 15;
        assertNotEquals("1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz Fuzz 14 FizzBuzz",
                fibu.getFizzBuzz(number));
    }

}
