package org.fundacionjala.coding.william;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * TestPersistence class that helps to run all the test cases of the Persistence class.
 */
public class TestPersistence {
    private Persistence persistence;

    /**
     * Method that initializes my object persistence.
     */
    @Before
    public void inicialization() {
        persistence = new Persistence();
    }

    /**
     * Unit Test #1 that verifies the correctness of the persistence method.
     */
    @Test
    public void numberPersistentTest1Correct() {
        final int persistenceDigit = 39;
        final int expectResult = 3;
        assertEquals(expectResult, persistence.persistenceDigit(persistenceDigit));
    }

    /**
     * Unit Test #2 that verifies the correctness of the persistence method.
     */
    @Test
    public void numberPersistentTest2Correct() {
        final int persistenceDigit = 999;
        final int expectResult = 4;
        assertEquals(expectResult, persistence.persistenceDigit(persistenceDigit));

    }

    /**
     * Unit Test #3 that verifies the correctness of the persistence method.
     */
    @Test
    public void numberPersistentTest3Correct() {
        final int persistenceDigit = 1;
        assertEquals(0, persistence.persistenceDigit(persistenceDigit));
    }

    /**
     * Unit Test #4 that verifies the correctness of the persistence method with erroneous values.
     */
    @Test
    public void numberPersistentTestErroneous() {
        final int persistenceDigit = 34567;
        final int expectResult = 4;
        assertNotEquals(expectResult, persistence.persistenceDigit(persistenceDigit));
    }
}
