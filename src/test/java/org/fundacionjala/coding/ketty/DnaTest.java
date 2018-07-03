package org.fundacionjala.coding.ketty;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotEquals;


/**
 * class DnaTest.
 */

public class DnaTest {
    private Dna adn;

    /**
     * method before create a Dna.
     */
    @Before
    public void before() {
        adn = new Dna();
    }

    /**
     * test verify string letter pass.
     */

    @Test
    public void dnaTestPass() {

        final String letters = "ATTCG";
        final String expectedResult = "TAAGC";

        assertEquals(expectedResult, adn.dna(letters));

    }

    /**
     * test verify String that no pass.
     */
    @Test
    public void dnaTestFailed() {
        final String letters = "ATTCG";
        final String expected = "ATTCC";
        assertNotEquals(expected, adn.dna(letters));
    }
}
