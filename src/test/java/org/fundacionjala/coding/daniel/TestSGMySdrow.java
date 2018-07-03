package org.fundacionjala.coding.daniel;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test for invert String.
 */
public class TestSGMySdrow {
    private StopGninnipsMySdrow stopGMS;

    /**
     * Declaration contructor StopGninnipsMySdrow.
     */
    @Before
    public void setUp() {
        stopGMS = new StopGninnipsMySdrow();
    }

    /**
     * Test given a String with a single word, whit size greater than 5.
     */
    @Test
    public void testInvertirCadenaTamanio10() {
        String resultadoEsperado = stopGMS.invertirCadenaCompleta("Deprecated");
        assertEquals("detacerpeD", resultadoEsperado);
    }

    /**
     * Test given a String with a single word, whit size minor than 5.
     */
    @Test
    public void testInvertirCadenaTamanio4() {
        String resultadoEsperado = stopGMS.invertirCadenaCompleta("solo");
        assertEquals("solo", resultadoEsperado);
    }

    /**
     * Test given a String empty.
     */
    @Test
    public void testInvertirCadenaTamanioVacio() {
        String resultadoEsperado = stopGMS.invertirCadenaCompleta("");
        assertEquals("", resultadoEsperado);
    }

    /**
     * Test given a String with several word, whit sizes minor and greather than 5.
     */
    @Test
    public void testInvertirCadena() {
        String cadenass = "Son test sesac sotelpmoc que neneitnoc sellated";
        String resultadoEsperado = stopGMS.invertirCadenaCompleta("Son test cases completos que contienen detalles");
        assertEquals(resultadoEsperado, cadenass);
    }

    /**
     * Pruebe una Cadena con varias palabras, con tamaños menores than 5.
     */
    @Test
    public void testInvertirCadenaTamanio() {
        String resultadoEsperado = stopGMS.invertirCadenaCompleta("This is a test");
        assertEquals("This is a test", resultadoEsperado);
    }
}
