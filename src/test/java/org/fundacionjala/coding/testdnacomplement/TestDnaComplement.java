package org.fundacionjala.coding.testdnacomplement;

import org.fundacionjala.coding.dnacomplement.DnaComplement;
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
        final String expectedResult = "AGTCAGTAG";
        final String actualResult = complement.dnaComplement("TCAGTCATC");
        assertEquals(expectedResult, actualResult);
    }

    /**
     * Test n° 2 where we validate the correctness of the dnaComplement method.
     */
    @Test
    public void dnaComplementTest2Correct() {
        final String expectedResult = "GCTAGCAATCA";
        final String actualResult = complement.dnaComplement("CGATCGTTAGT");
        assertEquals(expectedResult, actualResult);
    }

    /**
     * TestIncorrect n° 1 where we validate the correctness of the dnaComplement method.
     */
    @Test
    public void dnaComplementTest3Incorrect() {
        final String expectedResult = "TCGACTGCTA";
        final String actualResult = complement.dnaComplement("CTACGTACGT");
        assertNotEquals(expectedResult, actualResult);
    }
}
