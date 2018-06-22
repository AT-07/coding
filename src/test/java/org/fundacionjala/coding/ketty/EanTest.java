package org.fundacionjala.coding.ketty;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * class test de la class Ean.
 */
public class EanTest {

    private Ean ean = new Ean();

    /**
     * test valida 400330101839 es true.
     */
    @Test
    public void testCheksumVerdadero() {
        String num = "4003301018398";

        assertEquals(true, ean.checkSum(num));

    }

    /**
     * test valida  variable string  "4003301018392" su  ultimo digit 2 es False.
     */
    @Test
    public void testCheksumfalse() {

        String num = "4003301018392";
        assertEquals(false, ean.checkSum(num));
    }

    /**
     * test si el valor String 4003301018398 su  ultimo digit 8 es False.
     */

    @Test
    public void testComprobarNumeroV() {
        final int resultadoEan = 72;
        final int compararResult = 8;
        assertEquals(compararResult, ean.comprovacion(resultadoEan));
    }

    /**
     * test si el valor del ultimo es False.
     */
    @Test
    public void testComprobarNumeroF() {
        final int numero3 = 68;
        assertEquals(2, ean.comprovacion(numero3));
    }
}


