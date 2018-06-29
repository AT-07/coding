package org.fundacionjala.coding.ketty;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;


/**
 * test of number rood.
 */
public class DigictRootTest {
    private DigictRoot di;

    /**
     * method before instance digitRoot.
     */
    @Before
    public void setUp() {
        di = new DigictRoot();
    }

    /**
     * verify if number is root.
     * the number 16 is validate with 7, it is root.
     */

    @Test
    public void testDigitRootValidate() {
        final int expected = 7;
        final int actualNumber = 16;
        assertEquals(expected, di.digitRoot(actualNumber));
    }

    /**
     * verify if number is root and validate.
     * the number 493193 is validate with 2, it is root.
     */
    @Test
    public void testDigitRoodValidate1() {
        final int expected = 2;
        final int actualNumber = 493193;
        assertEquals(expected, di.digitRoot(actualNumber));
    }

    /**
     * verify if number not root.
     * number 16 ,it not validate with the number 1.
     */
    @Test
    public void testDigitRootNoValidate() {
        final int expected = 99;
        final int actualNumber = 16;
        assertNotEquals(expected, di.digitRoot(actualNumber));
    }

    /**
     * verify if number is root.
     * number "493193", it number not validate 1.
     */
    @Test
    public void testDigitRootNoValidate1() {
        final int expected = 1;
        final int actualNumber = 493193;
        assertNotEquals(expected, di.digitRoot(actualNumber));
    }
}
