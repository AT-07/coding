package org.fundacionjala.coding.denis;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * class principal of test.
 */
public class TestPersistent {
    private Persistent data;

    /**
     * init of objet.
     */
    @Before
    public void before() {
        data = new Persistent();
    }

    /**
     * test of method persistent.
     */
    @Test
    public void testPersistentPersistentPass() {
        final int dataValue = 39;
        final int espectetResult = 3;
        final int dataValue1 = 9;
        final int espectetResult1 = 0;
        assertEquals(espectetResult, data.persistent(dataValue));
        assertEquals(espectetResult1, data.persistent(dataValue1));
    }

    /**
     * test fail of method persistent.
     */
    @Test
    public void testPersistentPersistentFail() {
        final int dataValue = 11;
        final int espectetResult = 6;
        assertNotEquals(espectetResult, data.persistent(dataValue));
    }

}
