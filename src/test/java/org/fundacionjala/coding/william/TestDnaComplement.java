package org.fundacionjala.coding.william;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * Class where we will run the Unit Tests of the DnaComplement class.
 */
public class TestDnaComplement {

    private DnaComplement complement;

    /**
     * Method where we will initialize our complement object.
     */
    @Before
    public void inicialition() {
        complement = new DnaComplement();
    }

    /**
     * Test n° 1 where we validate the correctness of the dnaComplement method.
     */
    @Test
    public void dnaComplementTest1Correct() {
        final String expectedResult = "AGTCAGTAGT";
        final String actualResult = complement.dnaComplement("TCAGTCATCA");
        assertEquals(expectedResult, actualResult);
    }

    /**
     * Test n° 2 where we validate the correctness of the dnaComplement method.
     */
    @Test
    public void dnaComplementTest2Correct() {
        final String expectedResult = "GCTAGCAATCAA";
        final String actualResult = complement.dnaComplement("CGATCGTTAGTT");
        assertEquals(expectedResult, actualResult);
    }

    /**
     * TestIncorrect n° 1 where we validate the correctness of the dnaComplement method.
     */
    @Test
    public void dnaComplementTest3Incorrect() {
        final String expectedResult = "TCGACTGCTCA";
        final String actualResult = complement.dnaComplement("CTACGTACGCT");
        assertNotEquals(expectedResult, actualResult);
    }
}
