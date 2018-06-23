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
    private static final int NUMERO_PRUEBA1 = 19847;
    private static final int NUMERO_PRUEBA2 = 2;
    private static final int NUMERO_PRUEBA3 = 3;
    private static final int NUMERO_PRUEBA4 = 198;
    private static final int NUMERO_PRUEBA5 = 18;


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
    public void digitalRootTest3True() {
        assertTrue(digitalRoot.digitalRoot(NUMERO_PRUEBA1) == NUMERO_PRUEBA2);

    }

    /**
     * Test#2  negativo para probar la correctitud del metodo.
     */
    @Test
    public void digitalRootTestFalse() {
        assertFalse(digitalRoot.digitalRoot(NUMERO_PRUEBA1) == NUMERO_PRUEBA3);

    }

    /**
     * Test#3 para probar la correctitud del metodo sum.
     */
    @Test
    public void sumTest1True() {
        assertTrue(digitalRoot.sum(NUMERO_PRUEBA4) == NUMERO_PRUEBA5);

    }

    /**
     * Test#4  negativo para probar la correctitud del metodo sum.
     */
    @Test
    public void sumTestFalse() {
        assertFalse(digitalRoot.sum(NUMERO_PRUEBA5) == NUMERO_PRUEBA4);
    }
}
