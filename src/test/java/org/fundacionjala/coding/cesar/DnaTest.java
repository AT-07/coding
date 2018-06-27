package org.fundacionjala.coding.cesar;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *
 * @author admin-hp
 */
public class DnaTest {
    private Dna dna;

    /**
     * iniciando el before.
     */
    @Before
    public void before() {
        dna = new Dna();

    }

    /**
     * prueba de la cadena ATTGC.
     */
    @Test
    public void testMakeComplemetCadena() {
        String prueba = "ATTGC";
        assertEquals("TAACG", dna.makeComplement(prueba));
    }

    /**
     * prueba de la cadena GTAT.
     */
    @Test
    public void testMakeComplemetCadenaCorta() {
        String prueba = "GTAT";
        assertEquals("CATA", dna.makeComplement(prueba));
    }


}
