package org.fundacionjala.coding.yerel;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * test of DigitalRootTest.
 */
public class DigitalRootTest {
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
        final int expectedResult = 7;
        final int actualresult = 16;
        assertEquals(expectedResult, digitalRoot.addDigit(actualresult));
    }

    /**
     * test of a number 942.
     */
    @Test
    public void addDigitNumberTwo() {
        final int expectedResult = 6;
        final int actualresult = 942;
        assertEquals(expectedResult, digitalRoot.addDigit(actualresult));
    }

    /**
     * test of a number 493193.
     */
    @Test
    public void addDigitNumberThree() {
        final int expectedResult = 2;
        final int actualresult = 493193;
        assertEquals(expectedResult, digitalRoot.addDigit(actualresult));
    }
}
