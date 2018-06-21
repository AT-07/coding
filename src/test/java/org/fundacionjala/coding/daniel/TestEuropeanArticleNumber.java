package org.fundacionjala.coding.daniel;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Pruebas para la clase testEuropeanArticleNumber.
 */
public class TestEuropeanArticleNumber {
    private EuropeanArticleNumber ean;
    private static final int[] CADENAUNO = {4, 0, 0, 3, 3, 0, 1, 0, 1, 8, 3, 9, 8};
    private static final int[] CADENADOS = {4, 0, 0, 3, 3, 0, 1, 0, 1, 8, 3, 9, 2};

    /**
     * Constructor de nuestra clase.
     */
    public TestEuropeanArticleNumber() {
        ean = new EuropeanArticleNumber();
    }

    /**
     * prueba para verificar si es verdadero EuropeanArticleNumber.
     */
    @Test
    public void testEsEANCadenaVerdadero() {
        boolean resultado = ean.esEAN("4003301018398");
        assertEquals(true, resultado);
    }

    /**
     * prueba para verificar si es falso EuropeanArticleNumber.
     */
    @Test
    public void testEsEANCadenaFalso() {
        boolean resultado = ean.esEAN("4003301018392");
        assertEquals(false, resultado);
    }

    /**
     * prueba para verificar si el arreglo verificarEAN es verdadero.
     */
    @Test
    public void testVerificarEANArregloVerdadero() {
        boolean resultado = ean.verificarEAN(CADENAUNO);
        assertEquals(true, resultado);
    }

    /**
     * prueba para verificar si el arreglo verificarEAN es falso.
     */
    @Test
    public void testVerificarEANArregloFalso() {
        boolean resultado = ean.verificarEAN(CADENADOS);
        assertEquals(false, resultado);
    }
}
