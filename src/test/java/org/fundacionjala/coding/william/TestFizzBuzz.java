package org.fundacionjala.coding.william;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * Class that runs all my tests to verify the correctness of my FizzBuzz class.
 */
public class TestFizzBuzz {

    private FizzBuzz number;

    /**
     * Test to initialize my object number.
     */
    @Before
    public void test() {
        number = new FizzBuzz();
    }

    /**
     * Test to validate the correctness of my test method fizzBuzz.
     */
    @Test
    public void fizzBuzzTestCorrect() {
        final int actualValue = 27;
        final String expectedResult = "1 2 FIZZ 4 BUZZ FIZZ 7 8 FIZZ BUZZ 11 FIZZ FIZZ 14 FIZZ BUZZ 16 17 FIZZ 19"
                + " BUZZ FIZZ 22 FIZZ FIZZ BUZZ 26 FIZZ";
        assertEquals(expectedResult, number.fizzBuzz(actualValue));
    }

    /**
     * Test to validate the correctness of my test method fizzBuzz.
     */
    @Test
    public void fizzBuzzTest2Correct() {
        final int actualValue = 12;
        final String expectedResult = "1 2 FIZZ 4 BUZZ FIZZ 7 8 FIZZ BUZZ 11 FIZZ";
        assertEquals(expectedResult, number.fizzBuzz(actualValue));
    }

    /**
     * Test to validate the correctness of my test method fizzBuzz.
     */
    @Test
    public void fizzBuzzTest3Correct() {
        final int actualValue = 5;
        final String expectedResult = "1 2 FIZZ 4 BUZZ";
        assertEquals(expectedResult, number.fizzBuzz(actualValue));
    }

    /**
     * Test to validate the correctness of my fizzBuzz method test with an erroneous expected result.
     */
    @Test
    public void fizzBuzzTestIncorrect() {
        final int actualValue = 6;
        final String expectedResult = "1 2 FIZZ 4 BUZZ 6";
        assertNotEquals(expectedResult, number.fizzBuzz(actualValue));
    }

    /**
     * Test to validate the correctness of my fizzBuzz method test with an erroneous expected result.
     */
    @Test
    public void fizzBuzzTest2Incorrect() {
        final int actualValue = 12;
        final String expectedResult = "1 2 FIZZ 4 BUZZ FIZZ 7 8 FIZZ BUZZ 11 FIZZ BUZZ";
        assertNotEquals(expectedResult, number.fizzBuzz(actualValue));
    }

    /**
     * Test to validate the correctness of my fizzBuzz method test with an erroneous expected result.
     */
    @Test
    public void fizzBuzzTest3Incorrect() {
        final int actualValue = 1;
        final String expectedResult = "1 2";
        assertNotEquals(expectedResult, number.fizzBuzz(actualValue));
    }
}
