package org.fundacionjala.coding;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *
 * @author admin-hp
 */
public class DigitalTest {
    private Digital digital;

    /**
     * iniciando before.
     */
    @Before
    public void before() {
        digital = new Digital();
    }

    /**
     *numero de 3 digitos .
     */
    @Test
    public void testRootTresDigitos() {
        final int prueba = 745;
        final int respuesta = 7;
        assertEquals(respuesta, digital.root(prueba));
    }

    /**
     *numero gde  8 digitos que entra paraser procesado.
     */
    @Test
    public void testRootLargo() {
        final int prueba = 77854785;
        final int respuesta = 6;
        assertEquals(respuesta, digital.root(prueba));
    }
}
