package org.fundacionjala.coding.yerel;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * test of DigitalRootTest.
 */
public class DigitalRootTest {
    private static final int NUMBER_SEVEN = 7;
    private static final int NUMBER_SIX = 6;
    private static final int NUMBER_TWO = 2;
    private static final int NUMBER_16 = 16;
    private static final int NUMBER_942 = 942;
    private static final int NUMBER_493193 = 493193;
    private DigitalRoot digitalRoot;

    /**
     * instance of DigitalRoot.
     */
    @Before
    public void setUp() {
        digitalRoot = new DigitalRoot();
    }

    /**
     * test of a number 16.
     */
    @Test
    public void addDigit() {
        assertEquals(NUMBER_SEVEN, digitalRoot.addDigit(NUMBER_16));
    }

    /**
     * test of a number 942.
     */
    @Test
    public void addDigitNumberTwo() {
        assertEquals(NUMBER_SIX, digitalRoot.addDigit(NUMBER_942));
    }

    /**
     * test of a number 493193.
     */
    @Test
    public void addDigitNumberThree() {
        assertEquals(NUMBER_TWO, digitalRoot.addDigit(NUMBER_493193));
    }
}
