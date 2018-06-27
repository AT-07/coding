package org.fundacionjala.coding.franz;

import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.assertEquals;

/**
 * this class is a Persistence Test.
 */
public class PersistenceTest {
    private Persistence persist;

    /**
     * this method run first before that Test.
     */
    @Before
    public void ini() {
        persist = new Persistence();
    }

    /**
     * this method is a test of Method persistence.
     */
    @Test
    public void testPersistenceThree() {
        final int actual = 39;
        final int expected = 3;
        assertEquals(expected, persist.persistence(actual));
    }

    /**
     * this method is a test of Method persistence.
     */
    @Test
    public void testPersistenceZero() {
        final int actual = 4;
        final int expected = 0;
        assertEquals(expected, persist.persistence(actual));
    }

    /**
     * this method is a test of Method persistence.
     */
    @Test
    public void testPersistenceTwO() {
        final int actual = 25;
        final int expected = 2;
        assertEquals(expected, persist.persistence(actual));
    }

    /**
     * this method is a test of Method persistence.
     */
    @Test
    public void testPersistenceFour() {
        final int actual = 999;
        final int expected = 4;
        assertEquals(expected, persist.persistence(actual));
    }
}
