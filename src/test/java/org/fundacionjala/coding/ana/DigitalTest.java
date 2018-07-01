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
    private static final int VALUE16 = 16;
    private static final int EXPECTED7 = 7;
    private static final int VALUE5 = 5;
    private static final int EXPECTED5 = 5;
    private static final int VALUE493193 = 493193;
    private static final int EXPECTED2 = 2;
    private static final int EXPECTED3 = 3;

    /**
     * call to tha class Digital.
     */
    @Before
    public void setUp()  {
        digital = new Digital();
    }

    /**
     * Test for take the sum of digit.
     */
    @Test
    public void testDigitalDigitalRoot() {
        assertEquals(EXPECTED7, digital.digitalRoot(VALUE16));
    }

    /**
     * Test for take the sum of one digit.
     */
    @Test
    public void testDigitalDigitalRootOneDigital() {
        assertEquals(EXPECTED5, digital.digitalRoot(VALUE5));
    }

    /**
     * Test for take the sum of more digit.
     */
    @Test
    public void testDigitalDigitalRootOneDigitalValor() {
        assertEquals(EXPECTED2, digital.digitalRoot(VALUE493193));
    }

    /**
     * Test for take the sum of digit incorrect.
     */
    @Test
    public void testDigitalDigitalRootFalse() {
        assertFalse(EXPECTED3 == digital.digitalRoot(VALUE493193));
    }
}
