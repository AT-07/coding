package org.fundacionjala.coding.ana;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * TEST DNA.
 *
 * @author Ana Maria Mamani Zenteno.
 */
public class DnaStrandTest {
    private DnaStrand dnaStrand;

    /**
     * call of the class.
     */
    @Before
    public void setUp() {
        dnaStrand = new DnaStrand();
    }

    /**
     * test for verify of the complement.
     */
    @Test
    public void testDnaStrandMakeComplementOnly() {
        assertEquals("TTTT", dnaStrand.makeComplement("AAAA"));
    }

    /**
     * test for verify the complement convert.
     */
    @Test
    public void testDnaStrandMakeComplementConvert() {
        assertEquals("TAACG", dnaStrand.makeComplement("ATTGC"));
    }

    /**
     * test for verify with distinct.
     */
    @Test
    public void testDnaStrandMakeComplementVerifyDistinct() {
        assertEquals("CATA", dnaStrand.makeComplement("GTAT"));
    }

}

