package org.fundacionjala.coding.william;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * Class to run all Unit Tests of the DigitalRoot class.
 */
public class TestDigitalRoot {

    private DigitalRoot digitalRoot;

    /**
     * Test to initialize my object.
     */
    @Before
    public void inicialization() {
        digitalRoot = new DigitalRoot();
    }

    /**
     * Test#1 to test the correctness of the digitalRoot method.
     */
    @Test
    public void digitalRootTest1Correct() {
        final int digitalNumber = 19847;
        final int expectedResult = 2;
        assertEquals(expectedResult, digitalRoot.digitalRoot(digitalNumber));

    }

    /**
     * Test#2 to test the correctness of the digitalRoot method.
     */
    @Test
    public void digitalRootTest2Correct() {
        final int digitalNumber = 124;
        final int expectedResult = 7;
        assertEquals(expectedResult, digitalRoot.digitalRoot(digitalNumber));

    }

    /**
     * Test#3 to test the correctness of the digitalRoot method.
     */
    @Test
    public void digitalRootTest3Correct() {
        final int digitalNumber = 174;
        final int expectedResult = 3;
        assertEquals(expectedResult, digitalRoot.digitalRoot(digitalNumber));

    }

    /**
     * Test#1 to test the correctness of the digitalRoot method with expected wrong results.
     */
    @Test
    public void digitalRootTestIncorrect() {
        final int digitalNumber = 13579;
        final int expectedResult = 5;
        assertNotEquals(expectedResult, digitalRoot.digitalRoot(digitalNumber));
    }
}
