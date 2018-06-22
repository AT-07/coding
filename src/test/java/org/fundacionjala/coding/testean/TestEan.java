package org.fundacionjala.coding.testean;

import org.fundacionjala.coding.ean.Ean;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * Clase que hace correr las pruebas de la clase Ean.
 */
public class TestEan {

    private Ean test;

    /**
     * Test para inicializar mi objeto.
     */
    @Before
    public void test() {
        test = new Ean();
    }

    /**
     * Test para validar mi test True.
     */
    @Test
    public void validateEanTestTrue() {
        assertTrue(test.validate("4003301018398"));
    }

    /**
     * Test para validar mi test False.
     */
    @Test
    public void validateEanTestFalse() {
        assertFalse(test.validate("4003301018392"));
    }
}
