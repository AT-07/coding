package org.fundacionjala.coding.denis;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * class principal of test.
 */
public class TestTwisted {
    private Twisted twisted;

    /**
     * ini of objet.
     */
    @Before
    public void before() {
        twisted = new Twisted();
    }

    /**
     * this is the test for the method sortTwisted37 when pass.
     */
    @Test
    public void testTwistedSortTwisted37Pass() {
        final Integer[] spectedResult = {1, 2, 7, 4, 5, 6, 3, 8, 9};
        final Integer[] spectedResult1 = {12, 14, 13};
        final Integer[] spectedResult2 = {2, 7, 4, 3, 9};
        final Integer[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        final Integer[] data1 = {12, 13, 14};
        final Integer[] data2 = {9, 2, 4, 7, 3};


        assertEquals(Arrays.toString(spectedResult), Arrays.toString(twisted.sortTwisted37(data)));
        assertEquals(Arrays.toString(spectedResult1), Arrays.toString(twisted.sortTwisted37(data1)));
        assertEquals(Arrays.toString(spectedResult2), Arrays.toString(twisted.sortTwisted37(data2)));
    }

}
