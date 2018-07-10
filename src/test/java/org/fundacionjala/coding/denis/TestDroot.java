package org.fundacionjala.coding.denis;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * class principal of test.
 */
public class TestDroot {
    private Droot data;

    /**
     * init of object.
     */
    @Before
    public void before() {
        data = new Droot();
    }

    /**
     * test of method persistent.
     */
    @Test
    public void testPersistentPersistentPass() {
        final int dataValue = 16;
        final int espectetResult = 7;
        assertEquals(espectetResult, data.digitalRoot(dataValue));

    }

    /**
     * test fail of method persistent.
     */
    @Test
    public void testPersistentPersistentFail() {
        final int dataValue = 11;
        final int espectetResult = 3;
        assertNotEquals(espectetResult, data.digitalRoot(dataValue));
    }
}
