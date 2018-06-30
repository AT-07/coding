package org.fundacionjala.coding.cesar;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 *
 * @author admin-hp
 */
public class TwistedTest {
    private Twisted tw;
    /**
     *Initialitarion Before.
     */
    @Before
    public void before() {
        tw = new Twisted();
    }
    /**
     *Test from String Orden.
     */
    @Test
    public void testTwistedOneNumber() {
        final int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        final int[] output = {1, 2, 7, 4, 5, 6, 3, 8, 9};
        assertArrayEquals(output, tw.sortTwisted(input));
    }

    /**
     *Test from String two numbers.
     */
    @Test
    public void testTwistedTwoNumbers() {
        final int[] input = {12, 13, 14};
        final int[] output = {12, 14, 13};
        assertArrayEquals(output, tw.sortTwisted(input));
    }
    /**
     *Test from Number Onesort.
     */
    @Test
    public void testTwistedOneNumberOnesorte() {
        final int[] input = {9, 2, 4, 7, 3};
        final int[] output = {2, 7, 4, 3, 9};
        assertArrayEquals(output, tw.sortTwisted(input));
    }

}
