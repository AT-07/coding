package org.fundacionjala.coding.erik;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * this class is DnaTest.
 */
public class DnaTest {
    private Dna test;

    /**
     * this class ini.
     */
    @Before
    public void before() {
        test = new Dna();
    }

    /**
     * this first test.
     */
    @Test
    public void test01() {
        assertEquals("TTTT", test.makeComplement("AAAA"));
    }

    /**
     * this second test.
     */
    @Test
    public void test02() {
        assertEquals("TAACG", test.makeComplement("ATTGC"));
    }

    /**
     * this third test.
     */
    @Test
    public void test03() {
        assertEquals("CATA", test.makeComplement("GTAT"));
    }
}
