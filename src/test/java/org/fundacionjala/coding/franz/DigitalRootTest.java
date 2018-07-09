package org.fundacionjala.coding.franz;

import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.assertEquals;

/**
 * this is a class test.
 */
public class DigitalRootTest {
    private DigitalRoot digitalRoot;

    /**
     * this method init first.
     */
    @Before
    public void ini() {
        digitalRoot = new DigitalRoot();
    }

    /**
     * this method is a test of digitalRoot.
     */
    @Test
    public void testDigitalRoot() {
        final int actual = 16;
        final int expected = 7;
        assertEquals(expected, digitalRoot.digitaRoot(actual));
    }
}
