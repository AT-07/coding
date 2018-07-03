package org.fundacionjala.coding.ana;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Before;
import org.junit.Test;

/**
 * number digital root of sum for see only result.
 *
 * @author Ana Maria Mamani Zenteno.
 */
public class DigitalTest {
    private Digital digital;


    /**
     * call to tha class Digital.
     */
    @Before
    public void setUp() {
        digital = new Digital();
    }

    /**
     * Test for take the sum of digit.
     */
    @Test
    public void testDigitalDigitalRoot() {
        final int value16 = 16;
        final int expected7 = 7;
        assertEquals(expected7, digital.digitalRoot(value16));
    }

    /**
     * Test for take the sum of one digit.
     */
    @Test
    public void testDigitalDigitalRootOneDigital() {
        final int value5 = 5;
        final int expected5 = 5;
        assertEquals(expected5, digital.digitalRoot(value5));
    }

    /**
     * Test for take the sum of more digit.
     */
    @Test
    public void testDigitalDigitalRootOneDigitalValor() {
        final int value493193 = 493193;
        final int expected2 = 2;

        assertEquals(expected2, digital.digitalRoot(value493193));
    }

    /**
     * Test for take the sum of digit incorrect.
     */
    @Test
    public void testDigitalDigitalRootFalse() {
        final int value493193 = 493193;
        final int expected3 = 3;
        assertFalse(expected3 == digital.digitalRoot(value493193));
    }
}
