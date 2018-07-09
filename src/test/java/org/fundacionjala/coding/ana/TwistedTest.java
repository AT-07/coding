package org.fundacionjala.coding.ana;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Test JUnit of there is a planet.
 * The values of the digits 3 and 7 are twisted. Our 3 means 7.
 *
 * @author Ana Maria Mamani Zenteno.
 */
public class TwistedTest {
    private Twisted twisted;

    /**
     * call un the class Twisted.
     */
    @Before
    public void setUp() {
        twisted = new Twisted();
    }

    /**
     * Test for the number order.
     */
    @Test
    public void testTwistedSortTwisted37DataOrder() {
        final int[] arrayValue = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        final int[] expected = {1, 2, 7, 4, 5, 6, 3, 8, 9};
        assertArrayEquals(expected, twisted.sortTwisted37(arrayValue));
    }

    /**
     * Test of number messy.
     */
    @Test
    public void testTwistedSortTwisted37DataDesorder() {
        final int[] arrayValue = {4, 2, 1, 3, 5, 6, 9, 8, 7};
        final int[] expected = {1, 2, 7, 4, 5, 6, 3, 8, 9};
        assertArrayEquals(expected, twisted.sortTwisted37(arrayValue));
    }

    /**
     * Test for number greater than 10.
     */
    @Test
    public void testTwistedSortTwisted37Data() {
        final int[] arrayValue = {12, 14, 13};
        final int[] expected = {12, 17, 14};
        assertArrayEquals(expected, twisted.sortTwisted37(arrayValue));
    }
}
