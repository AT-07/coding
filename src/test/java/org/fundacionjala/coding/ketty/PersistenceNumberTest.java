package org.fundacionjala.coding.ketty;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * this is a class the test if is persistence number.
 */

public class PersistenceNumberTest {

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
        final int numberVerify = 999;
        final int expected = 4;
        assertEquals(expected, persistent.persistence(numberVerify));
    }

    /**
     * this is method test valid if is  number "999" not persistence.
     */
    @Test
    public void testPersistenceFailed() {
        final int numberVerify = 999;
        final int expected = 2;
        assertNotEquals(expected, persistent.persistence(numberVerify));
    }


    /**
     * this is method test valid that is  number "4"  persistence.
     */

    @Test
    public void testPersistencePass1() {
        final int number1 = 4;
        final int expected = 0;
        assertEquals(expected, persistent.persistence(number1));
    }

    /**
     * this is method test valid if number "4" not persistence.
     */

    @Test
    public void testPersistenceFailed1() {
        final int number1 = 4;
        final int expected = 2;
        assertNotEquals(expected, persistent.persistence(number1));
    }


}
