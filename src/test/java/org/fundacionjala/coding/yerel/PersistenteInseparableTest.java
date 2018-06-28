package org.fundacionjala.coding.yerel;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * this is a test PersistenteInseparableTest.
 */
public class PersistenteInseparableTest {

    private PersistenteInseparable persistenteInseparable;

    /**
     * instances of class persistenteInseparable.
     */
    @Before
    public void setUp() {
        persistenteInseparable = new PersistenteInseparable();
    }

    /**
     * test persistence of number 999.
     */
    @Test
    public void persistence() {
        final int actualResult  = 999;
        final int expectedResult = 4;
        assertEquals(expectedResult, persistenteInseparable.persistence(actualResult));
    }

    /**
     * test persistence of a number 39.
     */
    @Test
    public void persistenceTwo() {
        final int actualResult  = 39;
        final int expectedResult = 3;
        assertEquals(expectedResult, persistenteInseparable.persistence(actualResult));
    }

    /**
     * test persistence of a number 4.
     */
    @Test
    public void persistenceThree() {
        final int actualResult  = 4;
        final int expectedResult = 0;
        assertEquals(expectedResult, persistenteInseparable.persistence(actualResult));
    }
}
