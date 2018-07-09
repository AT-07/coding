package org.fundacionjala.coding.cesar;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
/**
 * @author admin-hp
 */
public class CountTest {
    private Count co;

    /**
     * initializing before.
     */
    @Before
    public void before() {
        co = new Count();
    }

    /**
     * Uno test whit "fizzbuzz" with 4 letters.
     */
    @Test
    public void testCountValueFord() {
        final String cadena = "fizzbuzz";
        final char elemento = 'z';
        final int esperado = 4;
        assertEquals(esperado, co.countChar(cadena, elemento));
    }

    /**
     *Uno test whit "Fancy fifth fly aloof" with 5 letters.
     */
    @Test
    public void testCountValueFive() {
        final String cadena = "Fancy fifth fly aloof";
        final char elemento = 'f';
        final int esperado = 5;
        assertEquals(esperado, co.countChar(cadena, elemento));
    }
}
