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
        final String expectedResult = "1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz Fizz 14 FizzBuzz 16 17 Fizz 19 "
                + "Buzz Fizz 22 Fizz Fizz Buzz 26 Fizz";
        assertEquals(expectedResult, number.fizzBuzz(actualValue));
    }

    /**
     * Test to validate the correctness of my test method fizzBuzz.
     */
    @Test
    public void fizzBuzzTest2Correct() {
        final int actualValue = 12;
        final String expectedResult = "1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz";
        assertEquals(expectedResult, number.fizzBuzz(actualValue));
    }

    /**
     * Test to validate the correctness of my test method fizzBuzz.
     */
    @Test
    public void fizzBuzzTest3Correct() {
        final int actualValue = 5;
        final String expectedResult = "1 2 Fizz 4 Buzz";
        assertEquals(expectedResult, number.fizzBuzz(actualValue));
    }

    /**
     * Test to validate the correctness of my fizzBuzz method test with an erroneous expected result.
     */
    @Test
    public void fizzBuzzTestIncorrect() {
        final int actualValue = 6;
        final String expectedResult = "1 2 Fizz 4 Buzz Fizz 7";
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

    /**
     * Test to validate the correctness of my test method verifyFizzBuzz.
     */
    @Test
    public void verifyFizzBuzzTest1Correct() {
        final int actualValue = 5;
        final String expectedResult = "Buzz";
        assertEquals(expectedResult, number.verifyFizzBuzz(actualValue));
    }

    /**
     * Test to validate the correctness of my test method verifyFizzBuzz.
     */
    @Test
    public void verifyFizzBuzzTest2Correct() {
        final int actualValue = 31;
        final String expectedResult = "Fizz";
        assertEquals(expectedResult, number.verifyFizzBuzz(actualValue));
    }

    /**
     * Test to validate the correctness of my verifyFizzBuzz method test with an erroneous expected result.
     */
    @Test
    public void verifyFizzBuzzTest3correct() {
        final int actualValue = 15;
        final String expectedResult = "FizzBuzz";
        assertEquals(expectedResult, number.verifyFizzBuzz(actualValue));
    }

    /**
     * Test to validate the correctness of my test method verifyFizzBuzz.
     */
    @Test
    public void verifyFizzBuzzTest4Correct() {
        final int actualValue = 45;
        final String expectedResult = "FizzBuzz";
        assertEquals(expectedResult, number.verifyFizzBuzz(actualValue));
    }

    /**
     * Test to validate the correctness of my verifyFizzBuzz method test with an erroneous expected result.
     */
    @Test
    public void verifyFizzBuzzTest1Incorrect() {
        final int actualValue = 2;
        final String expectedResult = "Fizz";
        assertNotEquals(expectedResult, number.verifyFizzBuzz(actualValue));
    }

    /**
     * Test to validate the correctness of my verifyFizzBuzz method test with an erroneous expected result.
     */
    @Test
    public void verifyFizzBuzzTest2Incorrect() {
        final int actualValue = 60;
        final String expectedResult = "Buzz";
        assertNotEquals(expectedResult, number.verifyFizzBuzz(actualValue));
    }
}
