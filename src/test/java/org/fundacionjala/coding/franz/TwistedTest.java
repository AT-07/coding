package org.fundacionjala.coding.franz;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * class test.
 */
public class TwistedTest {
    private Twisted twisted;

    /**
     * this is a method initial of each test.
     */
    @Before
    public void ini() {
        twisted = new Twisted();
    }

    /**
     * method test of sortTwisted.
     */
    @Test
    public void testSortTwistedPass() {

        final Integer[] expeted = new Integer[]{1, 2, 7, 4, 5, 6, 3, 8, 9};
        final Integer[] actual = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertEquals(Arrays.toString(expeted), Arrays.toString(twisted.sortTwisted(actual)));
    }

    /**
     * method test of sortTwisted.
     */
    @Test
    public void testSortTwistedPassCaseOne() {

        final Integer[] expeted = new Integer[]{12, 14, 13};
        final Integer[] actual = new Integer[]{12, 13, 14};
        assertEquals(Arrays.toString(expeted), Arrays.toString(twisted.sortTwisted(actual)));
    }

    /**
     * method test of sortTwisted.
     */
    @Test
    public void testSortTwistedPassCaseTwo() {
        final Integer[] expeted = new Integer[]{2, 7, 4, 3, 9};
        final Integer[] actual = new Integer[]{9, 2, 4, 7, 3};
        assertEquals(Arrays.toString(expeted), Arrays.toString(twisted.sortTwisted(actual)));
    }
}
