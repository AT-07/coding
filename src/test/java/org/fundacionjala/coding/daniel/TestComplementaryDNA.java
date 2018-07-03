package org.fundacionjala.coding.daniel;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test of the sequence ADN where A=T, T=A, C=G y G=C.
 */
public class TestComplementaryDNA {
    private ComplementaryDNA dna;

    /**
     * Declaration othe constructor.
     */
    @Before
    public void setUp() {
        dna = new ComplementaryDNA();
    }

    /**
     * Test that contain sequence of the ADN.
     */
    @Test
    public void testSecuenciaDNAVerdadera() {
        String resultadoObtenido = dna.secuenciaDNA("CTATTTAGACCAGAATAAAGG");
        assertEquals("GATAAATCTGGTCTTATTTCC", resultadoObtenido);
    }

    /**
     * Test of the sequence DNA  A=T (Adenina = Timina).
     */
    @Test
    public void testSecuenciaDNATiminaAdenina() {
        String resultadoObtenido = dna.secuenciaDNA("AAAA");
        assertEquals("TTTT", resultadoObtenido);
    }

    /**
     * Test of the sequence DNA  T=A(Timina = Adenina).
     */
    @Test
    public void testSecuenciaDNAAdeninaTimina() {
        String resultadoObtenido = dna.secuenciaDNA("TTTT");
        assertEquals("AAAA", resultadoObtenido);
    }

    /**
     * Test of the sequence DNA G=C (Guanina = Citocina).
     */
    @Test
    public void testSecuenciaDNACitocinaGuanina() {
        String resultadoObtenido = dna.secuenciaDNA("GGGG");
        assertEquals("CCCC", resultadoObtenido);
    }

    /**
     * Test of the sequence DNA C=G (Citocina = Guanina).
     */
    @Test
    public void testSecuenciaDNAGuaninaCitocina() {
        String resultadoObtenido = dna.secuenciaDNA("CCCC");
        assertEquals("GGGG", resultadoObtenido);
    }
}
