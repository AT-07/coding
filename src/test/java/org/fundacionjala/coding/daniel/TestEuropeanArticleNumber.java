package org.fundacionjala.coding.daniel;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Verification that EAN is a 13-digits barcode consisting of 12-digits.
 * is true or false.
 */
public class TestEuropeanArticleNumber {
    private EuropeanArticleNumber ean;

    /**
     * Constructor of our class.
     */
    public TestEuropeanArticleNumber() {
        ean = new EuropeanArticleNumber();
    }

    /**
     * Verification that by sending a string "4003301018398" we return true.
     */
    @Test
    public void testEsEANCadenaVerdadero() {
        boolean resultado = ean.esEAN("4003301018398");
        assertEquals(true, resultado);
    }

    /**
     * Verification that by sending a string "4003301018392" we return false.
     */
    @Test
    public void testEsEANCadenaFalso() {
        boolean resultado = ean.esEAN("4003301018392");
        assertEquals(false, resultado);
    }

    /**
     * Verification that by sending a string "4003301018398" we return true.
     */
    @Test
    public void testEsEANCadenaModuloCero() {
        boolean resultado = ean.esEAN("4000301010100");
        assertEquals(false, resultado);
    }
}
