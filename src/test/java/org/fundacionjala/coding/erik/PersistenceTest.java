package org.fundacionjala.coding.erik;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * This is the class of the persistence Bugger.
 */
public class PersistenceTest {
    private Persistence test;

    /**
     * instances of class number persistence.
     */
    @Before
    public void ini() {
        test = new Persistence();
    }

    /**
     * test unit for the number 999.
     */
    @Test
    public void persistenceTest1() {
        final int testFirstExpected = 4;
        final int testFirstNumber = 999;
        assertEquals(testFirstExpected, test.numberPersistence(testFirstNumber));
    }

    /**
     * test unit for the number 39.
     */
    @Test
    public void persistenceTest2() {
        final int testSecondExpected = 3;
        final int testSecondNumber = 39;
        assertEquals(testSecondExpected, test.numberPersistence(testSecondNumber));
    }

    /**
     * test unit for the number 4.
     */
    @Test
    public void persistenceTest3() {
        final int testThirdExpected = 0;
        final int testThirdNumber = 4;
        assertEquals(testThirdExpected, test.numberPersistence(testThirdNumber));
    }

}
