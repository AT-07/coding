package org.fundacionjala.coding.testdigitalroot;

import org.fundacionjala.coding.digitalroot.DigitalRoot;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Clase para hacer correr todos los Unit Test.
 */
public class TestDigitalRoot {

    private DigitalRoot digitalRoot;

    /**
     * Test para inicializar mi objeto.
     */
    @Before
    public void inicializacion() {
        digitalRoot = new DigitalRoot();
    }

    /**
     * Test#1 para probar la correctitud del metodo.
     */
    @Test
    public void digitalRootTest1True() {
        final int numeroPrueba1 = 19847;
        final int numeroPrueba2 = 2;

        assertTrue(digitalRoot.digitalRoot(numeroPrueba1) == numeroPrueba2);

    }

    /**
     * Test#1 para probar la correctitud del metodo.
     */
    @Test
    public void digitalRootTest2True() {
        final int numeroPrueba1 = 124;
        final int numeroPrueba2 = 7;

        assertTrue(digitalRoot.digitalRoot(numeroPrueba1) == numeroPrueba2);

    }

    /**
     * Test#1 para probar la correctitud del metodo.
     */
    @Test
    public void digitalRootTest3True() {
        final int numeroPrueba1 = 174;
        final int numeroPrueba2 = 3;

        assertTrue(digitalRoot.digitalRoot(numeroPrueba1) == numeroPrueba2);

    }

    /**
     * Test#2  negativo para probar la correctitud del metodo.
     */
    @Test
    public void digitalRootTestFalse() {
        final int numeroPrueba1 = 19847;
        final int numeroPrueba3 = 3;
        assertFalse(digitalRoot.digitalRoot(numeroPrueba1) == numeroPrueba3);
    }
}
