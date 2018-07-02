package org.fundacionjala.coding.franz;

import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.assertEquals;

/**
 * this is a test Class.
 */
public class FizzBuzzTest {

    private FizzBuzz fizz;
    private static final int LIMIT_FIFTEEN = 15;
    private static final int LIMIT_FIVE = 5;
    private static final int LIMIT_THREE = 3;

    /**
     * this method initial in each test unit.
     */
    @Before
    public void ini() {
        fizz = new FizzBuzz();
    }

    /**
     * this is a test of method fizzBuzz in case limit is a 15.
     */
    @Test
    public void testFizzBuzzLimitFifteen() {
        assertEquals("1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz Fizz 14 FizzBuzz",
                fizz.fizzBuzz(LIMIT_FIFTEEN));
    }

    /**
     * this is a test of method fizzBuzz in case is a 5.
     */
    @Test
    public void testFizzBuzzLimitFive() {
        assertEquals("1 2 Fizz 4 Buzz", fizz.fizzBuzz(LIMIT_FIVE));
    }

    /**
     * this is a test of method fizzBuzz in case is a 3.
     */
    @Test
    public void testFizzBuzzLimitThree() {
        assertEquals("1 2 Fizz", fizz.fizzBuzz(LIMIT_THREE));
    }

}
