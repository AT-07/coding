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
    private static final int VALUE39 = 39;
    private static final int EXPECTED3 = 3;
    private static final int VALUE4 = 4;
    private static final int VALUE999 = 999;
    private static final int EXPECTED4 = 4;
    private static final int VALUE0 = 0;
    private static final int EXPECTED0 = 0;
    /**
     * call tha class Persistence.
     *
     * @throws Exception after.
     */
    @Before
    public void setUp() throws Exception {
        persistence = new Persistence();
    }

    /**
     * test of cant persistence.
     */
    @Test
    public void testPersistenceCantPersistenceComparato() {
        int result = persistence.cantPersistence(VALUE39);
        assertEquals(EXPECTED3, result);
        System.out.print(result);
    }

    /**
     * test of cant persistence with one number.
     */
    @Test
    public void testPersistenceCantPersistenceOneDigit() {
        int result = persistence.cantPersistence(VALUE4);
        assertEquals(EXPECTED0, result);
    }

    /**
     * test cant of number persistence.
     */
    @Test
    public void testPersistenceCantPersistence() {
        int result = persistence.cantPersistence(VALUE999);
        assertEquals(EXPECTED4, result);
    }

    /**
     * test with the value in zero.
     */
    @Test
    public void testPersistenceCantPersistenceZero() {
        int result = persistence.cantPersistence(VALUE0);
        assertEquals(EXPECTED0, result);
    }
}
