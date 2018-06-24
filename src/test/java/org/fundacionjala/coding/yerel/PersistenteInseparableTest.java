package org.fundacionjala.coding.yerel;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * this is a test PersistenteInseparableTest.
 */
public class PersistenteInseparableTest {

    private static final int TESTNUMBER_999 = 999;
    private static final int TESTNUMBER_39 = 39;
    private static final int TESTNUMBER_4 = 4;
    private static final int TESTEXPECTED_3 = 3;
    private static final int TESTEXPECTED_4 = 4;
    private static final int TESTEXPECTED_0 = 0;

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
        assertEquals(TESTEXPECTED_4, persistenteInseparable.persistence(TESTNUMBER_999));
    }

    /**
     * test persistence of a number 39.
     */
    @Test
    public void persistenceTwo() {
        assertEquals(TESTEXPECTED_3, persistenteInseparable.persistence(TESTNUMBER_39));
    }

    /**
     * test persistence of a number 4.
     */
    @Test
    public void persistenceThree() {
        assertEquals(TESTEXPECTED_0, persistenteInseparable.persistence(TESTNUMBER_4));
    }
}
