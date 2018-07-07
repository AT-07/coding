package org.fundacionjala.coding.yerel;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * this is a test for count char.
 */
public class ExcerciseCountCharTest {
    private ExcerciseCountChar excerciseCountChar;

    /**
     * inzialized a intance of class count char.
     */
    @Before
    public void setUp() {
        excerciseCountChar = new ExcerciseCountChar();
    }

    /**
     * this test is for a fizzbuzz word.
     */
    @Test
    public void countChar() {
        final int expectedResult = 4;
        assertEquals(expectedResult, excerciseCountChar.countChar("fizzbuzz", 'z'));
    }

    /**
     * this test is for a "Fancy fifth fly aloof" sentence.
     */
    @Test
    public void countCharTwo() {
        final int expectedResult = 5;
        assertEquals(expectedResult, excerciseCountChar.countChar("Fancy fifth fly aloof", 'f'));
    }
}
