package org.fundacionjala.coding.ketty;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * test of CountChar.
 */

public class CountCharTest {
    private CountChar countChar;

    /**
     * before firth.
     */
    @Before
    public void before() {
        countChar = new CountChar();
    }

    /**
     * test of verify that pass.
     */

    @Test
    public void countChartPass() {
        final String phrase = "fizzbuzz";
        final String letter = "z";
        final int expectedResult = 4;

        assertEquals(expectedResult, countChar.countChar(phrase, letter));
    }

    /**
     * test in case the pass a count phrase.
     */
    @Test
    public void countChartPass2() {

        final String phrase = "Fancy fifth fly aloof";
        final String letter1 = "f";
        final int expectedResult = 5;

        assertEquals(expectedResult, countChar.countChar(phrase, letter1));
    }

    /**
     * test it is verify that string phrase and letter failed.
     */
    @Test
    public void countChartFailed() {
        final String phrase = "fizzbuzz";
        final String letter = "f";
        final int expected = 6;
        assertNotEquals(expected, countChar.countChar(phrase, letter));
    }

    /**
     * test it is verify that string phrase and letter failed.
     */
    @Test
    public void countChartFailed1() {
        final String phrase = "Fancy fifth fly aloof";
        final String letter = "f";
        final int expected = 9;
        assertNotEquals(expected, countChar.countChar(phrase, letter));
    }


}
