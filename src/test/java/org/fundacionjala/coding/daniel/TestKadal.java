package org.fundacionjala.coding.daniel;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * clase que contendra los unit test.
 */
public class TestKadal {
    private Kadal kadal;
    private static final int[] CADENAUNO = {4, 0, 0, 3, 3, 0, 1, 0, 1, 8, 3, 9, 8};
    private static final int[] CADENADOS = {4, 0, 0, 3, 3, 0, 1, 0, 1, 8, 3, 9, 2};

    /**
     * Constructor de nuestra clase.
     */
    public TestKadal() {
        kadal = new Kadal();
    }

    /**
     * prueba para verificar si es o no verdadero.
     */
    @Test
    public void testEsKadalVerdadero() {
        boolean verdadero = true;
        boolean resultado = kadal.arregloCadena("4003301018398");
        assertEquals(verdadero, resultado);
    }

    /**
     * prueba para verificar si es falso.
     */
    @Test
    public void testEsKadalFalso() {
        boolean verdadero = false;
        boolean resultado = kadal.arregloCadena("4003301018392");
        assertEquals(verdadero, resultado);
    }

    /**
     * prueba para verificar si es o no verdadero si mandamo sun arreglo.
     */
    @Test
    public void testEsKadalArregloVerdadero() {
        boolean verdadero = true;
        boolean resultado = kadal.esKadal(CADENAUNO);
        assertEquals(verdadero, resultado);
    }

    /**
     * prueba para verificar si es falso si mandamos un arreglo.
     */
    @Test
    public void testEsKadalArregloFalso() {
        boolean verdadero = false;
        boolean resultado = kadal.esKadal(CADENADOS);
        assertEquals(verdadero, resultado);
    }
}
