package org.fundacionjala.coding.daniel;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Clase de test de invertir cadena.
 */
public class TestSGMySdrow {
    private StopGninnipsMySdrow stopGMS;

    /**
     * declaracion del constructor que sera de tipo StopGninnipsMySdrow.
     */
    @Before
    public void setUp() {
        stopGMS = new StopGninnipsMySdrow();
    }

    /**
     * test para verificar que una cadena de tamanio 10 se invierta.
     */
    @Test
    public void testInvertirCadenaTamanio10() {
        String resultadoEsperado = stopGMS.invertirCadenaCompleta("Deprecated");
        assertEquals("detacerpeD", resultadoEsperado);
    }

    /**
     * test que verificara  una cadena de tamanio 4 no se invierte.
     */
    @Test
    public void testInvertirCadenaTamanio4() {
        String resultadoEsperado = stopGMS.invertirCadenaCompleta("solo");
        assertEquals("solo", resultadoEsperado);
    }

    /**
     * test para verificar una cadena vacia no ase nada.
     */
    @Test
    public void testInvertirCadenaTamanioVacio() {
        String resultadoEsperado = stopGMS.invertirCadenaCompleta("");
        assertEquals("", resultadoEsperado);
    }

    /**
     * test que verificara varias palabras que lo invierte los de tamanio mayores e igual a 5.
     */
    @Test
    public void testInvertirCadena() {
        String resultadoEsperado = stopGMS.invertirCadenaCompleta("Son test cases completos que contienen detalles");
        assertEquals("Son test sesac sotelpmoc que neneitnoc sellated", resultadoEsperado);
    }
}
