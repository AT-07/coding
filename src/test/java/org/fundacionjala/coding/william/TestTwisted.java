package org.fundacionjala.coding.william;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * Class that runs Unit Tests of the Twisted class.
 */
public class TestTwisted {

    private Twisted twisted;

    /**
     * Method that initializes my twisted object.
     */
    @Before
    public void inicialization() {
        twisted = new Twisted();
    }

    /**
     * Test that verifies the correctness of the sortTwisted method.
     */
    @Test
    public void sortTwistedTest1Correct() {
        final int[] arrayValue = {1, 2, 3, 5, 7, 9};
        final int[] expectedResult = {1, 2, 7, 5, 3, 9};
        assertArrayEquals(expectedResult, twisted.sortTwisted(arrayValue));
    }

    /**
     * Test that verifies the correctness of the sortTwisted method.
     */
    @Test
    public void sortTwistedTest2Correct() {
        final int[] arrayValue = {14, 13, 15};
        final int[] expectedResult = {14, 15, 13};
        assertArrayEquals(expectedResult, twisted.sortTwisted(arrayValue));
    }

    /**
     * Test that verifies the correctness of the sortTwisted method with expected wrong results.
     */
    @Test
    public void sortTwistedTestIncorrect() {
        final int[] arrayValue = {15, 13, 16};
        final int[] expectedResultIncorrect = {13, 15, 16};
        assertNotEquals(expectedResultIncorrect, twisted.sortTwisted(arrayValue));
    }
}
