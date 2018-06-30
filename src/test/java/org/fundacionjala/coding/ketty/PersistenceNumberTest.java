package org.fundacionjala.coding.ketty;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotEquals;

//import static org.junit.Assert.*;

/**
 * this is a class the test if is persistence number.
 */

public class PersistenceNumberTest {
    static final int NUMBER_VERIFIC = 999;
    static final int NUMBER_1 = 4;

    private PersistenceNumber persistent;

    /**
     * this method is first that perform.
     */

    @Before
    public void before() {
        persistent = new PersistenceNumber();
    }

    /**
     * this is method test valid that is  number "999"  persistence.
     */

    @Test
    public void testPersistencePass() {
        final int expected = 4;
        assertEquals(expected, persistent.persistence(NUMBER_VERIFIC));
    }

    /**
     * this is method test valid if is  number "999" not persistence.
     */
    @Test
    public void testPersistenceFailed() {
        final int expected = 2;
        assertNotEquals(expected, persistent.persistence(NUMBER_VERIFIC));
    }

    /**
     * this is method test verify that the number "999" digit is correct.
     */
    @Test
    public void testContDigictPass() {
        final int expected = 3;
        assertEquals(expected, persistent.contDigict(NUMBER_VERIFIC));

    }

    /**
     * this is method test verify if the number "999" digit is correct.
     */

    @Test
    public void testContDigictFailed() {
        final int expected = 2;
        assertNotEquals(expected, persistent.contDigict(NUMBER_VERIFIC));

    }

    /**
     * this is method test valid that is  number "4"  persistence.
     */

    @Test
    public void testPersistencePass1() {
        final int expected = 0;
        assertEquals(expected, persistent.persistence(NUMBER_1));
    }

    /**
     * this is method test valid if number "4" not persistence.
     */

    @Test
    public void testPersistenceFailed1() {
        final int expected = 2;
        assertNotEquals(expected, persistent.persistence(NUMBER_1));
    }

    /**
     * it is test verify that is cant digit number 4 is correct.
     */

    @Test
    public void testContDigictPass1() {
        final int expected = 1;
        assertEquals(expected, persistent.contDigict(NUMBER_1));

    }

    /**
     * it is test verify if tha cant digit number 4 is correct.
     */

    @Test
    public void testContDigictFailed1() {
        final int expected = 8;

        assertNotEquals(expected, persistent.contDigict(NUMBER_1));

    }


}
