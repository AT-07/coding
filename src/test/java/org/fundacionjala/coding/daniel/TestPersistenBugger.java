package org.fundacionjala.coding.daniel;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 *Class that contains tests for our persistentBugger class.
 */
public class TestPersistenBugger {
    private PersistentBugger persistent;

    /**
     * Create our constructors.
     */
    @Before
    public void setUp() {
        persistent = new PersistentBugger();
    }

    /**
     * Test to verify when the input parameter is 3 digits.
     */
    @Test
    public void testCantidadMultiplicadaTresDigitos() {
        final int digitalResult = 999;
        final int expectedResult = 4;
        int resultadOptenido = persistent.cantidadMultiplicada(digitalResult);
        assertEquals(expectedResult, resultadOptenido);
    }

    /**
     * Prueba para verificar cuando el parametro de entrada es 1 digito.
     */
    @Test
    public void testCantidadMultiplicadaUnDigito() {
        final int digitalResult = 9;
        int resultadOptenido = persistent.cantidadMultiplicada(digitalResult);
        assertEquals(0, resultadOptenido);
    }

    /**
     * prueba para verificar cuando el parametro de entrada es 2 digito.
     */
    @Test
    public void testCantidadMultiplicadaDosDigitos() {
        final int digitalResult = 39;
        final int expectedResult = 3;
        int resultadOptenido = persistent.cantidadMultiplicada(digitalResult);
        assertEquals(expectedResult, resultadOptenido);
    }

    /**
     * Test to verify when the number has a 0.
     */
    @Test
    public void testCantidadMultiplicadaConCero() {
        final int digitalResult = 912409;
        int resultadOptenido = persistent.cantidadMultiplicada(digitalResult);
        assertEquals(1, resultadOptenido);
    }
}
