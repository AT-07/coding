package org.fundacionjala.coding.denis;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * class principal of test.
 */
public class TestDnaStrand {
    private DnaStrand dnaWord;

    /**
     * init of objet.
     */
    @Before
    public void before() {
        dnaWord = new DnaStrand();
    }

    /**
     * test of method persistent.
     */
    @Test
    public void testDnaStrandMakeComplementPass() {
        final String data = "AAAA";
        final String data1 = "ATTGC";
        final String data2 = "GTAT";
        final String espectedResult = "TTTT";
        final String espectedResult1 = "TAACG";
        final String espectedResult2 = "CATA";
        assertEquals(espectedResult, dnaWord.makeComplement(data));
        assertEquals(espectedResult1, dnaWord.makeComplement(data1));
        assertEquals(espectedResult2, dnaWord.makeComplement(data2));
    }
}
