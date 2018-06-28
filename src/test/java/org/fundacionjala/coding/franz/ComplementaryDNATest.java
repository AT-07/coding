package org.fundacionjala.coding.franz;

import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.assertEquals;

/**
 * this class is a test of class ComplementaryDNA.
 */
public class ComplementaryDNATest {
    private ComplementaryDNA dna;

    /**
     * this method init before the methos of test.
     */
    @Before
    public void ini() {
        dna = new ComplementaryDNA();
    }

    /**
     * this method is a test.
     */
    @Test
    public void testMakeComplementTTT() {
        assertEquals("TTTT", dna.makeComplement("AAAA"));
    }

    /**
     * this method is a test.
     */
    @Test
    public void testMakeComplementTAACG() {
        assertEquals("TAACG", dna.makeComplement("ATTGC"));
    }

    /**
     * this method is a test.
     */
    @Test
    public void testMakeComplementCATA() {
        assertEquals("CATA", dna.makeComplement("GTAT"));
    }
}
