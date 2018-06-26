package org.fundacionjala.coding.erik;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * This a class test.
 */
public class DigitalRootTest {
    private DigitalRoot test;

    /**
     * This a method initial.
     */
    @Before
    public void ini() {
        test = new DigitalRoot();
    }

    /**
     * This is a first method test of digitalRoot.
     */
    @Test
    public void testDigital1() {
        final int actual = 16;
        final int expected = 7;
        assertEquals(expected, test.digits(actual));
    }

    /**
     * This is a second method test of digitalRoot.
     */
    @Test
    public void testDigital2() {
        final int actual = 942;
        final int expected = 6;
        assertEquals(expected, test.digits(actual));
    }

    /**
     * This is a third method test of digitalRoot.
     */
    @Test
    public void testDigital3() {
        final int actual = 132189;
        final int expected = 6;
        assertEquals(expected, test.digits(actual));
    }

    /**
     * This is a fourth method test of digitalRoot.
     */
    @Test
    public void testDigital4() {
        final int actual = 493193;
        final int expected = 2;
        assertEquals(expected, test.digits(actual));
    }
}
