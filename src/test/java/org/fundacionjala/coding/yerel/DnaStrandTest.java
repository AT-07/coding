package org.fundacionjala.coding.yerel;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * test DnaStrandTest.
 */
public class DnaStrandTest {
    DnaStrand dnaStrand;

    /**
     * create a instance of DnaStrand.
     */
    @Before
    public void setUp() {
        dnaStrand = new DnaStrand();
    }

    /**
     * test unit for ATTGC.
     */
    @Test
    public void makeComplement() {
        String taacg = "TAACG";
        String attgc = "ATTGC";
        assertEquals(taacg,dnaStrand.makeComplement(attgc));
    }

    /**
     * test unit for GTAT.
     */
    @Test
    public void makeComplementTwo() {
        String cata = "CATA";
        String gtat = "GTAT";
        assertEquals(cata,dnaStrand.makeComplement(gtat));
    }

}
