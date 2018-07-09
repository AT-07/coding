package org.fundacionjala.coding.ana;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * number persistence.
 *
 * @author Ana Maria Mamani Zenteno.
 */
public class PersistenceTest {
    private Persistence persistence;

    /**
     * call tha class Persistence.
     */
    @Before
    public void setUp() {
        persistence = new Persistence();
    }

    /**
     * test of cant persistence.
     */
    @Test
    public void testPersistenceCantPersistenceComparato() {
        final int value = 39;
        final int expected = 3;
        int result = persistence.cantPersistence(value);
        assertEquals(expected, result);
    }

    /**
     * test of cant persistence with one number.
     */
    @Test
    public void testPersistenceCantPersistenceOneDigit() {
        final int value = 4;
        final int expected = 0;
        int result = persistence.cantPersistence(value);
        assertEquals(expected, result);
    }

    /**
     * test cant of number persistence.
     */
    @Test
    public void testPersistenceCantPersistence() {
        final int value = 999;
        final int expected = 4;
        int result = persistence.cantPersistence(value);
        assertEquals(expected, result);
    }

    /**
     * test with the value in zero.
     */
    @Test
    public void testPersistenceCantPersistenceZero() {
        final int value = 0;
        final int expected = 0;
        int result = persistence.cantPersistence(value);
        assertEquals(expected, result);
    }
}
